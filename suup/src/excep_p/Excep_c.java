package excep_p;

import java.io.FileInputStream;
import java.io.IOException;


public class Excep_c {
	public static void main(String [] args){
		try{
			
			System.out.println("내용시작");
			
			FileInputStream fis = new FileInputStream("aaaa.txt");
			
			try{
				
			}catch(Exception e){
				
			}
			
			
			
		int a = 3/0;
		
		System.out.println(a);
		System.out.println("내용 끝");
		}catch(ArithmeticException e){
			System.out.println("수학적 예외 발생.");
			
			try{
				
			}catch(Exception ee){
				
			}finally{
				
			}
			
			
			
			return;
		
		}catch(IOException e){
			
			System.out.println("IO 예외 발생");
			return;
			
		}finally{

			System.out.println("시스템종료");
			
		}
		
	}
	
	
}
