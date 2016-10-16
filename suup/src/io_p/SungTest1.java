package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.*;


public class SungTest1 {
	public static void main(String [] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("sung.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		
		List list = (List)ois.readObject();
		
		
		for(int i=0; i<list.size(); i++){
			System.out.println(  ((Haksang)list.get(i)).name+"\t"+((Haksang)list.get(i)).kor+"\t"+((Haksang)list.get(i)).eng+"\t"
										+((Haksang)list.get(i)).mat+"\t"+((Haksang)list.get(i)).sum+"\t"+((Haksang)list.get(i)).avg);
		}
	}
}
