package oops;

class Grand{
	
	int g = 777;
	
}
//�޼ҵ� ������ ���� ���� ���� ���ǰ� ����ȴ�. �׷��� �� ���������� setk�� �θ��ǰ��� �ƴ� �ڽİ��� ����. �ڽ��� �����ڷ� �����߱� ������.

class Parent_c extends Grand{
	int a = 10;
	
	int g = 999;
	int gg = super.g;
	
	int k = setK();
		
	int setK(){
		System.out.println("�θ� setK()");
		return 123;
	}
	
	static int m = setM();
	
	static int setM(){
		System.out.println("�θ��� setM");
		return 787;
	}
	
	void methA(){
		System.out.println("�� �θ�޼ҵ� A");
	}
}

class Parent_2{
	int a = 1000;
	void methA(){
		System.out.println("�� �θ�2 �޼ҵ� A");
	}
}

class Child_A extends Parent_c{
	int a = 1111;
	int aa = super.a;
	int gg= 999;
	int ggg=super.gg;
	int k=789;// �̰� ����� ������ k���� ���� �����̱⶧���� �θ��� k���� �������� ������, ��ǻ� �޼ҵ�� �ڽ��� ������ �մ� �޼ҵ带 ����ϰ� �ȴ�. �� ������ �θ�� �ڽ��� setk�� ���� ���⶧���̴�.
	//super�� �Ѵܰ�ۿ� �� ����.

	static int m = setM();
	
	int mm = super.m;
	
	static int setM(){
		System.out.println("�ڽ��� setM");
		return 788;
	}
	int setK(){
		System.out.println("�ڽ� setK()");
		return 123;
	}
	void methA(){
		System.out.println("�� �ڽĸ޼ҵ� A");
	}

	void methAA(){
		super.methA();
	}
	
}

class Child_B extends Parent_c{
	int b=20;
	int k=888;
	int setK(){
		System.out.println("�ڽ�2 setK()");
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
