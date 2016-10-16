package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Iterator2_c {
	public static void main(String [] args){
		
		List num = new ArrayList<>();
		List even = new ArrayList<>();
		List odd = new ArrayList<>();
		
		
		int [] arr = {45,44,55,66,77,55,44,33,22};
		
		for(int buf : arr){
			num.add(buf);
		}
		
		
		Iterator numIt = num.iterator();
		
		while(numIt.hasNext()){
			
			int buf = (int)numIt.next();
			
			if(buf%2==0){
				even.add(buf);
			}else{
				odd.add(buf);
			}
			
			System.out.println(odd);
			System.out.println(even);
			System.out.println(num);
		}
		
		
		
	}
}
