package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


class MyException extends Exception{
	Map map = new HashMap();
	String key;
	public MyException(String key) {
		this.key=key;
		map.put("id", "���̵� ��ġ���� �ʽ��ϴ�.");
		map.put("pw", "���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
	
		
	}
	
	@Override
	public void printStackTrace() {
		System.out.println(map.get(key));
	}

}

public class MapLogin {
	public static void main(String [] args){
		Map map = new TreeMap(); // ��ũ�� �ؽ����� ������� ���� ������� �����Եȴ�. 
		//TreeMap �� �������� �������� ���ĵȴ�. ���� ������� Ű���� ������ �ȴ�. 
		
		map.put("aaa", new String[]{"44","������"});
		map.put("bbb", new String[]{"44","������"});
		map.put("ccc",  new String[]{"55","�ں���"});
		map.put("ddd", new String[]{"022","������"});
		map.put("eee", new String[]{"33","������"});
		
		
		System.out.println(map);
		
		
		Scanner sc = new Scanner(System.in);
		String in ,pw;
		while(true){
			
				try{
					System.out.print("ID:");
					in=sc.next();
					if(!map.containsKey(in))
						throw new MyException("id");	
					
					System.out.print("pw:");
					pw=sc.next();
					if(!((String[])map.get(in))[0].equals(pw)){
						throw new MyException("pw");
					}
				
					break;
				}catch(MyException e){
					e.printStackTrace();
				}
				
		}
				System.out.println(((String[])map.get(in))[0]+"�α��� ����");
				
	}	
}


