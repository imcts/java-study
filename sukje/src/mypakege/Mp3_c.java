package mypakege; 


import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StMusic //class StMusic.
{
  int no; //곡번호를 받기 위한 변수.
  String [] tt = {"",""}; //곡명과 가수명을 받기 위한 String 배열
  
  
  public StMusic(int no, String title, String singer) { //StMusic 생성자.
    super();
    this.no = no; //곡번호를 입력.
    
    tt[0] = title;//곡명을 입력.
    tt[1] = singer;//가수명을 입력.
  }
  @Override
  public String toString() {// 출력을 위한 toString 오버라이딩.
    return "["+no + " : " + tt[0] + ", " + tt[1] + "]"; //[곡번호 : 곡명 : 가수명] return.
  }
  
}


public class Mp3_c {

  static StMusic now=null; //현재곡으로 사용될 StMusic now;
  
  static Stack back = new Stack(), next = new Stack(); //이전곡들을 담아둘 back Stack, 다음곡을들을 담아둘 next Stack.
  
  static String [] name ={"곡명","가수님"}; 
  
  static void goTr(int no) //main메소드에서 실행하기 위해서 static 선언. 사용시 인수로 int no을 받아옴.
  {
    System.out.println("===========================goTr("+no+")"); //goTr+this.no를 화면에 출력.
    if(now.no<no) //this.now가 가지고 있는 no가 검색을 위해 받아온 int no보다 작다면 실행 
    {
      while(now.no!=no)//입력받은 no의 값과, now.no!의 값이 같지않다면 while을 실행. 찾을때까지 next()메소드 실행.
        next(); //next() 메소드 실행.
      
    }else if(now.no>no){ //입력받은 no의 값이 now가 가진 no값보다 작다면 실행.
      while(now.no!=no) //입력받은 no의 값이 now의 값과 같아질떄까지 실행.
        back(); //back() 메소드 실행.
    }
      
    
    print(); //print()실행. 
    
  }
  
  static void goNext() //main 메소드에서 사용하기 위해 static 선언.
  {//goNext메소드 시작.
    System.out.println("===========================goNext"); //======goNext 출력
    
    if(next()) //next()메소드의 반환값이 true일때 실행.
      print(); //next()의 반환값이 true일때 print(); 실행.
    else
      System.out.println("다음곡이 없습니다."); //next()메소드의 반환값이 false 라면 출력.
  
  }
  
  static boolean next() //main에서 사용하기 위해 static 선언 return자료형 boolean.
  {//next()메소드 시작.
    boolean res=false;//boolean res = 초기값 false.
    if(!next.empty())//next Stack이 비어있지 않다면 실행. 
    {
      if(now!=null)//this.now가 초기값이 아니라면 실행.
      back.push(now); //back Stack에 this.now 입력.
    
      now = (StMusic)next.pop(); //this.now에 next Stack에서 값을 꺼내어 StMusic으로 형변환 후 대입.
      res = true; //next Stack의 값이 empty가 아니라는것은 다음곡이 존재한다는 말이므로, true return.
    }
    return res; //res의 값을 반환.
  }//next()메소드 종료 -> main 메소드로 이동.
  
  static void goBack() //main에서 사용하기 위한 static 선언.
  {
    System.out.println("===========================goBack"); //화면에 =======goBack 출력.
    
    if(back()) //만약 back()메소드의 반환 값이 true라면 실행. 
      print(); //back()의 반환자료형이 true라면 print() 메소드 실행. 
    else //back() 메소드의 반환값이 false 라면 실행.
      System.out.println("이전곡이 없습니다."); //이전곡이 없습니다. 화면에 출력.
    
  
  }

  static boolean back() //main에서 사용하기 위한 static 선언.
  {
    boolean res=false; //반환값의 초기값을 false로 선언.
    if(!back.empty()) //만약 back Stack이 비어있지 않다면 실행.
    {
      if(now!=null) //this.now의 값이 null이 아니라면 실행.  : this.now = null; 이라는 이야기는 뒤로 갈곡이 없다는 의미.
      next.push(now); //next Stack에 this.now의 값을 입력. 
    
      now = (StMusic)back.pop(); //this. now 에는 Back Stack의 값을 pop()으로 꺼내서 대입. 
      res = true; //back Stack이 비어있지 않으므로 goBack()이 실행 가능하도록 true값을 리턴.
    }
    return res; //goBack()이 실행될지 말지 결정시켜 주는 res값 return.
  }
  
  static void print()//main 메소드에서 실행시키기 위한 static 선언.
  {//print()메소드 실행.
    System.out.println("현재곡:"+now); //this.now 출력.
    System.out.println("이전곡:"+back); //this.back 출력.
    System.out.println("다음곡:"+next); //this.next 출력.
  }//print()메소드 종료.
  
  public Mp3_c() { //Mp3_c calss 생성자.
 
    StMusic [] mm = { //StMusic class의 배열로 mm변수 생성.
        new StMusic(1, "애국가", "안익태"), //StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(2, "야생화", "박효신"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(3, "눈의 꽃", "박효신"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(4, "소녀시대", "소녀시대"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(5, "멸공의 횃불", "군인"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(6, "하나면 하나지", "영심이"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(7, "나혼자", "씨스타"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(8, "천년의 사랑", "박완규"),//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
        new StMusic(9, "이등병의 편지", "이등병")//StMusic 객체 생성, int 곡넘버, String 곡명, String 가수명 입력.
    };
    
   
    
    for(int i=mm.length-1;i>=0;i--) //next Stack에 곡을 전부 다 push하기 위한 for문 .
      next.push(mm[i]);//next Stack에 mm[i]번 방의 값들을 역순으로 대입.
    
  }//Mp3_c()생성자 종료.
  
  static void schCal(int kind , String content)//main에서 사용하기 위한 static 선언. 인수로 int kind값과 String content값을 받아옴.
  {
  
    Pattern p = Pattern.compile(".*"+content+".*"); //사용자가 넘겨준 검색 단어를 패턴화. .* 검색어 .* 앞뒤로 모든 문자열이 온다.
    Matcher m; //Pattern을 검증하기 위한 Matcher m 선언. 
    int nowTr = now.no; //현재 트랙이 몇번인지 알 수 있도록 now.no값을 대입시킴.
    boolean res = true; //이 변수는 만들어 놓고 까먹으신듯-_-;? 
    
    while(!next.empty()) //next Stack이 비어있지 않다면 while문장 실행.
    {    
      m = p.matcher(now.tt[kind]); //matcher m에 패턴 값을 넣어줌.(this.now.tt[kind]) now가 가진 tt[0]와 tt[1]을 비교.
      if(m.matches())//m.matches()가 true라면 해당 곡명이나 가수명과일치하므로 return;으로 메소드 종료.
      {
        return;
      }
      next();//만약 false 값이 나온다면 검색 결과와 일치하지 않으므로 다음곡으로 이동.
    }
    
    while(!back.empty())//검색결과가 없다면 처음으로 이동시킴.
      back(); //back()메소드 실행.
    

    while(!next.empty())//next Stack이 비어있지 않다면 실행. 
    {
      if(now.no==nowTr) //현재 번호와 입력받은 번호가 같다면 실행. 
      {
        System.out.println("찾으시는 "+name[kind]+"이 없습니다"); //찾으시는 곡명이나 가수가 없다고 출력.
        return;//출력후 return으로 메소드 종료.
      }
      
      m = p.matcher(now.tt[kind]);//입력받은 검색 결과값을 패턴값으러 넘김.
      if(m.matches()) //패턴값과 일치하는 값이 있다면 
      {
        return; //리턴으로 메소드 종료.
      }
      next(); //검색 결과가 없다면 원래 재생중이던 곡으로 이동.
    }
  }
  
  static void sch(int kind , String content)//main 에서 사용하기 위한 static 선언, 인수로 int kind와 String content를 받아옴.
  {
    
    System.out.println("=========================== "+name[kind]+":"+content); //화면에 name[kind]와 content를 출력.
    schCal(kind ,content);//schCal()메소드 실행, 인수로 kind값과 content값을 넘겨줌.
    print();
  }
  
  public static void main(String[] args) {//메인 메소드 실행.
  
    new Mp3_c();//Mp_c 클래스 객체 생성.
    
    goNext();//goNext() 메소드 실행.
    goNext();//goNext() 메소드 실행.
    goNext();//goNext() 메소드 실행.
    goBack();//goBack() 메소드 실행.
    goTr(7);//goTr() 메소드 실행. 실행시키면서 int no값을 넘겨줌.
    goTr(3);//goTr() 메소드 실행. 실행시키면서 int no값을 넘겨줌.
    
    sch(0,"눈의"); //sch() 메소드 실행, 실행시키면서 index의 값과 찾아야 할 String 값을 넘겨줌.
    
    
  }

}

