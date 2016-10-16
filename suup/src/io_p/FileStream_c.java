package io_p;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStream_c {
	public static void main(String [] args){
		try {
			
			FileInputStream fis = new FileInputStream("abcd.efg"); //������ ��ǲ�޾Ƽ� �����Ű��.
			BufferedInputStream bis = new BufferedInputStream(fis);//���۶�� ������ ��Ƽ� ���� °�� �ѱ��. 
			
			
			FileOutputStream fos = new FileOutputStream("gayo5.txt"); //������ �������� ��������ִ� �ƿ�ǲ ��Ʈ���� �����.
			BufferedOutputStream bos = new BufferedOutputStream(fos,10); //�����Ͽ� ���ۿ� ����ִ°� �ѷ��ش�.
			
			
			int data;
			
			while((data=bis.read())!=-1){
				//System.out.print((char)data);
				
				bos.write(data);
			}
			
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
