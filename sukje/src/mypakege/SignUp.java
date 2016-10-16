package mypakege;

import java.util.regex.*;

class User{
	String [] user=new String[8];
	public User(String id, String password, String password1, String email, String phone, String homePhone, String jumin, String photo) {
		this.user[0]=id;
		this.user[1]=password;
		this.user[2]=password1;
		this.user[3]=email;
		this.user[4]=phone;
		this.user[5]=homePhone;
		this.user[6]=jumin;
		this.user[7]=photo;
	}
	
}


class FormCheck{
	String [] user;
	Boolean [] res=new Boolean[7];
	Pattern p;
	Matcher m;
	public FormCheck(User user) {
		this.user=user.user;
		moving();
	}
	
	public void moving(){
		formChek(0,0,"[a-zA-Z0-9]*");
		formChek(3,1,"[a-zA-Z0-9]*@[a-zA-Z.]*[a-zA-Z.]*[a-zA-Z]");
		formChek(4,3,"[0-9]{3}-[0-9]{4}-[0-9]{4}");
		formChek(5,4,"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}");
		formChek(6,5,"[0-9]{6}-[0-9]{7}");
		formChek(7,6,"[a-zA-Z.]*jpg|bmp|gif");
		
		if(!(this.user[1]==this.user[2])){
			exception(2);
		}
		
		int i=0;
		for(Boolean buf : res){
			if(buf==false){
				exception(i);
			}
			i++;
		}
		
		System.out.println("회원가입 성공.");
	}

	public void formChek(int uuindex, int rindex, String pattern) {
		this.p=Pattern.compile(pattern);
		this.m=p.matcher(user[uuindex]);
		res[2]=true;
		res[rindex]=m.matches();
	}

	
	public void exception(int index) {
		try {
		String res="";
		if(index==0)
			res="아이디형식 오류";
		else if(index==1)
			res="이메일 형식 오류.";
		else if(index==2)
			res="비밀번호 입력 불일치.";
		else if(index==3)
			res="휴대전화 형식 오류";
		else if(index==4)
			res="집전화번호 형식 오류.";
		else if(index==5)
			res="주민등록번호 형식 오류.";
		else if(index==6)
			res="사진파일 형식 오류.";
		
			throw new Exception(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
}

public class SignUp {
	public static void main(String [] args){
		
		new FormCheck(
				new User("imcts","password","password","imcts11@naver.com","010-3383-1032","02-2296-1234",
						"871114-1234267","asdas.jpg")
								);
	}
}
