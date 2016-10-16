package mypakege;

import java.util.*;


class Start{
	List binggo;
	int su=0;
	Set [] num;
	Iterator it;
	
	
	public Start() {
		this.num = new HashSet[6];		
		this.random();
		this.print();
	}
	
	private void print() {
		System.out.println("忙式式式式式綵堅っ虜菟晦式式式式式忖");
		for(int i=1; i<num.length; i++){
			System.out.println("弛   "+num[i]+"  弛");
		}
		System.out.println("戌式式式式式式式式式式式式式式式式式戎");
	}

	public void random() {
		for(int i=0; i<num.length; i++){
			this.num[i]=new HashSet();
			while(true){
				if(i==0){
					this.num[i].add((int)(Math.random()*100)+1);
					if(this.num[i].size()==25){
						it=num[i].iterator();
						break;
					}
				}else{
					this.num[i].add(it.next());
					if(num[i].size()==5)
						break;			
				}
			}
		}	
	}		
}

public class Binggo {
	public static void main(String [] args){
		new Start();

	
	
		
		
	}

}
