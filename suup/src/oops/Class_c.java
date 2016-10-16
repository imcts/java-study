package oops;

class ClaC_1{
	int a = 10;  //멤버 변수 
	
	int b = 20;
	
	String str = "음냐...";
	
	char c = 'a';
}


class ClaC_2{
	int a = 10;  //멤버 변수 
	
	int b = 20;
	
	String str = "음냐...";
	
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
		
		//c2=cl1; 제조사가 다르기 때문에 대입할 수 없다.  
		
		
		System.out.println("cl.a : " +cl.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
