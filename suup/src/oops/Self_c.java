package oops;

class Self_cc{
	String str;
	int sum(int n){
		
		System.out.println(n+"   sum ����");
		str+="\t";
		int res=1;
		
		
		if(n > 0){ //Ż�� ����
			res = n * sum(n-1); //��� �Լ�, ����.
		}
		
		
		System.out.println(n + "sum : "+ res);
		System.out.println(n+"   sum ��");
		return res;
	}
	
	
}


public class Self_c {
	public static void main(String [] args){
		
		Self_cc cc = new Self_cc();
				
				System.out.println(cc.sum(5));
		
		
	}

}
