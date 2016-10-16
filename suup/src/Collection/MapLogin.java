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
		map.put("id", "아이디가 일치하지 않습니다.");
		map.put("pw", "아이디와 비밀번호가 일치하지 않습니다.");
	
		
	}
	
	@Override
	public void printStackTrace() {
		System.out.println(map.get(key));
	}

}

public class MapLogin {
	public static void main(String [] args){
		Map map = new TreeMap(); // 링크드 해쉬맵은 순서대로 들어가고 순서대로 나오게된다. 
		//TreeMap 은 오름차순 내림차순 정렬된다. 값과 상관없이 키값만 따지게 된다. 
		
		map.put("aaa", new String[]{"44","고준희"});
		map.put("bbb", new String[]{"44","고준희"});
		map.put("ccc",  new String[]{"55","박보영"});
		map.put("ddd", new String[]{"022","아이유"});
		map.put("eee", new String[]{"33","전지현"});
		
		
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
				System.out.println(((String[])map.get(in))[0]+"로그인 성공");
				
	}	
}


