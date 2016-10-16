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
		String [] loStr={"ko","en"};//���
		String [] pp = {"y","yy","yyyy",//�⵵
								"M","MM","MMM",//��
								"d","dd","ddd",//����.
								"E","EE","EEE","EEEE"//����
								,"w","W"//���ص�� ���°��. �̹��޵�� ���°��.
								,"a"//���� ����
								,"z","Z"//����
								,"H","HH","k","kk","h","hh","K","KK" //�Ѵ� �ð��ε�, 24�ø� ���� ������ h�� 0-23 k�� 1-24  �� h��.
								,"m","mm"
								,"s","ss","S","SS" // s�� �� SS�� 1000���� 1��.
								
								
						
								
								
		};
		
		Locale locale = new Locale("ko");//������ ������ �� �ִ�. ko=�ڸ���, eu_US �����. 
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
