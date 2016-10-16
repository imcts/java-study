package oops;

class StudExam
{
  String name, gender="여자", grade;
  int ban, no, sum=0, avg;
  
  int [] jum, rank = new int [3];
  
  void input(String nn, int bb, int nnn, int kor, int eng, int mat)
  {
    name = nn;
    ban = bb;
    no = nnn;
    jum = new int[3];
    jum[0] = kor;
    jum[1] = eng;
    jum[2] = mat;
    
    cal();
  }
  
  void inputMan(String nn, int bb, int nnn, int kor, int eng, int mat ,int mil)
  {
    name = nn;
    ban = bb;
    no = nnn;
    jum = new int[4];
    jum[0] = kor;
    jum[1] = eng;
    jum[2] = mat;
    jum[3] = mil;
    
    gender = "남자";
    
    cal();
  }
  
  void cal()
  {
    for(int i = 0; i<rank.length;i++)
      rank[i]=1;
    
    for(int i=0;i<jum.length;i++)
      sum += jum[i];
    
    avg = sum / jum.length;
    
    String [] buf = {"가","양","미","우","수","수"};
    
    grade = buf[avg/10-5 <0 ? 0 :avg/10-5];
  }
  
  void print(int kind)
  {
    System.out.print(ban+"\t");
    System.out.print(no+"\t");
    System.out.print(name+"\t");
    System.out.print(gender+"\t");
    
    for(int i=0;i<jum.length;i++)
      System.out.print(jum[i]+"\t");
    
    if(gender.equals("여자"))
      System.out.print("\t");
    
    System.out.print(sum+"\t");
    System.out.print(avg+"\t");
    System.out.print(grade+"\t");
    System.out.println(rank[kind]);
    
  }
  
}

class ExamRank{
  StudExam [] st;
  
  int [][] rank;
  //0 전체, 1 반별,  2 반 성 별
  
  int [][] max;

  void input(StudExam [] ssss)
  {
    st = ssss;
    rank = new int [3][st.length];
    cal();
    banCount();
    rankCal();
  }
  
  void cal()  //개인 등수 값 넣기
  {
        
    for(int i=0;i<st.length;i++)
    {

      for(int j=0;j<st.length;j++)
      {
        if(st[i].avg<st[j].avg)
        {
          st[i].rank[0]++;
          if(st[i].ban==st[j].ban)
          {
            st[i].rank[1]++;
            
            if(st[i].gender.equals(st[j].gender))
              st[i].rank[2]++;
          }
        }
      }
    }  
  }
  
  void banCount()  //반 갯수 및 반 인원수 넣기
  {
    int maxBan=0;
    
    if(st.length>0)
      maxBan=st[0].ban;
    
    for(int i=0; i <st.length;i++)
    {
      if(maxBan < st[i].ban)
        maxBan = st[i].ban;
    }
    
    max = new int [maxBan+1][3];
    //// 0 전체 ,  1 반  ,  2 성별
      
    for(int i = 0; i <max.length; i++)
    {
      
      for(int j=0;j<st.length ; j++)
      {
        if(i == st[j].ban)
        {
          max[i][1]++;
          
          if(st[j].gender.equals("남자"))
          {
            max[i][2]++;
          }
        }
      }
      
    }
  }
  
  void rankCal()  //출력 요구사항 별 인덱스 만들기
  {
    for(int k =0; k<rank.length;k++)  //k  ---> 전체,  반 ,  성별 을 구분
    {
      for(int i=0;i<rank[k].length;i++)// i  --> 구분된 등수 위치
      {
        for(int j=0;j<st.length;j++) // j ---> 전체 학생 인원
        {
          if(st[j].rank[k]-1 == i)  // 등수와 현재 학생 등수 일치 확인
          {
            
            int add =0;      // 자리를 잡을 누적값 변수
            
            for(int ban = 1; ban<st[j].ban;ban++)//  반의 인원수 추가
            {
              if(k==2)
                add += max[ban][1];//이전 반 인원수 추가
              
              else
                add += max[ban][k];//이전 반 인원수 추가  
            }
            if(k==2 && st[j].gender.equals("여자") )
              add += max[st[j].ban][2];  //우리반 남자만 더한다
            
            rank[k][add+i]= j;  //등수 위치 + 기본 추가 위치 = 현재 학생 위치
  
          }
        }
      }
    }
  }
  
  void print(int kind)
  {
    for(int i=0;i<rank[kind].length;i++)
      st[rank[kind][i]].print(kind);
      
  }
}
public class ClassExam {

  public static void main(String[] args) {


    StudExam [] st = new StudExam[6];
    
    for(int i=0;i<st.length;i++)
      st[i] = new StudExam();
    
    st[1].inputMan("장동건", 2, 1, 88, 87, 86,88);
    st[0].inputMan("장북건", 2, 15, 78, 77, 76,75);
    st[2].inputMan("장서건", 2, 2, 68, 67, 66,62);
    st[3].input("장남건", 1, 6, 98, 97, 96);
    st[4].input("북두신건", 1, 3, 58, 57, 56);
    st[5].input("장북순", 2, 5, 78, 77, 76);
    
    ExamRank rr = new ExamRank();
    
    rr.input(st);
    
    rr.print(2);
  }

}
