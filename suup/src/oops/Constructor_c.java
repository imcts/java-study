package oops;

class Const{
	
	int a = setA(),b;
	
	public Const() {
		System.out.println("�� �⺻ ���������� ~ ���� ���� ~ ���� ~ ");
	}
	
	public Const(int a) {//�������� �����ε��� �����ϴ�. �޼ҵ�� �Ȱ��� �����̴�. 
		System.out.println("a��ȯ��" +a);
		this.a=20;			
		System.out.println("a��ȯ��"+a);
		System.out.println("�� ������");
		meth2(); 		
	}
	
	void meth2(){
		
		System.out.println("b : " + b);
	}
	
	int setA(){
		System.out.println("�� ��� A���� �����ں��� ���� ����");
		return 10;	
	}
	
	void meth1(){
		System.out.println("�� �޼ҵ� 1 �̾�");
	}
	
	
}

public class Constructor_c {
	public static void main(String [] args){
		Const cc = new Const(50);
		System.out.println(cc.a);
		
		
		
	}
}
