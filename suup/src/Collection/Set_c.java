package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Set_c {
	public static void main(String [] args){
		Set set = new HashSet();
		
		Object [] arr = {5,7,3,1,"1",3,3,3,3,3,3,3,77,99,"����","����"};
		
		
		for(Object e : arr){
		set.add(e);

		}
		
		System.out.println(set); //�ߺ��� ���� ������, ���Ŀ��� ��߳���.  ���ĵ��� �ʴ´�.
		
		List list = new ArrayList();
		Set lotto = new HashSet(); //Set�� ��쿣 �ߺ��� ���� ���� ���� �ʴ´�. 
		
		while(true){
			int buf = (int)(Math.random()*45)+1; //0���ʹϲ� �� 1�����־�¡ 
			
			if(!list.contains(buf))
			list.add(buf);
			
			if(list.size()==7){
				break;
			}
			
		}
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
