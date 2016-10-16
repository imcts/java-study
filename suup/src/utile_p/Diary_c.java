package utile_p;

import java.util.Calendar;

public class Diary_c {
	public static void main(String [] args){
		Calendar today = Calendar.getInstance();
		
		today.set(2014, 3 , 16);
		today.set(Calendar.DATE, 1);
		
		
		for(int i=1; i<today.get(Calendar.DAY_OF_WEEK); i++){
			System.out.print("_\t");
			
		}
		
		for(int i =1 ; i<=today.getActualMaximum(Calendar.DATE); i++){
			System.out.print(i+"\t");
			today.set(Calendar.DATE, i);
			if(today.get(Calendar.DAY_OF_WEEK)==7){
				System.out.println();
			}
		}
		
		
	}
}
