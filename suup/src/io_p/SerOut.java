package io_p;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class SerData implements Serializable{
	
	
	private static final long serialVersionUID=1L;
	
	String name,pw; 
	int age;
	
	public SerData(String name, String pw, int age) {
	this.name=name;
	this.age=age;
	this.pw=pw;
	
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", "+pw+" , "+age;
	}
	
	
}



class SerDD{}

public class SerOut {
	public static void main(String [] args) throws IOException{
		
		FileOutputStream fos = new FileOutputStream("ser.sss");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeBoolean(false);
		oos.writeUTF("�������� .....");
		oos.writeInt(123);
		oos.writeObject(new SerData("aaa","aaa",123));
		
		
		oos.flush();//�ʱ�ȭ��Ŵ //������ �� �������� ������ �� �־�� �Ѵ�. 
		oos.reset(); 
		
		
		
		fos = new FileOutputStream("ser.sss");
		oos=new ObjectOutputStream(fos);
		
		
		
		List list = new ArrayList();
		
		list.add(new SerData("bbb","5678",30));
		list.add(new SerData("ccc","9012",45));
		list.add(new SerData("ddd","1111",17));
		//list.add(new SerDD());//����ȭ�� �Ǿ����� �ʴٸ� ���� �� ����. 
		oos.writeObject(list);
		oos.close();
		fos.close();
		
		
		
	}
}
