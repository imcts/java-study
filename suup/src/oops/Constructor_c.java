package oops;

class Const{
	
	int a = setA(),b;
	
	public Const() {
		System.out.println("난 기본 생성자지롱 ~ 지렁 지렁 ~ 지렁 ~ ");
	}
	
	public Const(int a) {//생성자의 오버로딩이 가능하다. 메소드랑 똑같기 때문이다. 
		System.out.println("a변환전" +a);
		this.a=20;			
		System.out.println("a변환후"+a);
		System.out.println("난 생성자");
		meth2(); 		
	}
	
	void meth2(){
		
		System.out.println("b : " + b);
	}
	
	int setA(){
		System.out.println("난 멤버 A셋팅 생성자보다 먼저 실행");
		return 10;	
	}
	
	void meth1(){
		System.out.println("난 메소드 1 이야");
	}
	
	
}

public class Constructor_c {
	public static void main(String [] args){
		Const cc = new Const(50);
		System.out.println(cc.a);
		
		
		
	}
}
