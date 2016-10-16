package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Iterator_c {
	public static void main(String [] args){
		List list = new ArrayList();
		
		list.add("盔后");
		list.add("泅后");
		list.add("捧后");
		list.add("厘锐后");
		list.add("固胶磐后");
		list.add("榜后");
		list.add("纳后");
		
		
		Iterator it = list.iterator();
		System.out.println("----------------------------------");
		
		while(it.hasNext()){ //it.next()绰 公炼扒 柳青矫难滚覆.
			//System.out.println(it.next());
			String buf = (String)it.next();
			System.out.println(buf);
			System.out.println(buf.length());
		}
		
		
		
	
		
	}
}
