package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class FileBuffered {
	public static void main(String [] args){
		try {
			
			FileReader fr = new FileReader("memo.txt"); //파일을 읽어와서 버퍼에다가 넣어줌. 
			BufferedReader br = new BufferedReader(fr); //버퍼드 리더에게 fr을 넣어줌. 
			
			FileWriter fw = new FileWriter("zzz.zzz"); //zzz.zzz라는 파일에다가 넘겨줌. 
			BufferedWriter bw = new BufferedWriter(fw); //버퍼에 담겨있는 값들을 fw에다가 넘겨줌.
			
			String line;
			
			
			
		
			for(int i=1; (line=br.readLine())!=null; i++){
				
				System.out.println(i+" : " +line);
				bw.write(i+ " : " +line);
				
			}
			
		
			
			br.close();
			fr.close();
			bw.close();
			fw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
