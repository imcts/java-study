package io_p;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutStream_c {
	public static void main(String [] args){
		try {
			FileOutputStream fos = new FileOutputStream("rty.tyu");
			BufferedOutputStream bos = new BufferedOutputStream(fos,10);
			
			
			for(int i='a'; i<'z'; i++){
				fos.write(i);
			}
			
			bos.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
