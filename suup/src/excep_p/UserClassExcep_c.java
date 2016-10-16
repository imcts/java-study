package excep_p;

class UserExcep extends Exception{
	String [] res = {"아이디 중복","암호에러","전화번호","이메일","삼메일"};
	
	int num;

	
	public UserExcep() {
		
	}
	
	public UserExcep(int num) {
		super();
		this.num = num;
	}
	
	public UserExcep(String string) {
		super(string);
	} //익셉션을 상속 받게 한다.
	
	public String getMessage(){
		
		return res[num];
		
	}
	
	public void printStackTrace(){
		
		System.out.println(res[num]);
	}
	
}


public class UserClassExcep_c {
	public static void main(String [] args){
		try {
			
			throw new UserExcep("에러");
			
		} catch (UserExcep e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
