package lang_p;



public class Stringjumin {
	public static void main(String [] args){
		String jumin = "871114-1543415";
		String  gender ="남자";
		String local = "내국인";
		int before = 1900;
		
		char kind = (char) (jumin.charAt(7)-'0');
		
		if(kind % 2 == 0)
			gender = "여자";
		
		if(kind==3 || kind==4){
			before=2000;
		}		
		if(kind==5 || kind==6){
			local="외국인";
			
		}		
		
		System.out.println(gender);
		

		
		String birth[] = new String[3];
		String birStr=""+before/100;

		for(int i=0; i<birth.length; i++){
			birth[i] += jumin.substring(i*2,(i*2)+2);
			birStr+=birth[i];
			if(i<birth.length-1){
				birStr+="-";
			}
		}
		
		before+=(birth[0].charAt(0)-'0')*10;
		
		
		System.out.println(before);
		
		System.out.println(local);
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
	}

}
