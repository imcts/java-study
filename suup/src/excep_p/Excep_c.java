package excep_p;

import java.io.FileInputStream;
import java.io.IOException;


public class Excep_c {
	public static void main(String [] args){
		try{
			
			System.out.println("�������");
			
			FileInputStream fis = new FileInputStream("aaaa.txt");
			
			try{
				
			}catch(Exception e){
				
			}
			
			
			
		int a = 3/0;
		
		System.out.println(a);
		System.out.println("���� ��");
		}catch(ArithmeticException e){
			System.out.println("������ ���� �߻�.");
			
			try{
				
			}catch(Exception ee){
				
			}finally{
				
			}
			
			
			
			return;
		
		}catch(IOException e){
			
			System.out.println("IO ���� �߻�");
			return;
			
		}finally{

			System.out.println("�ý�������");
			
		}
		
	}
	
	
}
