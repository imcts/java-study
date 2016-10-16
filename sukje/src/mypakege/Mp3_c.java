package mypakege; 


import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StMusic //class StMusic.
{
  int no; //���ȣ�� �ޱ� ���� ����.
  String [] tt = {"",""}; //���� �������� �ޱ� ���� String �迭
  
  
  public StMusic(int no, String title, String singer) { //StMusic ������.
    super();
    this.no = no; //���ȣ�� �Է�.
    
    tt[0] = title;//����� �Է�.
    tt[1] = singer;//�������� �Է�.
  }
  @Override
  public String toString() {// ����� ���� toString �������̵�.
    return "["+no + " : " + tt[0] + ", " + tt[1] + "]"; //[���ȣ : ��� : ������] return.
  }
  
}


public class Mp3_c {

  static StMusic now=null; //��������� ���� StMusic now;
  
  static Stack back = new Stack(), next = new Stack(); //��������� ��Ƶ� back Stack, ������������ ��Ƶ� next Stack.
  
  static String [] name ={"���","������"}; 
  
  static void goTr(int no) //main�޼ҵ忡�� �����ϱ� ���ؼ� static ����. ���� �μ��� int no�� �޾ƿ�.
  {
    System.out.println("===========================goTr("+no+")"); //goTr+this.no�� ȭ�鿡 ���.
    if(now.no<no) //this.now�� ������ �ִ� no�� �˻��� ���� �޾ƿ� int no���� �۴ٸ� ���� 
    {
      while(now.no!=no)//�Է¹��� no�� ����, now.no!�� ���� �����ʴٸ� while�� ����. ã�������� next()�޼ҵ� ����.
        next(); //next() �޼ҵ� ����.
      
    }else if(now.no>no){ //�Է¹��� no�� ���� now�� ���� no������ �۴ٸ� ����.
      while(now.no!=no) //�Է¹��� no�� ���� now�� ���� ������������ ����.
        back(); //back() �޼ҵ� ����.
    }
      
    
    print(); //print()����. 
    
  }
  
  static void goNext() //main �޼ҵ忡�� ����ϱ� ���� static ����.
  {//goNext�޼ҵ� ����.
    System.out.println("===========================goNext"); //======goNext ���
    
    if(next()) //next()�޼ҵ��� ��ȯ���� true�϶� ����.
      print(); //next()�� ��ȯ���� true�϶� print(); ����.
    else
      System.out.println("�������� �����ϴ�."); //next()�޼ҵ��� ��ȯ���� false ��� ���.
  
  }
  
  static boolean next() //main���� ����ϱ� ���� static ���� return�ڷ��� boolean.
  {//next()�޼ҵ� ����.
    boolean res=false;//boolean res = �ʱⰪ false.
    if(!next.empty())//next Stack�� ������� �ʴٸ� ����. 
    {
      if(now!=null)//this.now�� �ʱⰪ�� �ƴ϶�� ����.
      back.push(now); //back Stack�� this.now �Է�.
    
      now = (StMusic)next.pop(); //this.now�� next Stack���� ���� ������ StMusic���� ����ȯ �� ����.
      res = true; //next Stack�� ���� empty�� �ƴ϶�°��� �������� �����Ѵٴ� ���̹Ƿ�, true return.
    }
    return res; //res�� ���� ��ȯ.
  }//next()�޼ҵ� ���� -> main �޼ҵ�� �̵�.
  
  static void goBack() //main���� ����ϱ� ���� static ����.
  {
    System.out.println("===========================goBack"); //ȭ�鿡 =======goBack ���.
    
    if(back()) //���� back()�޼ҵ��� ��ȯ ���� true��� ����. 
      print(); //back()�� ��ȯ�ڷ����� true��� print() �޼ҵ� ����. 
    else //back() �޼ҵ��� ��ȯ���� false ��� ����.
      System.out.println("�������� �����ϴ�."); //�������� �����ϴ�. ȭ�鿡 ���.
    
  
  }

  static boolean back() //main���� ����ϱ� ���� static ����.
  {
    boolean res=false; //��ȯ���� �ʱⰪ�� false�� ����.
    if(!back.empty()) //���� back Stack�� ������� �ʴٸ� ����.
    {
      if(now!=null) //this.now�� ���� null�� �ƴ϶�� ����.  : this.now = null; �̶�� �̾߱�� �ڷ� ������ ���ٴ� �ǹ�.
      next.push(now); //next Stack�� this.now�� ���� �Է�. 
    
      now = (StMusic)back.pop(); //this. now ���� Back Stack�� ���� pop()���� ������ ����. 
      res = true; //back Stack�� ������� �����Ƿ� goBack()�� ���� �����ϵ��� true���� ����.
    }
    return res; //goBack()�� ������� ���� �������� �ִ� res�� return.
  }
  
  static void print()//main �޼ҵ忡�� �����Ű�� ���� static ����.
  {//print()�޼ҵ� ����.
    System.out.println("�����:"+now); //this.now ���.
    System.out.println("������:"+back); //this.back ���.
    System.out.println("������:"+next); //this.next ���.
  }//print()�޼ҵ� ����.
  
  public Mp3_c() { //Mp3_c calss ������.
 
    StMusic [] mm = { //StMusic class�� �迭�� mm���� ����.
        new StMusic(1, "�ֱ���", "������"), //StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(2, "�߻�ȭ", "��ȿ��"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(3, "���� ��", "��ȿ��"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(4, "�ҳ�ô�", "�ҳ�ô�"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(5, "����� ȶ��", "����"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(6, "�ϳ��� �ϳ���", "������"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(7, "��ȥ��", "����Ÿ"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(8, "õ���� ���", "�ڿϱ�"),//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
        new StMusic(9, "�̵�� ����", "�̵")//StMusic ��ü ����, int ��ѹ�, String ���, String ������ �Է�.
    };
    
   
    
    for(int i=mm.length-1;i>=0;i--) //next Stack�� ���� ���� �� push�ϱ� ���� for�� .
      next.push(mm[i]);//next Stack�� mm[i]�� ���� ������ �������� ����.
    
  }//Mp3_c()������ ����.
  
  static void schCal(int kind , String content)//main���� ����ϱ� ���� static ����. �μ��� int kind���� String content���� �޾ƿ�.
  {
  
    Pattern p = Pattern.compile(".*"+content+".*"); //����ڰ� �Ѱ��� �˻� �ܾ ����ȭ. .* �˻��� .* �յڷ� ��� ���ڿ��� �´�.
    Matcher m; //Pattern�� �����ϱ� ���� Matcher m ����. 
    int nowTr = now.no; //���� Ʈ���� ������� �� �� �ֵ��� now.no���� ���Խ�Ŵ.
    boolean res = true; //�� ������ ����� ���� ������ŵ�-_-;? 
    
    while(!next.empty()) //next Stack�� ������� �ʴٸ� while���� ����.
    {    
      m = p.matcher(now.tt[kind]); //matcher m�� ���� ���� �־���.(this.now.tt[kind]) now�� ���� tt[0]�� tt[1]�� ��.
      if(m.matches())//m.matches()�� true��� �ش� ����̳� ���������ġ�ϹǷ� return;���� �޼ҵ� ����.
      {
        return;
      }
      next();//���� false ���� ���´ٸ� �˻� ����� ��ġ���� �����Ƿ� ���������� �̵�.
    }
    
    while(!back.empty())//�˻������ ���ٸ� ó������ �̵���Ŵ.
      back(); //back()�޼ҵ� ����.
    

    while(!next.empty())//next Stack�� ������� �ʴٸ� ����. 
    {
      if(now.no==nowTr) //���� ��ȣ�� �Է¹��� ��ȣ�� ���ٸ� ����. 
      {
        System.out.println("ã���ô� "+name[kind]+"�� �����ϴ�"); //ã���ô� ����̳� ������ ���ٰ� ���.
        return;//����� return���� �޼ҵ� ����.
      }
      
      m = p.matcher(now.tt[kind]);//�Է¹��� �˻� ������� ���ϰ����� �ѱ�.
      if(m.matches()) //���ϰ��� ��ġ�ϴ� ���� �ִٸ� 
      {
        return; //�������� �޼ҵ� ����.
      }
      next(); //�˻� ����� ���ٸ� ���� ������̴� ������ �̵�.
    }
  }
  
  static void sch(int kind , String content)//main ���� ����ϱ� ���� static ����, �μ��� int kind�� String content�� �޾ƿ�.
  {
    
    System.out.println("=========================== "+name[kind]+":"+content); //ȭ�鿡 name[kind]�� content�� ���.
    schCal(kind ,content);//schCal()�޼ҵ� ����, �μ��� kind���� content���� �Ѱ���.
    print();
  }
  
  public static void main(String[] args) {//���� �޼ҵ� ����.
  
    new Mp3_c();//Mp_c Ŭ���� ��ü ����.
    
    goNext();//goNext() �޼ҵ� ����.
    goNext();//goNext() �޼ҵ� ����.
    goNext();//goNext() �޼ҵ� ����.
    goBack();//goBack() �޼ҵ� ����.
    goTr(7);//goTr() �޼ҵ� ����. �����Ű�鼭 int no���� �Ѱ���.
    goTr(3);//goTr() �޼ҵ� ����. �����Ű�鼭 int no���� �Ѱ���.
    
    sch(0,"����"); //sch() �޼ҵ� ����, �����Ű�鼭 index�� ���� ã�ƾ� �� String ���� �Ѱ���.
    
    
  }

}

