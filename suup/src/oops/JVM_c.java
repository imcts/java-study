package oops;

class JJ{ //메소드영역이 됨. 
	int a=10; //메소드영역에서는 안 잡힘.'
	
	
	void math_1(){ //메소드 영역에서 정의됨.
		System.out.println("메소드 1 시작");
		math_2();
		System.out.println("메소드 1 끝");
		
	}
	void math_2(){ //메소드 영역에서 정의됨.
		System.out.println("메소드 2 시작");
		
		math_3();
		
		System.out.println("메소드 2 끝");
		
	}
	void math_3(){ //메소드 영역에서 정의됨.
		System.out.println("메소드 3 시작");
		System.out.println("메소드 3 끝");
		
	}
	
}

public class JVM_c {
	public static void main(String [] args){
		JJ j1 = new JJ(); //힙 영역. int a=10이 힙에서 할당됨.
		JJ j2 = new JJ(); //힙 영역. int a=10이 힙에서 할당됨.
		
		j1.a = 100;
		
		System.out.println(j1.a);//힙영역에서 서로 따로 영역이 할당되기 때문에 각자 다른 값이 나오게된다. 
		System.out.println(j2.a);//
		
		j1.math_1();
		j2.math_1();
		//메소드 영역에서 잡히기 때문에 따로 지정하지 않고 같은 구문이 실행된다.
		
		
		
		
		
		
	}
}
