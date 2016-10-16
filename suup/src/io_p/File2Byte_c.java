package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class File2Byte_c {
	public static void main(String [] args){
		try {
			FileInputStream fis = new FileInputStream("photo/oh.jpg");
			FileReader fr = new FileReader("photo/oh.jpg");
			
			FileOutputStream fos = new FileOutputStream("fos.jpg");
			FileWriter fw = new FileWriter("fw.jpg");
			
			
			
			//1����Ʈ�� �̹����� ����Ҷ� �ؾ��Ѵ�.
			//2����Ʈ�� ���ڸ� ����Ҷ� �����Ѵ�. 
			
			int data;
			
			while((data = fis.read())!=-1){
				System.out.print((char)data);
				fos.write(data);
			}
			
			fos.close();
			
			System.out.println("----------------------------------------------");

			
			while((data = fr.read())!=-1){
				System.out.print((char)data);
				fw.write(data);
			}
			
			System.out.println("----------------------------------------------");
			fw.close();
			fis.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
