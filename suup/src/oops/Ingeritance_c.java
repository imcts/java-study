package oops;

class Grand{
	
	int g = 777;
	
}
//메소드 영역은 힙이 돌기 전에 정의가 종료된다. 그래서 힙 영역에서의 setk는 부모의것이 아닌 자식것을 본다. 자식의 생성자로 생성했기 때문에.

class Parent_c extends Grand{
	int a = 10;
	
	int g = 999;
	int gg = super.g;
	
	int k = setK();
		
	int setK(){
		System.out.println("부모 setK()");
		return 123;
	}
	
	static int m = setM();
	
	static int setM(){
		System.out.println("부모의 setM");
		return 787;
	}
	
	void methA(){
		System.out.println("난 부모메소드 A");
	}
}

class Parent_2{
	int a = 1000;
	void methA(){
		System.out.println("난 부모2 메소드 A");
	}
}

class Child_A extends Parent_c{
	int a = 1111;
	int aa = super.a;
	int gg= 999;
	int ggg=super.gg;
	int k=789;// 이걸 지우면 나한테 k값이 없는 상태이기때문에 부모의 k값을 가져오게 되지만, 사실상 메소드는 자식이 가지고 잇는 메소드를 사용하게 된다. 그 이유는 부모와 자식의 setk의 값이 같기때문이다.
	//super는 한단계밖에 못 당긴다.

	static int m = setM();
	
	int mm = super.m;
	
	static int setM(){
		System.out.println("자식의 setM");
		return 788;
	}
	int setK(){
		System.out.println("자식 setK()");
		return 123;
	}
	void methA(){
		System.out.println("난 자식메소드 A");
	}

	void methAA(){
		super.methA();
	}
	
}

class Child_B extends Parent_c{
	int b=20;
	int k=888;
	int setK(){
		System.out.println("자식2 setK()");
		return 333;
	}
}


public class Ingeritance_c {
	public static void main(String [] args){
		Child_A a = new Child_A();
		Child_B b = new Child_B();/*
		System.out.println(a.a);
		System.out.println("a.aa : " + a.aa);
		System.out.println("b.a : " + b.a);
		System.out.println("b.b : "+b.b);
		a.methA(); 
		a.methAA();
		System.out.println("a.g : "+ a.g);
		System.out.println("a.ggg : "+ a.ggg);*/
		/*System.out.println(a.k);
		System.out.println(b.k);
		System.out.println(a.m);
		System.out.println(Parent_c.m);
		System.out.println(Child_A.m);*/
		System.out.println(a.mm);
	}
}
