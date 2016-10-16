package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileSystem_c {
	public static void main(String [] args){
		try {
			FileOutputStream fos = new FileOutputStream("filesys.txt"); //파일의 아웃풋을 받아줄 파일 설정.
			PrintStream ps = new PrintStream(fos); //그 파일의 위치에다가 프린트 스트림으로 뿌려줌. 
			
			System.setOut(ps);; //출력 위치를 바꾸어버림.  
			
		
			
			
			char [] arr = "반장 메롱".toCharArray();
			
			
			for(char ch : arr)
			System.out.print(ch);
			
			
			
			ps.close();
			fos.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
