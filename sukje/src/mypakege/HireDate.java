package mypakege;

import java.util.*;
import java.util.regex.*;

class Stafff{
	String[] user=new String[3];
	int year,month,day;
	
	
	public Stafff(String hire, String name, String depart) {
		this. user[0]=hire;
		this. user[1]=name;
		this. user[2]=depart;
		this.year=Integer.parseInt(user[0].substring(0, 4));
		this.month=Integer.parseInt(user[0].substring(4,6));
		this.day=Integer.parseInt(user[0].substring(6));
	
	}
}

class Company{
	Stafff st;
	Boolean res[]=new Boolean[3];
	Pattern p;
	Matcher m;
	Calendar today,myday,tenday,fiteenday;
	String date,date2="";
	long dday=0,inputday,day;
	
	public Company(Stafff s) {
		this.st = s;
		this.today=Calendar.getInstance();
		this.myday=Calendar.getInstance();
		this.tenday=Calendar.getInstance();
		this.fiteenday=Calendar.getInstance();
		
		this.moving();
		this.result();
	}
	
	private void moving() {
		
		formCheck(0,0,"[0-9]{8}");
		formCheck(1,1,"[a-z]{2,4}");
		formCheck(2,2,"a|b|c|d");
		
		int i=0;
		for(Boolean buf : res){
			if(buf==false){
				exception(i);
			}
		i++;
		}
		
		print();
		
		
	}
	public void print(){
		
	}
	public void result(){
		this.myday.set(Calendar.YEAR,  this.st.year);
		this.myday.set(Calendar.MONTH, this.st.month-1);
		this.myday.set(Calendar.DATE, this.st.day);
		
		this.tenday.set(Calendar.YEAR, this.myday.get(Calendar.YEAR)+10);
		this.tenday.set(Calendar.MONTH, this.myday.get(Calendar.MONTH));
		this.tenday.set(Calendar.DATE, this.myday.get(Calendar.DATE));
		
		this.fiteenday.set(Calendar.YEAR, this.myday.get(Calendar.YEAR)+15);
		this.fiteenday.set(Calendar.MONTH, this.myday.get(Calendar.MONTH));
		this.fiteenday.set(Calendar.DATE, this.myday.get(Calendar.DATE));
		
		
		this.inputday=((myday.getTimeInMillis()-tenday.getTimeInMillis())/(1000*60*60*24)*-1);
		this.day=((myday.getTimeInMillis()-today.getTimeInMillis())/(1000*60*60*24)*-1);
		
		if(day>inputday){ //�Ի��Ϻ��� ���ñ������Ѱ� �ټ� 10�⺸�� ���ٸ�,
			this.dday=((fiteenday.getTimeInMillis()-today.getTimeInMillis())/(1000*60*60*24));
			this.date="15��ټ�";
			this.date2+=fiteenday.get(Calendar.YEAR)+"�� "+fiteenday.get(Calendar.MONTH)+1+"�� "
					       +fiteenday.get(Calendar.DATE)+"��";

		}else{
			this.dday=((tenday.getTimeInMillis()-today.getTimeInMillis())/(1000*60*60*24));
			this.date="10��ټ�";
			
		}
		System.out.println("�μ���\t\t�̴ϼ�\t\t�Ի���\t\t�ټ�������\t\t�ټ���\t\t\t�ٹ��ϼ�\t\tD-day");
		System.out.println("   "+st.user[2]+"\t         "+st.user[1]+"\t    "+st.user[0]+"\t"+
								    date+"\t"+date2+"\t\t"+day+"��\t\t "+dday+"��");
		
		
		
		
	}
	public void formCheck(int uindex, int rindex, String pattern){
		p=Pattern.compile(pattern);
		m=p.matcher(st.user[uindex]);
		this.res[rindex]=m.matches();
		
	}
	public void exception(int index){
		String res="";
		if(index==0)
			res="�Ի��� ���� ����.";
		else if(index==1)
			res="�̸� ���� ����.";
		else if(index==2)
			res="�μ� �Է� ����.";		
		try {
			throw new Exception(res);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}


public class HireDate {
	public static void main(String [] args){
		new Company(new Stafff("20020122","cts","a"));
		
	}

}
