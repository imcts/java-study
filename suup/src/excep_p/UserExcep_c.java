package excep_p;


public class UserExcep_c {
	public static void main(String [] args){
		
		try{
			
			System.out.println("반장.");
			
		/*	Exception eee = new Exception();
			
			throw eee;*/
			
			throw new Exception("비오는 날엔 파전에 빠나나우유");
			
			
			//System.out.println("너 참 낯설다."); 에러를 직접 선언해 버리기 때문에, 그 밑으로는 구문이 들어갈 수가 없다.

			
			
		}catch(Exception e){ //사용자 정의 익셉션을 선언할때에는 catch부에서 받는 녀석의 형이 부모급이어야 한다. 위에서 익셉션이고 
			//아래에서 아리스매틱 익셉션이라면 문제가 된다.
			System.out.println(e.getMessage());
		}
		
		
	}
}
