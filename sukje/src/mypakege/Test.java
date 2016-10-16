package mypakege;

import java.util.*;


public class Test {
	
	int cnt =0, cut=1;
	ArrayList list;
	
	
	public Test() {
		this.list= new ArrayList();
		this.setting();
		this.cal();
	}
	
	public void getCutNum(){
		for(int i=0; i<this.list.size(); i++){
			if(list.contains(i)&&i!=0){
				this.cut=i;
				break;
			}
		}
	}
	
	public void cutOperation(){
		Iterator it = this.list.iterator();
		
		ArrayList res = new ArrayList();
		
		
		while(it.hasNext()){
			int num = (int)it.next(); 
			num = num-this.cut;
			
			if(num>0){
				res.add(num);
			}
		}
		
		this.list = res;
		
		System.out.println("남아있는 막대기수 : "+this.list.size());
		String r = "";
		for(int i=0; i<list.size(); i++){
			r+=list.get(i)+" ";
		}
		System.out.println("남아있는 막대기의 길이 : "+r);
		
	}
	
	public void cal(){
		
		while(this.list.size()!=0){
			this.getCutNum();
			this.cutOperation();
		}
	}
	
	public void setting(){
		this.list.add(5);
		this.list.add(4);
		this.list.add(4);
		this.list.add(2);
		this.list.add(2);
		this.list.add(8);
	}
	

	
	public static void main(String[] args) {
		new Test();
	}

}
