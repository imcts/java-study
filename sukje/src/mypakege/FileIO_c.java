package mypakege;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


class Files{
	FileInputStream fis;
	FileOutputStream fos;
	DataOutputStream dos;
	DataInputStream dis;
	
	public Files() {
		String [] arr = {"gayo1.txt","gayo2.txt","gayo3.txt","gayo4.txt","gayo5.txt"};
		String [] arr1 = {"�ѱ���@!�뷡1","�Ϻ���@!�뷡1","�ѱ���@!�뷡2","�̱���@!�뷡1","�Ϻ���@!�뷡2"};
		
		for(int i=0; i<arr.length; i++){
		output(arr[i],arr1[i]);
		input(arr[i]);
		}
		
	}
		
	private void input(String title) {
		
		try {
			this.fis=new FileInputStream(title);
			this.dis=new DataInputStream(fis);
			String [] arr = dis.readUTF().split("@!");
			
			if(arr[0].equals("�ѱ���")){
				this.fos=new FileOutputStream("korean/"+title);
				this.dos=new DataOutputStream(fos);
				dos.writeUTF(arr[0]+"@!"+arr[1]);
			}
			else if(arr[0].equals("�Ϻ���")){
				this.fos=new FileOutputStream("japan/"+title);
				this.dos=new DataOutputStream(fos);
				dos.writeUTF(arr[0]+"@!"+arr[1]);
			}
			else if(arr[0].equals("�̱���")){
				this.fos=new FileOutputStream("usa/"+title);
				this.dos=new DataOutputStream(fos);
				dos.writeUTF(arr[0]+"@!"+arr[1]);
			}
			
			
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private void output(String title,String subject) {
		try {
			this.fos=new FileOutputStream(title);
			this.dos=new DataOutputStream(fos);
			
			dos.writeUTF(subject);
		
		
			dos.close();
			fos.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class FileIO_c {
	public static void main(String [] args){
		new Files();
		
	}
}
