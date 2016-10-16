package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Map_c {
	public static void main(String [] args){
		Map map = new TreeMap(); //해쉬맵은 순서가 없다. LinkedHashMap(), TreeMap(); 둘다 사용가능. 
		
		map.put("5",88 );
		map.put("4",88 );
		map.put("2", 20 );
		map.put("7", 78 );
		map.put("2", 64);
		map.put("10", 91);
		

	
		System.out.println(map); //키는 중복될 수 없다. 만약 중복돼서 들어갔다면 마지막에 들어간 키가 자기 값이다. 값은 중복돼도 상관이 없다.
		
		
		System.out.println(map.containsKey("가인")); //리스트에 있는 값이 있으면 true. 없으면 false .
		System.out.println(map.containsKey("아벨"));
		System.out.println(map.containsValue(88));
		System.out.println(map.containsValue(58));
		
		map.remove("가인");
		
		System.out.println(map);
		System.out.println(map.get("송지효")); //키값이 아닌 밸류값이 들어가있다. 
		
		/*Iterator it ;
		Set set = map.entrySet(); //이터레이터에 넣으려면 set에 넣고 set을 이터레이터에 넣어줌
		
		it=set.iterator();*/
		
		
		Iterator it = map.entrySet().iterator(); //이터레이터에 집어 넣는방법. 
		
		while(it.hasNext()){
			
			Map.Entry me = (Map.Entry)it.next();//엔트리셋은 한꺼번에 넘겨주고, 그 값을 키와 밸류로 나눌 수 있다. 
			System.out.println(me.getKey()+":"+me.getValue());
		}
		
		Iterator kit = map.keySet().iterator(); //키만 셋으로 주는것.
		
		while(kit.hasNext()){ //키값만 가져오고 그 키값을 이용해서 값을 뽑아오는것. 
			String key = (String)kit.next();
			System.out.println(key+":"+map.get(key)); 
			
		}/*
		Collection cc = map.values(); //값만 가져올떄. 
		
		Iterator vit = cc.iterator();
		*/
		
		Iterator vit = map.values().iterator();
		
		while(vit.hasNext()){
			System.out.println(vit.next());
			//묶음으로 되어있는 엔트리셋, 키만 뺴는 키셋 , 밸류만 빼는 벨류즈. 3개를 사용할 수 있다. 그 모든것들은 이터레이터에담아진다.
		}
		
	}
}
