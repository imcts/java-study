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
			
			
		
			//�Է� �������� ������ ��� �������� ������ ��ġ�ؾ� �Ѵ�.
			//UTF�� ��ȯ�� �ս��� �̷���� �� �ְ� ���ش�.  1���� �ڷ����� ��� �ϰ� �Ѵ�. 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
