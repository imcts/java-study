package utile_p;

import java.util.Calendar;

public class CalendarJumin {
	public static void main(String [] args){
		String jumin = "871114-1543415";
		int [] dayArr= new int[3];
		int year = 1900;
		
		
		if((int)jumin.charAt(7)-'0'==3 || (int)jumin.charAt(7)-'0'==4){
			year = 2000;
		}
		
		for(int i=0; i<dayArr.length; i++){
			dayArr[i]=Integer.parseInt(jumin.substring(i*2,i*2+2));
		}
		
		dayArr[0]+=year;
		Calendar today = Calendar.getInstance();
		Calendar myday = Calendar.getInstance();
		
		
		System.out.println("³ªÀÌ : "+(today.get(Calendar.YEAR)-dayArr[0]+1)); //ÇöÀç ³âµµ¿¡¼­ »ýÀÏ ³âµµ¸¦ »©¸é ³ªÀÌ°¡ µÊ. 
		
		myday.set(today.get(Calendar.YEAR),dayArr[1]-1,dayArr[2]);
	
		System.out.print("¿ÃÇØ ³» »ýÀÏ : ");
		print(myday);
		
		if(today.after(myday))
			myday.add(Calendar.YEAR, 1);

		System.out.print("´Ù°¡¿Ã ³» »ýÀÏ : ");
		print(myday);
		
		if(myday.get(Calendar.DAY_OF_WEEK)==7);
			myday.add(Calendar.DATE, -1);
		if(myday.get(Calendar.DAY_OF_WEEK)==1);
			myday.add(Calendar.DATE, -2);
			
			System.out.print("»ýÀÏ ÆÄÆ¼ : ");
			print(myday);
			
			
			
		
		
	}
		static void print(Calendar day){
			
			String [] dayStr={"ìí","êÅ","ûý","â©","ÙÊ","ÐÝ","÷Ï"};
			String res  = day.get(Calendar.YEAR)+"-"+
								(day.get(Calendar.MONTH)+1)+"-"+
								day.get(Calendar.DATE) + "("+dayStr[(Calendar.DAY_OF_WEEK)-1]+")";
			
			System.out.println(res);
		}
		
	}

