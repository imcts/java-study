package excep_p;

import java.util.Scanner;

import org.omg.CORBA.UserException;

class UserLogExcep extends Exception{
	
	String [] msg = {"���̵����","�о����� ����","���̵� �н����� ����ġ"};
	
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
			
			System.out.println("���̵� �Է��� �ּ��� : ");
			id = sc.next();
			System.out.println("�н����带 �Է��� �ּ��� : ");
			pw = sc.next();
			
			for(int i=0; i<iddata.length; i++){
				if(!id.equals(iddata[i])){
					res="���̵� �����ϴ�.";
				}
			}
			
			
			
			
			try{
				
			if(id.equals(""))
				throw new UserLogExcep(0);
			if(pw.equals(""))
				throw new UserLogExcep(1);
			if(!id.equals(pw))
				throw new UserLogExcep(2);
			
			if(res.equals("���̵� �����ϴ�.")){
				System.out.println(res);
			}
			break;
			
			}catch(UserLogExcep e){
				e.printStackTrace();
			}
			
			
		}

		
		System.out.println("�α��� ����");
	
		System.out.println(id + "�� �ݰ����ϴ�.");
	}
	
	

}
