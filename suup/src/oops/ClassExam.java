package oops;

class StudExam
{
  String name, gender="����", grade;
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
    
    gender = "����";
    
    cal();
  }
  
  void cal()
  {
    for(int i = 0; i<rank.length;i++)
      rank[i]=1;
    
    for(int i=0;i<jum.length;i++)
      sum += jum[i];
    
    avg = sum / jum.length;
    
    String [] buf = {"��","��","��","��","��","��"};
    
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
    
    if(gender.equals("����"))
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
  //0 ��ü, 1 �ݺ�,  2 �� �� ��
  
  int [][] max;

  void input(StudExam [] ssss)
  {
    st = ssss;
    rank = new int [3][st.length];
    cal();
    banCount();
    rankCal();
  }
  
  void cal()  //���� ��� �� �ֱ�
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
  
  void banCount()  //�� ���� �� �� �ο��� �ֱ�
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
    //// 0 ��ü ,  1 ��  ,  2 ����
      
    for(int i = 0; i <max.length; i++)
    {
      
      for(int j=0;j<st.length ; j++)
      {
        if(i == st[j].ban)
        {
          max[i][1]++;
          
          if(st[j].gender.equals("����"))
          {
            max[i][2]++;
          }
        }
      }
      
    }
  }
  
  void rankCal()  //��� �䱸���� �� �ε��� �����
  {
    for(int k =0; k<rank.length;k++)  //k  ---> ��ü,  �� ,  ���� �� ����
    {
      for(int i=0;i<rank[k].length;i++)// i  --> ���е� ��� ��ġ
      {
        for(int j=0;j<st.length;j++) // j ---> ��ü �л� �ο�
        {
          if(st[j].rank[k]-1 == i)  // ����� ���� �л� ��� ��ġ Ȯ��
          {
            
            int add =0;      // �ڸ��� ���� ������ ����
            
            for(int ban = 1; ban<st[j].ban;ban++)//  ���� �ο��� �߰�
            {
              if(k==2)
                add += max[ban][1];//���� �� �ο��� �߰�
              
              else
                add += max[ban][k];//���� �� �ο��� �߰�  
            }
            if(k==2 && st[j].gender.equals("����") )
              add += max[st[j].ban][2];  //�츮�� ���ڸ� ���Ѵ�
            
            rank[k][add+i]= j;  //��� ��ġ + �⺻ �߰� ��ġ = ���� �л� ��ġ
  
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
    
    st[1].inputMan("�嵿��", 2, 1, 88, 87, 86,88);
    st[0].inputMan("��ϰ�", 2, 15, 78, 77, 76,75);
    st[2].inputMan("�弭��", 2, 2, 68, 67, 66,62);
    st[3].input("�峲��", 1, 6, 98, 97, 96);
    st[4].input("�ϵνŰ�", 1, 3, 58, 57, 56);
    st[5].input("��ϼ�", 2, 5, 78, 77, 76);
    
    ExamRank rr = new ExamRank();
    
    rr.input(st);
    
    rr.print(2);
  }

}
