package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Iterator_c {
	public static void main(String [] args){
		List list = new ArrayList();
		
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("�����");
		list.add("�̽��ͺ�");
		list.add("���");
		list.add("�ɺ�");
		
		
		Iterator it = list.iterator();
		System.out.println("----------------------------------");
		
		while(it.hasNext()){ //it.next()�� ������ ������ѹ���.
			//System.out.println(it.next());
			String buf = (String)it.next();
			System.out.println(buf);
			System.out.println(buf.length());
		}
		
		
		
	
		
	}
}
