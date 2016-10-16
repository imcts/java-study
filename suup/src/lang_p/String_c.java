package lang_p;

public class String_c {
	public static void main(String [] args){
		String str = "최태산 안녕?";
		String str2 = new String("최태산 안녕?");

		System.out.println(str.length());
		System.out.println(str.toString());
		
		
		System.out.println(str2.length());
		System.out.println(str2.toString());
		
		System.out.println("최태산 안녕?".length());
		
		char [] arr = {'a','b','c','가','c'};
		String str3 = new String(arr);
		
		System.out.println(str3); //원래는 char 배열로 구성되어있기 떄문에, 0번째 1번째 등으로 배열 번호를 불러올 수 있다.
		
		
		
		
		  String a="선생님 귀여워요 AbcD eF Java 만세 1234";
		  //        0 1 2 3 4---------------------------> 28
		  String email ="aaa_bbb@abc.co.kr";
		  
		  System.out.println(a.length());
		  
		  System.out.println(a.charAt(4));//String클래스 안에 있는 char배열의 번호를 가져온다.
		  
		  System.out.println(a.substring(5)); //sub 스트링은 5번째부터 쭈욱 다 나오게 된다.
		  System.out.println(a.substring(5,10));//sub 스트링은 5번째부터 마지막 -1 번째 글자까지 출력시킨다. 10번째 글자는 미포함.
		  
		  String [] emailarr = email.split("@"); // 골뱅이를 기준으로 앞뒤로 잘라낼떄 사용한다. 그래서 String 배열이 준비되어야 한다. 
		  //만약 골뱅이가 3개라면 3개의배열에 넣겠지.
		  
		  System.out.println(emailarr.length);
		  
		  for(String buf : emailarr){
			  System.out.println(buf);
		  }
		
		  String [] domain = emailarr[1].split("[.]"); //점으로 나눠야 할 경우에는 대괄호를 쳐줘야만 된다.
		
		  System.out.println(domain.length);
		
		  
		  System.out.println(a.indexOf("a",19)); //거기에 해당하는 순서를 돌려줌. 얘는 문자열을 찾게된다.charAt은 1글자만 보여주지만,
		  //이녀석은 문자열을 검색해 주고 그 글자의 위치를 알려준다. 
		  //뒤에 , 하고 19를 입력하면 19번째부터 찾으라는 명령이 된다. 이건 잘 안쓰게 된다.
		  
		  System.out.println(a.lastIndexOf("a")); //찾는 문자열의 마지막 등장번호를 찾게 된다. 마지막 부터 찾아서 뒤져온다.
		  
		  String fff = "aaa.bbb.ccc.ddd.eee.fff.ggg.txt";
		  String ext = fff.substring(fff.lastIndexOf(".")+1); //서브 스트링은 글을 잘라내는것. 근데 그 안에서 .을 기준으로 +1번째부터 ! 저장.
		  
		  System.out.println(a.toUpperCase()); //대문자로나옴.
		  System.out.println(a.toLowerCase()); //소문자로 다 바꾸어버림. 
		  
		  
		  String [] res = a.split(" ");
		  
		  for(int i=0; i<res.length; i++){
			System.out.print( res[i].substring(0,1).toUpperCase()); //이건 전부다 대 문자로 바꿔버린거고. 이제 1번째 부터는 전부다 뭐해? 소문자로 바꿔주면 되는거야.
		
			System.out.print(res[i].substring(1).toLowerCase()+" ");
			
			
		  }
		  
		  System.out.println();
		  System.out.println(a.replaceAll("a", "o"));
		 
		  char [] aaa = a.toCharArray(); //캐릭터 배열로 빼주는 것. 
		  
		  for(char buf : aaa){
			  System.out.println(buf);
		  }
		  
		  
		  String text = "     owefoijwfoijwefi  weifj weoijf woeifj oiwjef      ";
		  
		  System.out.println(text.length());
		  System.out.println(text.trim()); //양끝의 공백을 제거해줌.
		  
		  
	}
}
