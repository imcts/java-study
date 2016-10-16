package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;


public class FileBuffered {
	public static void main(String [] args){
		try {
			
			FileReader fr = new FileReader("memo.txt"); //������ �о�ͼ� ���ۿ��ٰ� �־���. 
			BufferedReader br = new BufferedReader(fr); //���۵� �������� fr�� �־���. 
			
			FileWriter fw = new FileWriter("zzz.zzz"); //zzz.zzz��� ���Ͽ��ٰ� �Ѱ���. 
			BufferedWriter bw = new BufferedWriter(fw); //���ۿ� ����ִ� ������ fw���ٰ� �Ѱ���.
			
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
