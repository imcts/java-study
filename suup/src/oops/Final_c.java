package oops;

abstract class FC{
	int a = 10;
	static int b = 20; 
	final int c = 30;
	int d = 40;
	
	
	public FC() {
		// TODO Auto-generated constructor stub
	}
	
	final void meth(){
		System.out.println("������������������������");
	}

	abstract void meth2();
	
	void meth1(){
		System.out.println("�⺻ meth1");
	}
	
}


 class FcChild extends FC{
	 @Override
	void meth2() {
		 System.out.println("�ڽ�Ŭ�������� ������");
		
	}
	 
	
	
}


public class Final_c {
	public static void main(String [] args){
	
		FC fc = new FC() {
					@Override
					void meth2() {
						System.out.println("�����Ǹ� �Ѵ�.");
					}
					@Override
					void meth1() {
						System.out.println("dddd");
					}
					
				};
				
		
		fc.a = 20;
		fc.b=30;
		
				
		System.out.println(fc.a);
		System.out.println(fc.b);
		System.out.println(fc.c);
		fc.meth2();
		fc.meth();
		fc.meth1();
		
		
		FC fcc = new FcChild();
		
		
		fcc.meth2();
	}
}
