package mypakege;

import java.util.*;


class ResultGGB{
	Scanner sc;
	int user, com;
	String [] gbb={"����","����","��"};
	String userres="",res="";
	String [][] results = { 
			{"���","�¸�","�й�"},
			{"�й�","���","�¸�"}, 
			{"�¸�","�й�","���"}
	};	     
	
	
	public ResultGGB() {
		sc = new Scanner(System.in);
		gbb(); 
		System.out.println("�� �� �� !!");
		result(); 
	}
	
	public void mjb(){
		System.out.println("1. ����,  2. ����,  3. ��");
		this.user = sc.nextInt();
		this.com=(int)(Math.random()*3)+1;
		this.userres=this.results[com-1][user-1];
		
		System.out.println("com : " + gbb[com-1]);
		System.out.println("user : " + gbb[user-1]);
		
		
		if(userres.equals("�¸�")){
			res="�¸�";
			mjb();
		}
		else if(userres.equals("�й�")){
			res="�й�";
			mjb(); 
		}
		
	}
		
	public void result() {
		
		
		
		if(userres.equals("�¸�")){ 
			mjb(); 
			System.out.println("����� "+res+" �Ͽ����ϴ�.");
		}else{
			
			mjb();
			System.out.println("����� "+res+" �Ͽ����ϴ�.");
			
		}
		
	}

	public void gbb(){ 
		
		System.out.println("1. ����,  2. ����,  3. ��");
		this.user = sc.nextInt();
		this.com=(int)(Math.random()*3)+1;
		this.userres=this.results[com-1][user-1];
		this.res=userres;
		
		System.out.println("com : " + gbb[com-1]);
		System.out.println("user : " + gbb[user-1]);
		
		
		if(userres.equals("���")){
			System.out.println("�����ϴ�. �ѹ��� ���������� !");
			gbb();
		}
		
	}
	
}

public class MUKJJIBBA {
	public static void main(String [] args){
		new ResultGGB();
		
	}
}
