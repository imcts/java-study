package mypakege;

public class StringTest {
	static String test = "abcdefghijklmn";
	
	public static void main(String [] args){
		String result="";
		String [] splitTest  = test.split("");
		for(int i = splitTest.length-1; i>=0; i--)
				result+=splitTest[i];
		System.out.println(result);
	}
}
