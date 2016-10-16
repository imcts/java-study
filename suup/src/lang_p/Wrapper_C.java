package lang_p;

public class Wrapper_C {
	public static void main(String [] args){
		
	int a = Integer.parseInt("123"); //스트링값이 인트형이 아니라면 에러 도출.
	double b = Double.parseDouble("123.456");
	
	System.out.println(a+100);
	System.out.println(b);

		
	}
}
