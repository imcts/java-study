package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;





public class SerIn {
	public static void main(String [] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("ser.sss");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		/*System.out.println(ois.readBoolean());
		System.out.println(ois.readUTF());
		System.out.println(ois.readInt());
		System.out.println(ois.readObject());*/
		System.out.println(ois.readObject());
		
		
		
		
		
		
		
		ois.close();
		fis.close();
		
		
		
		
	}
}
