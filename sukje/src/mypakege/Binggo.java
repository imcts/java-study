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
		System.out.println("�����������������Ǹ���⦡����������");
		for(int i=1; i<num.length; i++){
			System.out.println("��   "+num[i]+"  ��");
		}
		System.out.println("��������������������������������������");
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
