package oops;

class ClaC_1{
	int a = 10;  //��� ���� 
	
	int b = 20;
	
	String str = "����...";
	
	char c = 'a';
}


class ClaC_2{
	int a = 10;  //��� ���� 
	
	int b = 20;
	
	String str = "����...";
	
	char c = 'a';
}


public class Class_c {
	public static void main(String [] args){
		ClaC_1 cl;
		cl = new ClaC_1();
	
		
		cl.a = 100;
		
		System.out.println(cl.a);
		
		
		ClaC_1 cl1 = new ClaC_1();
		
		
		System.out.println(cl1.a);
		
		
		System.out.println(cl);
		System.out.println(cl1);
		
		
		ClaC_2 cl2 = new ClaC_2(); 
		
		System.out.println(cl2.a);
		System.out.println(cl2);
		
		
		cl=cl1;
		
		//c2=cl1; �����簡 �ٸ��� ������ ������ �� ����.  
		
		
		System.out.println("cl.a : " +cl.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
