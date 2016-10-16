package oops;

class Sta{
	int a = 10, aa=setAA();
	static int b = 20, bb=setBB();
	
	
	
	static int setAA(){
		System.out.println("setAA");
		return 100;
	}
	static int setBB(){
		System.out.println("setBB");
		return 200;
	}
	
	
	
	
	
	
	void meth1(){
		System.out.println("난 인스턴스 meth1");
		
	}
	void meth2(){
		System.out.println("-----------------------------");
		System.out.println("a :" +a);
		System.out.println("b :" +b);
		System.out.println("난 인스턴스 meth2");
		meth3();
		meth1();
		System.out.println("-----------------------------");
		
	}
	static void meth3(){
		System.out.println("난 스태틱 meth3");
		
	}
	static void meth4(){
		System.out.println("-----------------------------");
		//System.out.println("a :" +a); 스태틱은 스태틱만 부를 수 있돠.
		System.out.println("b :" +b);
		System.out.println("난 스태틱 meth4");
		System.out.println("-----------------------------");
	}
}


public class Static_c {
	
	static int a = 300;//인스턴스 변수를 선언하면 메인에선 쓸 수가 없다. 메인이 static이기때문에, 인스턴스를 땡길 수가 없다.
	
	public static void main(String [] args ){
		
		System.out.println(a);
		
		System.out.println(Sta.b);
		
		Sta st1 = new Sta();
		Sta st2 = st1;
		
		
		
		System.out.println(st2.aa);
	
		
		st1.a = 100000;
		st1.b = 200000;
		
		System.out.println("st1.a :"+st1.a);
		System.out.println("st2.a :"+st2.a);
		System.out.println("st1.b :"+st1.b);
		System.out.println("st2.b :"+st2.b);
		
		
		Sta.meth3();
		//Sta.meth1();
		st1.meth1();
		
		st1.meth2();
		st2.meth2();
		
		Sta.meth4();
		
		//스태틱은 스태틱만 부를 수 있다. 
		
		
		
		 
		
	
	}
}
