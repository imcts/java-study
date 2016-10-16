
package oops;
class Con_Stud
{
  String name,gra;
  int [] jum;
  int sum=0,avg, gender=1;
  int [] rank = new int[3];
  String [] gen = {"남자","여자"};
  
  public Con_Stud(String name,int kor, int mat, int eng) {
    
    this.name = name;
    jum = new int[3];
    jum[0] = kor;
    jum[1] = eng;
    jum[2] = mat;
    
    cal();
  }
  
  public Con_Stud(String name,int kor, int mat, int eng,int mil) {
    
    this.name = name;
    jum = new int[4];
    jum[0] = kor;
    jum[1] = eng;
    jum[2] = mat;
    jum[3] = mil;
    
    gender = 0;
    
    cal();
  }
  
  
  void cal()
  {
    for(int i=0;i<rank.length;i++)
      rank[i]=1;
    
    for(int jj : jum)
    {
      sum+=jj;
    }
    avg = sum/jum.length;
    
    String [] arr = {"가","양","미","우","수","수"};
    
    gra = arr[avg/10 -5 <0 ? 0 :avg/10 -5];
  }
  
  void print(int kind)
  {
    String res = name+"\t"+
        gen[gender]+"\t";
    
    for(int jj : jum)
      res+=jj+"\t";
    
    if(gender==1)
      res+="\t";
    
    if(kind==0)
      kind++;
    
    res+=sum+"\t"+avg+"\t"+gra+"\t"+rank[kind];
    
    
    System.out.println(res);
    
  }
  
  
}

class Con_Stats
{
  Con_Stud [] studs;
  int kind =0;
  int [] index;
  int max=0;

  public Con_Stats(int kind,Con_Stud[] studs) {
    this.kind = kind;
    this.studs = studs;
    index = new int [studs.length];
    cal();
    setIndex();
    print();
  }
  
  public Con_Stats(Con_Stud[] studs) {
    this(0,studs);  
  }
  
  
  void cal()
  {
    int i=1;
    for(Con_Stud current : studs)
    {
      current.rank[0]=i;
      if(current.gender==0)
        max++;
      for(Con_Stud compare : studs)
      {
        if(current.avg<compare.avg)
        {
          current.rank[1]++;
          if(current.gender==compare.gender)
            current.rank[2]++;
        }
      }
      i++;
    }
    
  }
  
  void setIndex()
  {
    for(int i=0;i<studs.length;i++)
    {
      for(int j=0;j<studs.length;j++)
      {
        if(i==studs[j].rank[kind]-1)
        {
          int pos = i;
          if(studs[j].gender==1 && kind==2)
            pos+=max;
          index[pos]=j;
        }
      }
    }
  }
  
  void print()
  {
    for(int i: index)
      studs[i].print(kind);
  }
  
  
}
public class Constructor_Exam {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    /*Con_Stud [] studs = {
        new Con_Stud("김태희",88,87,82),
        new Con_Stud("집중호우",77,78,74,75)
    };*/
    
    new Con_Stats(
        new Con_Stud []{
            new Con_Stud("김태희",88,87,82),
            new Con_Stud("집중호우",77,78,74,70),
            new Con_Stud("전지현",77,78,74),
            new Con_Stud("김수현",91,84,75,64),
            new Con_Stud("이민정",66,68,64),
            new Con_Stud("이민호",54,61,72,83)
        }      
    );
  }

}
