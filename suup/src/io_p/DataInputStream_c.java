package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataInputStream_c {
	public static void main(String [] args){
		
		try {
			
			FileInputStream fis = new FileInputStream("dataout.txt");
			DataInputStream dis = new DataInputStream(fis);
			
		
			
			while(dis.available()>0){
				
				String [] str = dis.readUTF().split("@");
				
				switch(str[0]){
				case "int" : 
						int a = Integer.parseInt(str[1]); 
						System.out.println(a+100);
						break;
						
				case "double" :
						double b = Double.parseDouble(str[1]);
						System.out.println(b+100);
						break;
						
				case "boolean" :
						boolean c = Boolean.parseBoolean(str[1]);
						System.out.println(!c);
						break;
						
				case "String" : 
					System.out.println(str[1]+100);
					break;
				}
			
				
			}
			
			
		
			//입력 했을때의 순서와 출력 했을때의 순서가 일치해야 한다.
			//UTF는 변환이 손쉽게 이루어질 수 있게 해준다.  1개의 자료형만 사용 하게 한다. 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
