package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_c {
	public static void main(String [] args){
		Map map = new TreeMap(); //�ؽ����� ������ ����. LinkedHashMap(), TreeMap(); �Ѵ� ��밡��. 
		
		map.put("5",88 );
		map.put("4",88 );
		map.put("2", 20 );
		map.put("7", 78 );
		map.put("2", 64);
		map.put("10", 91);
		

	
		System.out.println(map); //Ű�� �ߺ��� �� ����. ���� �ߺ��ż� ���ٸ� �������� �� Ű�� �ڱ� ���̴�. ���� �ߺ��ŵ� ����� ����.
		
		
		System.out.println(map.containsKey("����")); //����Ʈ�� �ִ� ���� ������ true. ������ false .
		System.out.println(map.containsKey("�ƺ�"));
		System.out.println(map.containsValue(88));
		System.out.println(map.containsValue(58));
		
		map.remove("����");
		
		System.out.println(map);
		System.out.println(map.get("����ȿ")); //Ű���� �ƴ� ������� ���ִ�. 
		
		/*Iterator it ;
		Set set = map.entrySet(); //���ͷ����Ϳ� �������� set�� �ְ� set�� ���ͷ����Ϳ� �־���
		
		it=set.iterator();*/
		
		
		Iterator it = map.entrySet().iterator(); //���ͷ����Ϳ� ���� �ִ¹��. 
		
		while(it.hasNext()){
			
			Map.Entry me = (Map.Entry)it.next();//��Ʈ������ �Ѳ����� �Ѱ��ְ�, �� ���� Ű�� ����� ���� �� �ִ�. 
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		Iterator kit = map.keySet().iterator(); //Ű�� ������ �ִ°�.
		
		while(kit.hasNext()){ //Ű���� �������� �� Ű���� �̿��ؼ� ���� �̾ƿ��°�. 
			String key = (String)kit.next();
			System.out.println(key+":"+map.get(key)); 
			
		}/*
		Collection cc = map.values(); //���� �����Ë�. 
		
		Iterator vit = cc.iterator();
		*/
		
		Iterator vit = map.values().iterator();
		
		while(vit.hasNext()){
			System.out.println(vit.next());
			//�������� �Ǿ��ִ� ��Ʈ����, Ű�� ���� Ű�� , ����� ���� ������. 3���� ����� �� �ִ�. �� ���͵��� ���ͷ����Ϳ��������.
		}
		
	}
}
