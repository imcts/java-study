package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileSystem_c {
	public static void main(String [] args){
		try {
			FileOutputStream fos = new FileOutputStream("filesys.txt"); //������ �ƿ�ǲ�� �޾��� ���� ����.
			PrintStream ps = new PrintStream(fos); //�� ������ ��ġ���ٰ� ����Ʈ ��Ʈ������ �ѷ���. 
			
			System.setOut(ps);; //��� ��ġ�� �ٲپ����.  
			
		
			
			
			char [] arr = "���� �޷�".toCharArray();
			
			
			for(char ch : arr)
			System.out.print(ch);
			
			
			
			ps.close();
			fos.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
