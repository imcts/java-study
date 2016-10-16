package oops;

class Dyparent{
	
	int a= 10;
	int c= 30;
	
	
	void meth1(){
		System.out.println("�� �θ� �޼ҵ�");		
	}

	void met(){
		System.out.println("�� �θ� �޼ҵ�");		
	}
	
	int getB(){
		return 0;
	}
}



class DyChild extends Dyparent{
	int a=100;
	int b=200;
	
	public DyChild() {
		// TODO Auto-generated constructor stub
	}
	
	public DyChild(int a, int b) { //�θ��� ������ �ڽ��� ���� ������������, �ڽ��� a,b������ ������ �� ���� ������. �׷��� �����ڸ� ���� �����ϰ� �Ǹ� ���� �ʱⰪ�� ������ ���ؼ� ������ �����ϴ�.
		super();
		this.a = a;
		this.b = b;
	}

	void meth1(){
		System.out.println("�� �ڽ� �޼ҵ�1");		
	}
	
	void meth2(){
		System.out.println("�� �ڽ� �޼ҵ�2");		
	}
	
	int getB(){
		return b;
	}
}


class DyNam{
		
}

public class Dynamic_c {
	public static void main(String [] args){
		Dyparent pp = new Dyparent();
		Dyparent pc = new DyChild(10000,20000); //�θ��� ���·� �ڽ��� �����ڴ� ������ �����ϴ�. 
		//DyChild cp = new Dyparent(); �ڽ��� ���·� �θ��� �����ڸ� ����� ���� ����. 
		DyChild cc= new DyChild();
		
		
	
		
		System.out.println("pp.a : " + pp.a);
		System.out.println("pc.a : " + pc.a);
		System.out.println("cc.a : " + cc.a);
		System.out.println("cc.b : " + cc.b);
		
		
		
		System.out.println("getB() : " + pc.getB()); //�θ�� �ڽ��� �޼ҵ忡 ������ �� �ִ�. getB�� ���� �װ� ����ϴµ�,
		
		
		pp.meth1();
		pc.meth1(); //�޼ҵ念������ �θ��� ���� �ƴ� �ڽ��� ���� ����ϰ� �Ǵϱ�. �ڽ��� �޼ҵ带 ����.
		cc.meth1();
		
		
		cc.a=1111;
		cc.b=2222;
		cc.c=3333;
		
		
		Dyparent pcc = cc;//�ڽ� Ŭ������ �θ�� �ٲ���̴�.
		
		
		
		System.out.println("pcc.a :"+pcc.a);//
		System.out.println("pcc.c :"+pcc.c); //�ڽ��� ���Ҵ� c�� �θ��� c
		//System.out.println("pcc.a :"+pcc.b);
		
		
		DyChild cpcc = (DyChild)pcc;
		System.out.println("cpcc.a :"+cpcc.a);//
		System.out.println("cpcc.c :"+cpcc.c);
		System.out.println("cpcc.b :"+cpcc.b);
		
		
		cc.meth1();
		pcc.meth1(); //static�� ��쿡�� �� �� �ֵ�. �θ��� �޼ҵ尡 static�̶�� !!!!
		cpcc.meth1(); //������ �ڽ� �޼ҵ常 ���Եȴ� !!! 
		
		cc.meth1();
		//pcc.meth2(); //�̳��� ������ �� ���� ����. �ڽ��� �޼ҵ�� �� ���� ����.
		cpcc.meth1(); 
		pcc.met(); //�̷������� �ڽ��� �޼ҵ�� ������ ��������. �ٵ� ���࿡ meth1�� �������? �ڽİͿ� meth�� ���ڳ� �׷��ϱ� meth1�� ���� �Ǵ°ž�.
		
		
		//�����ߴ� ���� cc�ۿ� ������ ���̴�. 
		
		
		
		
		
		//ex)���� �����̶�� �θ� Ŭ������ �ְ�, �� �ؿ� �� �簢�� �ڽ�Ŭ������ ������, ������ ���ؾ� �Ѵٸ�, �θ�� area�� �������ְ�, �ڽ��� area�� �������̵��ؼ� ���. 
		//�θ� ������ �ִ� area��� ��� �������ٰ� ���� �����ִ� ĸ��ȭ �޼ҵ�. �׷��� ���� ���� �����ְԵɶ�, �θ��� �޼ҵ带 �����°� �ƴ϶�, �ڽ��� �޼ҵ忡�� ������ �����ְ� �ȴ�.
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		DyChild cpc = (DyChild)pc; //�θ��� ���·� �ڽ��� �����ڸ� ����ϰ�, �װ� �ٽ� �ڽ����� �ٲٰ� �Ǹ�.
		System.out.println("cpc.a :"+cpc.a);//
		System.out.println("cpc.c :"+cpc.c);
		System.out.println("cpc.b :"+cpc.b);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		
	//	DyChild cpp = (DyChild)pp; //���ʿ� �θ��� �����ε� �ڽ����� �� ���� ����. 
		//���⿡�� �����ϴ� ���� �ٷ� instanceof -> ����ȯ�� ���������� üũ���ش�.
		DyNam nn = new DyNam();
		//System.out.println(nn instanceof DyChild);
		System.out.println(pp instanceof DyChild);
		System.out.println(pc instanceof DyChild);
		System.out.println(cc instanceof DyChild);
		
		
		
		//�θ�� �� ���� �� �ִ�. 
		
		
		
		
		
	
		
	}
}