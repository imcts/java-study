package lang_p;

public class String_c {
	public static void main(String [] args){
		String str = "���»� �ȳ�?";
		String str2 = new String("���»� �ȳ�?");

		System.out.println(str.length());
		System.out.println(str.toString());
		
		
		System.out.println(str2.length());
		System.out.println(str2.toString());
		
		System.out.println("���»� �ȳ�?".length());
		
		char [] arr = {'a','b','c','��','c'};
		String str3 = new String(arr);
		
		System.out.println(str3); //������ char �迭�� �����Ǿ��ֱ� ������, 0��° 1��° ������ �迭 ��ȣ�� �ҷ��� �� �ִ�.
		
		
		
		
		  String a="������ �Ϳ����� AbcD eF Java ���� 1234";
		  //        0 1 2 3 4---------------------------> 28
		  String email ="aaa_bbb@abc.co.kr";
		  
		  System.out.println(a.length());
		  
		  System.out.println(a.charAt(4));//StringŬ���� �ȿ� �ִ� char�迭�� ��ȣ�� �����´�.
		  
		  System.out.println(a.substring(5)); //sub ��Ʈ���� 5��°���� �޿� �� ������ �ȴ�.
		  System.out.println(a.substring(5,10));//sub ��Ʈ���� 5��°���� ������ -1 ��° ���ڱ��� ��½�Ų��. 10��° ���ڴ� ������.
		  
		  String [] emailarr = email.split("@"); // ����̸� �������� �յڷ� �߶󳾋� ����Ѵ�. �׷��� String �迭�� �غ�Ǿ�� �Ѵ�. 
		  //���� ����̰� 3����� 3���ǹ迭�� �ְ���.
		  
		  System.out.println(emailarr.length);
		  
		  for(String buf : emailarr){
			  System.out.println(buf);
		  }
		
		  String [] domain = emailarr[1].split("[.]"); //������ ������ �� ��쿡�� ���ȣ�� ����߸� �ȴ�.
		
		  System.out.println(domain.length);
		
		  
		  System.out.println(a.indexOf("a",19)); //�ű⿡ �ش��ϴ� ������ ������. ��� ���ڿ��� ã�Եȴ�.charAt�� 1���ڸ� ����������,
		  //�̳༮�� ���ڿ��� �˻��� �ְ� �� ������ ��ġ�� �˷��ش�. 
		  //�ڿ� , �ϰ� 19�� �Է��ϸ� 19��°���� ã����� ����� �ȴ�. �̰� �� �Ⱦ��� �ȴ�.
		  
		  System.out.println(a.lastIndexOf("a")); //ã�� ���ڿ��� ������ �����ȣ�� ã�� �ȴ�. ������ ���� ã�Ƽ� �����´�.
		  
		  String fff = "aaa.bbb.ccc.ddd.eee.fff.ggg.txt";
		  String ext = fff.substring(fff.lastIndexOf(".")+1); //���� ��Ʈ���� ���� �߶󳻴°�. �ٵ� �� �ȿ��� .�� �������� +1��°���� ! ����.
		  
		  System.out.println(a.toUpperCase()); //�빮�ڷγ���.
		  System.out.println(a.toLowerCase()); //�ҹ��ڷ� �� �ٲپ����. 
		  
		  
		  String [] res = a.split(" ");
		  
		  for(int i=0; i<res.length; i++){
			System.out.print( res[i].substring(0,1).toUpperCase()); //�̰� ���δ� �� ���ڷ� �ٲ�����Ű�. ���� 1��° ���ʹ� ���δ� ����? �ҹ��ڷ� �ٲ��ָ� �Ǵ°ž�.
		
			System.out.print(res[i].substring(1).toLowerCase()+" ");
			
			
		  }
		  
		  System.out.println();
		  System.out.println(a.replaceAll("a", "o"));
		 
		  char [] aaa = a.toCharArray(); //ĳ���� �迭�� ���ִ� ��. 
		  
		  for(char buf : aaa){
			  System.out.println(buf);
		  }
		  
		  
		  String text = "     owefoijwfoijwefi  weifj weoijf woeifj oiwjef      ";
		  
		  System.out.println(text.length());
		  System.out.println(text.trim()); //�糡�� ������ ��������.
		  
		  
	}
}
