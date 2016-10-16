package mypakege;

import java.util.*;


class ResultGGB{
	Scanner sc;
	int user, com;
	String [] gbb={"가위","바위","보"};
	String userres="",res="";
	String [][] results = { 
			{"비김","승리","패배"},
			{"패배","비김","승리"}, 
			{"승리","패배","비김"}
	};	     
	
	
	public ResultGGB() {
		sc = new Scanner(System.in);
		gbb(); 
		System.out.println("묵 찌 빠 !!");
		result(); 
	}
	
	public void mjb(){
		System.out.println("1. 가위,  2. 바위,  3. 보");
		this.user = sc.nextInt();
		this.com=(int)(Math.random()*3)+1;
		this.userres=this.results[com-1][user-1];
		
		System.out.println("com : " + gbb[com-1]);
		System.out.println("user : " + gbb[user-1]);
		
		
		if(userres.equals("승리")){
			res="승리";
			mjb();
		}
		else if(userres.equals("패배")){
			res="패배";
			mjb(); 
		}
		
	}
		
	public void result() {
		
		
		
		if(userres.equals("승리")){ 
			mjb(); 
			System.out.println("당신은 "+res+" 하였습니다.");
		}else{
			
			mjb();
			System.out.println("당신은 "+res+" 하였습니다.");
			
		}
		
	}

	public void gbb(){ 
		
		System.out.println("1. 가위,  2. 바위,  3. 보");
		this.user = sc.nextInt();
		this.com=(int)(Math.random()*3)+1;
		this.userres=this.results[com-1][user-1];
		this.res=userres;
		
		System.out.println("com : " + gbb[com-1]);
		System.out.println("user : " + gbb[user-1]);
		
		
		if(userres.equals("비김")){
			System.out.println("비겼습니다. 한번더 가위바위보 !");
			gbb();
		}
		
	}
	
}

public class MUKJJIBBA {
	public static void main(String [] args){
		new ResultGGB();
		
	}
}
