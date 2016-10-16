package text_p;

import java.text.DecimalFormat;

public class DecimalFormat_c {
	public static void main(String [] args){
		DecimalFormat df = new DecimalFormat("0.##"); //소수점 2째자리까지 표현하라.
		//데시멀포맷으로 뺀 값은  String 값으로 리턴된다. 만약 합산 하고 싶다면, Integer로 변환후 합산해야 한다. 
		System.out.println(df.format(123.456789)+100);
		System.out.printf("%d->%c %.1f %s\n" ,87,87,123.456,"가나다라마바");
		
		String [] pp = {"0","#","00000000000000","################","######000000","000.00","##.##"
				,".##",".0000#####","#####0000.0000#####","#,##","#,###","#,##0.00","#,##0.000;-"}; //. 을 중심으로 자리수를 채워나간다.  소수점으로 입력한다면 뒤에 자리가 0이 붙겠지. 
		
		
		//"#,##;마이너스" 음수를 구분한다. 
		//#,## 은 2자리마다 ,를 붙여버린다. 
		
		//#은 자리가 있다면 있는대로 없다면 표시하고. "000000######"은 안된다. 
		//0의 개수만큼 자리수를 만들어서 ###은 있으면 표현하고 없으면 말고. 
		
		//0은 자리수를 채울때 쓴다. 소수점 3자리까지 나오게만 한다면, .000 을 사용하면 그 자리수를 맞춰준다.
		
		
		double data = -1123.456;
		
		for(String p : pp){
			df = new DecimalFormat(p);
			System.out.println(p+"- > " +df.format(data));	
		}
		
		
		
		
		
		
		
		
	}

}
