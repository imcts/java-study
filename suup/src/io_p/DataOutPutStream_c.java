package io_p;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutPutStream_c {
	public static void main(String [] args) throws FileNotFoundException{
		
		
		try {
			
			
			FileOutputStream fos = new FileOutputStream("dataout.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			
			/*dos.writeInt(123);
			dos.writeDouble(123.456);
			dos.writeBoolean(true);
			dos.writeUTF("���ڿ��̴�!!!");*/
			
			dos.writeUTF("int@"+123);;
			dos.writeUTF("double@"+123.456);;
			dos.writeUTF("boolean@"+true);;
			dos.writeUTF("String@"+"���ڿ��̴� !!!");;
			
			
			dos.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
