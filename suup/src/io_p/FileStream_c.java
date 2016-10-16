package io_p;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileStream_c {
	public static void main(String [] args){
		try {
			
			FileInputStream fis = new FileInputStream("abcd.efg"); //파일을 인풋받아서 저장시키고.
			BufferedInputStream bis = new BufferedInputStream(fis);//버퍼라는 공간에 담아서 버퍼 째로 넘긴다. 
			
			
			FileOutputStream fos = new FileOutputStream("gayo5.txt"); //파일을 내보내구 저장시켜주는 아웃풋 스트림을 만들고.
			BufferedOutputStream bos = new BufferedOutputStream(fos,10); //그파일에 버퍼에 담겨있는걸 뿌려준다.
			
			
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
