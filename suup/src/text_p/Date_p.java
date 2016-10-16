package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Date_p {
	public static void main(String [] args) throws ParseException{
		Date today = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:S").parse("2014-06-30 00:05:07:123");
		
		
		//SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String [] loStr={"ko","en"};//언어
		String [] pp = {"y","yy","yyyy",//년도
								"M","MM","MMM",//달
								"d","dd","ddd",//날자.
								"E","EE","EEE","EEEE"//요일
								,"w","W"//올해들어 몇번째주. 이번달들어 몇번째주.
								,"a"//오전 오후
								,"z","Z"//지역
								,"H","HH","k","kk","h","hh","K","KK" //둘다 시간인데, 24시를 보는 관점이 h는 0-23 k는 1-24  걍 h써.
								,"m","mm"
								,"s","ss","S","SS" // s는 초 SS는 1000분으 1초.
								
								
						
								
								
		};
		
		Locale locale = new Locale("ko");//국가를 맞춰줄 수 있다. ko=코리아, eu_US 영어권. 
		for(String buf : pp){
			
			for(String str : loStr){
			
			System.out.println(buf + " : "+new SimpleDateFormat(buf,new Locale(str)).format(today));
			}
		}
		
		
		
		
		
		
		
		
		
		/*
		try {
			today = stf.parse("1987-11-14 17:50:30");
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
		
		System.out.println(stf.format(today));
		
		Calendar calday = Calendar.getInstance();
		
		print(calday);
		calday.setTime(today);
		print(calday);
		
		calday.add(Calendar.MONTH, 5);
		
		today = calday.getTime();
		System.out.println(today);*/
		
		
	}
	
	
	
	static void print(Calendar day){
		System.out.println(day.get(Calendar.YEAR)+"-"+
									(day.get(Calendar.MONTH)+1)+"-"+
									day.get(Calendar.DATE)
				);
		
	}
}
