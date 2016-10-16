package utile_p;
import java.util.*;


public class Calendar_c {
	public static void main(String [] args){
		
		
		Calendar today = Calendar.getInstance(); //변수값을 직접 가져다 쓰겠습니다.
		
		System.out.println(today); //날자의 시간은 내 컴퓨터의 기준을 삼아 뽑아 낸
		
		today.set(Calendar.MONTH, 5);
		System.out.println(today.get(Calendar.MONTH)+"ekf"); //달
		System.out.println(today.get(Calendar.YEAR)); //년도
		System.out.println(today.get(Calendar.DATE)); //이번달 날짜.
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); //요일
		System.out.println(today.get(Calendar.WEEK_OF_YEAR)); //올해들어 몇 번째 주다.
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)); //이번달 들어 몇번째 주냐
		
		System.out.println(today.get(Calendar.HOUR)); //하루를 12시간으로 본것.
		System.out.println(today.get(Calendar.HOUR_OF_DAY)); //하루를 24시간으로 본것.
		System.out.println(today.get(Calendar.SECOND)); //몇초인지.
		System.out.println(today.get(Calendar.MILLISECOND)); //천분의 1초.
		System.out.println(today.get(Calendar.AM_PM)); //오전이면 0 오후면 1 
		
		today.set(2012, 1,27);
		/*today.set(2014, 11,14,21,50,30);
		today.set(Calendar.YEAR, 2015); //set의 경우에는 선언과 값을 넣어주면 됨. 
		today.set(Calendar.YEAR, today.get(Calendar.YEAR)+1);
		today.add(Calendar.YEAR, 2); //추가하는 것.
*/		today.add(Calendar.DATE, 5); //계산하기가 너무 편함. 20일후가 나오게 된다. 윤달까지 계산해준다.
		print(today);
		
		
		//today.setTimeInMillis(0);
		//System.out.println(today.getTimeInMillis());//1970년 1월 1일 00분 00초 부터 시작해서 카운트를 하는것.
		print(today);
		
		Calendar today2 = Calendar.getInstance();
		
		System.out.println(today2.getTimeInMillis()-today.getTimeInMillis()/(1000*60*60*24)); 
		
	}
	
	static void print(Calendar day){
		
		String [] dayStr={"日","月","火","水","木","金","土"};
		String res  = day.get(Calendar.YEAR)+"-"+
							(day.get(Calendar.MONTH)+1)+"-"+
							day.get(Calendar.DATE) + "("+dayStr[(Calendar.DAY_OF_WEEK)-1]+")"+
							day.get(Calendar.HOUR_OF_DAY)+"-"+day.get(Calendar.MINUTE)+"-"+day.get(Calendar.SECOND);
		System.out.println(res);
	}
}
