package utile_p;

import java.util.StringTokenizer;



public class StringTokenizer_c {
	public static void main(String [] args){
		String nickName="�嵿��,���μ�,,���켺,������";	
		
		String arr [] = nickName.split(",");
		
		for(String ar : arr){
			System.out.println(ar);
		}
		
		
		System.out.println("-----------------------------------------");
		
		StringTokenizer st = new  StringTokenizer(nickName,",");
	
		while(st.hasMoreElements()){
			
			System.out.println(st.nextToken());
			
		}
	
	
		
		
	}
}
