package excep_p;

import java.util.Scanner;

import org.omg.CORBA.UserException;

class UserLogExcep extends Exception{
	
	String [] msg = {"아이디없음","패쓰워드 없음","아이디 패스워드 불일치"};
	
	int num;

	public UserLogExcep(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public void printStackTrace() {
		
		System.out.println(msg[num]);
	}
	
}



public class UserLogin_c {
	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		
		String id="",pw="";
		
		String res ="";

		String [] iddata = new String [3];
		String [] pwdata = new String [3];
		
		for(int i=0; i<iddata.length; i++){
			iddata[i] = new String();
			pwdata[i]=new String();
		}
		
		iddata[0]="aaa";
		iddata[1]="bbb";
		iddata[2]="ccc";
		
		pwdata[0]="aaa";
		pwdata[1]="bbb";
		pwdata[2]="bbb";
		
		
		while(true){
			
			System.out.println("아이디를 입력해 주세요 : ");
			id = sc.next();
			System.out.println("패스워드를 입력해 주세요 : ");
			pw = sc.next();
			
			for(int i=0; i<iddata.length; i++){
				if(!id.equals(iddata[i])){
					res="아이디가 없습니다.";
				}
			}
			
			
			
			
			try{
				
			if(id.equals(""))
				throw new UserLogExcep(0);
			if(pw.equals(""))
				throw new UserLogExcep(1);
			if(!id.equals(pw))
				throw new UserLogExcep(2);
			
			if(res.equals("아이디가 없습니다.")){
				System.out.println(res);
			}
			break;
			
			}catch(UserLogExcep e){
				e.printStackTrace();
			}
			
			
		}

		
		System.out.println("로그인 성공");
	
		System.out.println(id + "님 반갑습니다.");
	}
	
	

}
