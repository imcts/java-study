package Collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMap_c {
	public static void main(String [] args){
		
		TreeMap t = new TreeMap();
		
		t.put("1", "");
		
		Iterator it = t.keySet().iterator();
		
		
		
		int i = Integer.parseInt((String)it.next());
		
		System.out.println(i);
		
	}

}
