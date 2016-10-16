package mypakege;

import java.util.*;


class List{
	String info;
	String subject,singer,track;
	
	public List(String subject, String singer, String track) {
		this.subject=subject;
		this.singer=singer;
		this.track=track;
		this.info="곡명: "+subject+"    가수: "+singer+"    track: "+track;
		this.track=track;
		
		
	}
}



class Resulte{
	List [] list;
	Stack next, prev;
	String nowsong,nextsong,prevsong;
	String singer;
	int track;
	public Resulte(List [] list) {
		this.next=new Stack();
		this.prev=new Stack();
		this.list=list;
		this.moving();
	}
	
	public void moving() {
		this.newStart();
		this.nextChoice();
		this.nextChoice();
		this.nextChoice();
		this.nextChoice();
		this.prevChoice();
		this.prevChoice();
		this.prevChoice();
		this.prevChoice();
		this.singer="노래1";
		this.findSinger();
		this.track=1;
		findTrack();
		
	}
	public void findTrack() {
		this.reset();
		nextsong=(String)next.pop();
		while(true){
			nowsong=nextsong;
			int buf=Integer.parseInt(nextsong.substring(29));
			if(buf==track){
				if(buf==5){
					nextsong="다음곡이 없습니다.";
				}
				if(buf==1){
					prevsong="이전곡이 없습니다.\t\t\t";
					nextsong=(String)next.pop();
				}
				print();
				break;
			}
			nextsong=(String)next.pop();
			prevsong=nowsong;
			
		}
		
	
	}
	private void findSinger() {
		this.reset();
		
		nextsong=(String)next.pop();
		while(true){
			nowsong=nextsong;			
			if(nowsong.substring(4,7).equals(this.singer)){
				if(next.isEmpty()){
					nextsong="다음곡이 없습니다.";
				}else{
					nextsong=(String)next.pop();
				}
				break;
			}
			nextsong=(String)next.pop();
			prevsong=nowsong;
		}
		
		print();
	}

	private void reset() {
		this.next.clear();
		for(int i=list.length-1; i>=0; i--){ 
			String lists=list[i].info;
			this.next.push(lists); 	
		}	
	}

	public void nextChoice(){
	
		prevsong=nowsong;
		nowsong=nextsong;
		prev.push(prevsong);
		if(next.isEmpty()){
			nextsong="다음곡이 없습니다.";
			prev.pop();
			
		}else{
			nextsong=(String)next.pop();
		}
		
		print();
	}

	public void prevChoice(){
		
		
		nextsong=nowsong;
		nowsong=prevsong;
		next.push(nextsong);
		if(prev.isEmpty()){
			prevsong="이전곡이 없습니다.\t\t\t";
			
		}else{
			prevsong=(String)prev.pop();
		}
		print();
	}
	
	public void print() {
		System.out.println("\t\t\t\t\t\t\t----------------------------PlayList-----------------------------");
		System.out.println();
		System.out.println("prev: "+ prevsong+"\t\t←←\t\tnow : "+nowsong+"\t\t→→\t\tnext: "+nextsong);
	}


	public void newStart() {
		this.next.clear();
		for(int i=list.length-1; i>=1; i--){
			String lists=list[i].info;
			this.next.push(lists); 	
		
		}	
		this.prevsong="이전곡이 없습니다.\t\t\t";
		this.nowsong=list[0].info;
		this.nextsong=(String)next.pop();
		print();
	}
}

public class Mp3 {
	public static void main(String []args){
		new Resulte(
						new List[]{	new List("노래1","가수1","1"),
											new List("노래2","가수2","2"),
								       		new List("노래3","가수3","3"),
								    	  	new List("노래4","가수4","4"),
								    	  	new List("노래5","가수5","5")   }
						);			
		
	}
}
