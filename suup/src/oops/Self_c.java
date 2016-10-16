package oops;

class Self_cc{
	String str;
	int sum(int n){
		
		System.out.println(n+"   sum 시작");
		str+="\t";
		int res=1;
		
		
		if(n > 0){ //탈출 구문
			res = n * sum(n-1); //재귀 함수, 증감.
		}
		
		
		System.out.println(n + "sum : "+ res);
		System.out.println(n+"   sum 끝");
		return res;
	}
	
	
}


public class Self_c {
	public static void main(String [] args){
		
		Self_cc cc = new Self_cc();
				
				System.out.println(cc.sum(5));
		
		
	}

}
