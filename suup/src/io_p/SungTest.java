package io_p;

import java.io.*;
import java.util.*;


class Haksang implements Serializable{
	int kor, eng, mat;
	String name;
	int sum, avg;
	
	public Haksang(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng = eng;
		this.mat=mat;
		this.sum=kor+eng+mat;
		this.avg=sum/3;
	}
}




public class SungTest {
	public static void main(String [] args) throws Exception{
		
		FileOutputStream fos = new FileOutputStream("sung.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		List list = new ArrayList();
		
		list.add(new Haksang("aaa",90,70,69));
		list.add(new Haksang("bbb",87,70,98));
		list.add(new Haksang("ccc",68,70,59));
		list.add(new Haksang("ddd",55,70,98));
		list.add(new Haksang("eee",44,70,97));
		
		
		
		oos.writeObject(list);
		
		oos.close();
		fos.close();
		
		
		
	}
}
