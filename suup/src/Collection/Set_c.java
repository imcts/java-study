package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Set_c {
	public static void main(String [] args){
		Set set = new HashSet();
		
		Object [] arr = {5,7,3,1,"1",3,3,3,3,3,3,3,77,99,"반장","한장"};
		
		
		for(Object e : arr){
		set.add(e);

		}
		
		System.out.println(set); //중복이 되지 않지만, 형식에는 어긋난다.  정렬되지 않는다.
		
		List list = new ArrayList();
		Set lotto = new HashSet(); //Set의 경우엔 중복된 값이 절대 들어가지 않는다. 
		
		while(true){
			int buf = (int)(Math.random()*45)+1; //0부터니께 ㅋ 1더해주야징 
			
			if(!list.contains(buf))
			list.add(buf);
			
			if(list.size()==7){
				break;
			}
			
		}
		
		System.out.println(list);
		
		
		
		
		
		
	}

}
