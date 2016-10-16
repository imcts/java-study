package mypakege;

import java.util.*;

class Diary{
	String [] week={"ìí","êÅ","ûý","â©","ÙÊ","ÐÝ","÷Ï"};
	int totalMonth=0;
	int month=0, startday=1,year; 
	int lastday[] = new int[3];
	int nowMonth[]=new int[3];
	
	
	Calendar cal;
	
	
	public Diary(int y) {
		this.cal=Calendar.getInstance();
		this.year=y;
		moving();
	}


	public void moving() {
		
		for(int  m=3, j=0; j<4; j++){
		System.out.println();
		title();
		for(int i=0; i<3; i++){
			firstWeek();
		}
		for(int i=0; i<5; i++){
			System.out.println();
			nextWeek(0);
			nextWeek(1);
			nextWeek(2);
		}
		for(int i=0; i<lastday.length; i++){
			lastday[i]=1;
		}
		month=m;
		
		m+=3;
		}
	}
		
		

	


	private void nextWeek(int index) {
		
		cal.set(Calendar.MONTH, nowMonth[index]);
		cal.set(Calendar.DATE, lastday[index]-1);
		this.month=nowMonth[index]; 
	
		if(lastday[index]>cal.getActualMaximum(Calendar.DATE)){
			for(int i=0; i<9; i++){
				System.out.print("\t");
			}
			
		}else{
		
		for(int i=lastday[index]; i<=cal.getActualMaximum(Calendar.DATE);i++){
		
			if(i==14 && nowMonth[index]==10){
				System.out.print("["+i+"]\t");
			}else{
			System.out.print(i+"\t");
			}
			cal.set(Calendar.DATE, i);
			lastDay(i);
			if(cal.getActualMaximum(Calendar.DATE)+1==lastday[index]){
				for(int j=cal.get(Calendar.DAY_OF_WEEK); j<=7; j++){
					System.out.print("\t");
				}
				System.out.print("\t");
				break;
			}
			else if(cal.get(Calendar.DAY_OF_WEEK)==7){
				lastDay(i);
				System.out.print("\t\t");
				
				break;
			}
		}
	}
	
}


	public void firstWeek() {
		cal.set(Calendar.YEAR, this.year); 
		cal.set(Calendar.MONTH, this.month); 
		cal.set(Calendar.DATE, this.startday);
		
	
		for(int i=1; i<cal.get(Calendar.DAY_OF_WEEK); i++){
			System.out.print("\t");			
		}
		
		for(int i=1; i<=cal.getActualMaximum(Calendar.DATE); i++){			
			System.out.print(i+"\t");
			cal.set(Calendar.DATE, i);
			if(cal.get(Calendar.DAY_OF_WEEK)==7){
				System.out.print("\t\t");
				lastDay(i);
				month++; 
				cal.set(Calendar.MONTH, this.month-1); 
				cal.set(Calendar.DATE, this.startday);
			
				break;
				
			}		
		}
}
		
	public void lastDay(int i) {

			if(this.month==0||this.month==3||this.month==6||this.month==9){
				lastday[0]=i+1;
			}
			else if(this.month==1||this.month==4||this.month==7||this.month==10){
				lastday[1]=i+1;
			}
			else{
				lastday[2]=i+1;
			}
	}

	public void title() {
		for(int j=totalMonth+1; j<totalMonth+4; j++){
		System.out.print("\t\t\t"+j+"¿ù\t\t\t\t\t\t");
		}
		
		System.out.println();
		for(int j=0; j<3; j++){
		for(int i=0; i<week.length; i++){
			System.out.print(week[i]+"\t");			
		}
		System.out.print("\t\t");
		}
		
		nowMonth[0]=totalMonth;
		nowMonth[1]=totalMonth+1;
		nowMonth[2]=totalMonth+2;
		
		
		this.totalMonth+=3; 
		
		System.out.println();
	
		
	}
}


public class Diary_c {
	public static void main(String [] args){
	new Diary(2014);
	}
}
