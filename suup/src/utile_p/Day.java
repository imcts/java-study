package utile_p;

import java.util.*;

class Res{
	Salary sal;
	Calendar today,myday,dday;
	
	public Res(Salary sal) {
		this.sal = sal;
		today=Calendar.getInstance();
		myday=Calendar.getInstance();
		dday=Calendar.getInstance();
		myday.set(Integer.parseInt(sal.salary[0]), Integer.parseInt(sal.salary[1]),Integer.parseInt(sal.salary[2]));
		dday.set(myday.get(Calendar.YEAR)+30, myday.get(Calendar.MONTH), myday.get(Calendar.DATE));
		
		

		
		
	}
	
	
	public void hobong(){}
	public void dday(){}
	
}

class Salary{
	String [] depart = {"a","b","c","d"}; //a �λ�, b �ѹ�, c�κ� , d �κ�
	String [] plan = {"����","����","����","�븮"};
	String [] salary = new String[6];
	
	int [] classs = {0,1,2,3,4}; //0 ����, 1 ����, 2 ����, 3 �븮, 4 ���
	
	
	public Salary(String s) {
		salary[0]=s.substring(0,4);
		salary[1]=s.substring(4,6);
		salary[2]=s.substring(6,8);
		salary[3]=s.substring(8,9);
		salary[4]=s.substring(9,10);
		salary[5]=s.substring(10);
	}
	
}



public class Day {
	public static void main(String [] args){
		
		new Res(new Salary("20020320a2lsh"));
		
		
		
	}
	
	
}
