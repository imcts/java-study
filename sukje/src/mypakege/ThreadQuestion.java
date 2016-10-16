package mypakege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;


class Question{
	String q,a;
	int index=1;
	
	public Question(String q, String a) {
		this.q=q;
		this.a=a;
	}
	
	
}
class Total{
	Map totmap;
	boolean stop=false,mainwhile=true,mainTimeOver=false;
	List pass;
	int totTimeJum[]=new int[3],questionIndex=1,qClear[]=new int[3],totResultIndex=0,timeIndex=0,arrayIndex=0;
	int jum[],sum=0,avg=0,passSu[]=new int[3];
	String [] arr ={"국어","영어","수학"};
	
	
	public Total() {
		this.jum=new int[3];
		this.totmap=new LinkedHashMap();
		this.pass = new ArrayList();
		this.input();
	}

	private void input() {
		this.pass.add(new ArrayList());
		this.pass.add(new ArrayList());
		this.pass.add(new ArrayList());
		
		
		this.totmap.put(1, new LinkedHashMap());
		this.totmap.put(2, new LinkedHashMap());
		this.totmap.put(3, new LinkedHashMap());
		
		
		((Map)totmap.get(1)).put(1, new Question("1. 거꾸로, 2. 꺼꾸로, 3. 꺾끄로","2"));
		((Map)totmap.get(1)).put(2, new Question("1. 언덕배기, 2. 언덕빽이, 3. 언덕빼기","2"));
		((Map)totmap.get(1)).put(3, new Question("1. 딱따구리, 2. 딱다구리, 3. 딱딱구리","1"));
		((Map)totmap.get(1)).put(4, new Question("1. 짭짜라다, 2. 짭짤하다, 3짭쪼름하다","2"));
		((Map)totmap.get(1)).put(5, new Question("1. 패품, 2. 폐품, 3. 폐기품","2"));
		((Map)totmap.get(1)).put(6, new Question("1. 핑게, 2. 핑개, 3. 핑계","3"));
		((Map)totmap.get(1)).put(7, new Question("1. 게시판, 2. 계시판, 3. 개시판","1"));
		((Map)totmap.get(1)).put(8, new Question("1. 개양대, 2. 계양대, 3. 게양대","3"));
		((Map)totmap.get(1)).put(9, new Question("1. 휴계실, 2. 휴개소, 3. 휴게실","3"));
		((Map)totmap.get(1)).put(10, new Question("1. 연녕생, 2. 연연생, 3. 연년생","3"));
		((Map)totmap.get(1)).put(11, new Question("거리가 얼마가 될지(2글자)해 보았다.","가늠"));
		((Map)totmap.get(1)).put(12, new Question("누구 말이 옳은지 (2글자)해보자","가름"));
		((Map)totmap.get(1)).put(13, new Question("천사의 손가락이 동쪽을 (4글자)","가리켰다"));
		((Map)totmap.get(1)).put(14, new Question("용기를 (3글자)주신 고마운 선생님이 계셨다.","가르쳐"));
		((Map)totmap.get(1)).put(15, new Question("종이가 (3글자) 찢어졌다.","갈가리"));
		((Map)totmap.get(1)).put(16, new Question("무 (2글자)이 나무를 깎았다.","깎듯"));
		((Map)totmap.get(1)).put(17, new Question("조개 (3글자)를 모아보자","껍데기"));
		((Map)totmap.get(1)).put(18, new Question("이삿짐을 모두 (2글자)라.","날라"));
		((Map)totmap.get(1)).put(19, new Question("갑자기 새들이 푸드득 하며 (2글자)갔다.","날아"));
		((Map)totmap.get(1)).put(20, new Question("개가 새끼를 (3글자)","낳았다"));
		((Map)totmap.get(1)).put(21, new Question("",""));
		
		
		
		((Map)totmap.get(2)).put(1, new Question("가다 : 1.go  2. gon 3. gu","1"));
		((Map)totmap.get(2)).put(2, new Question("저것 : 1. thack, 2. that, 3. thread","2"));
		((Map)totmap.get(2)).put(3, new Question("~을위해 : 1. for, 2. why, 3. try","1"));
		((Map)totmap.get(2)).put(4, new Question("~말하다 : 1. say~ho, 2. say, 3.what?","2"));
		((Map)totmap.get(2)).put(5, new Question("~의 : 1. tell, 2. of, 3. not","2"));
		((Map)totmap.get(2)).put(6, new Question("~않다 : 1. do, 2. can't, 3. not","3"));
		((Map)totmap.get(2)).put(7, new Question("~할 수 있다 : 1. can, 2. can't, 3. soso","1"));
		((Map)totmap.get(2)).put(8, new Question("~이었다 : 1. what the , 2. wash , 3. was","3"));
		((Map)totmap.get(2)).put(9, new Question("~하다 : 1. do it, 2. doing, 3. do","3"));
		((Map)totmap.get(2)).put(10, new Question("~를 갖고있다 : 1. haven, 2. has, 3. have","3"));
		((Map)totmap.get(2)).put(11, new Question("~그것은 : 1. as soon, 2. maybe, 3. it","3"));
		((Map)totmap.get(2)).put(12, new Question("~의 안에 : 1. out, 2.in, 3.input","2"));
		((Map)totmap.get(2)).put(13, new Question("~그는 : 1.he, 2.her, 3.that","1"));
		((Map)totmap.get(2)).put(14, new Question("~이다 : 1. iris, 2.is, 3.to","2"));
		((Map)totmap.get(2)).put(15, new Question("~너는 : 1. my, 2. you'r, 3.you","3"));
		((Map)totmap.get(2)).put(16, new Question("~나는 : 1. my, 2. me, 3. we","2"));
		((Map)totmap.get(2)).put(17, new Question("~하나의 : 1. b, 2.a, 3.c","2"));
		((Map)totmap.get(2)).put(18, new Question("~에 : 1. to, 2. too, 3. tooo","1"));
		((Map)totmap.get(2)).put(19, new Question("그 : 1. he, 2. man, 3. the","3"));
		((Map)totmap.get(2)).put(20, new Question("이름 : 1.named, 2. name, 3.diablo","2"));
		((Map)totmap.get(2)).put(21, new Question("",""));
		
		
		
		
		((Map)totmap.get(3)).put(1, new Question("1+9 :1) 21, 2) 10, 3) 13,","2"));
		((Map)totmap.get(3)).put(2, new Question("2+8 :1) 32, 2) 22, 3) 10,","3"));
		((Map)totmap.get(3)).put(3, new Question("3+7 :1) 17, 2) 32, 3) 10,","3"));
		((Map)totmap.get(3)).put(4, new Question("4+6 :1) 1, 2) 10, 3) 3,","2"));
		((Map)totmap.get(3)).put(5, new Question("5+5 :1) 10, 2) 22, 3) 33,","1"));
		((Map)totmap.get(3)).put(6, new Question("6+4 :1) 14, 2) 10, 3) 32,","2"));
		((Map)totmap.get(3)).put(7, new Question("7+3 :1) 10, 2) 23, 3) 38,","1"));
		((Map)totmap.get(3)).put(8, new Question("8+2 :1) 15, 2) 22, 3) 10,","3"));
		((Map)totmap.get(3)).put(9, new Question("9+1 :1) 10, 2) 01, 3) 0.1,","1"));
		((Map)totmap.get(3)).put(10, new Question("1+1 :1) 1, 2) 2, 3) 3,","2"));
		((Map)totmap.get(3)).put(11, new Question("12+7=?","19"));
		((Map)totmap.get(3)).put(12, new Question("10+8=?","18"));
		((Map)totmap.get(3)).put(13, new Question("55+4=?","59"));
		((Map)totmap.get(3)).put(14, new Question("36+2=?","38"));
		((Map)totmap.get(3)).put(15, new Question("14+1=?","15"));
		((Map)totmap.get(3)).put(16, new Question("127+2=?","129"));
		((Map)totmap.get(3)).put(17, new Question("12+5=?","17"));
		((Map)totmap.get(3)).put(18, new Question("13+7=?","20"));
		((Map)totmap.get(3)).put(19, new Question("24+1=?","25"));
		((Map)totmap.get(3)).put(20, new Question("36+2=?","38"));
		((Map)totmap.get(3)).put(21, new Question("",""));
		
		
		
		
	}	
	
	public void print(){
		int key=0;
		this.result();
		Iterator it=((List)pass.get(0)).iterator();
		Iterator it1=((List)pass.get(1)).iterator();
		Iterator it2=((List)pass.get(2)).iterator();
		
		
		while(it.hasNext()){
			if(key==0){
				System.out.println("─────────────국어 시험의 pass문제 및 정답─────────────");
			}
			key=(int)it.next();
			
			System.out.println(key+"번문제 : "+((Question)((Map)totmap.get(1)).get(key)).q+"\t정답 : "+((Question)((Map)totmap.get(1)).get(key)).a);
			
			}
		
		key=0;
		
		while(it1.hasNext()){
			if(key==0){
				System.out.println("─────────────영어 시험의 pass문제 및 정답─────────────");
			}
			key=(int)it1.next();
			
			System.out.println(key+"번문제 : "+((Question)((Map)totmap.get(2)).get(key)).q+"\t정답 : "+((Question)((Map)totmap.get(2)).get(key)).a);
			
			}
		
		key=0;
		
		while(it2.hasNext()){
			if(key==0){
				System.out.println("─────────────수학 시험의 pass문제 및 정답─────────────");
			}
			key=(int)it2.next();
			
			System.out.println(key+"번문제 : "+((Question)((Map)totmap.get(3)).get(key)).q+"\t정답 : "+((Question)((Map)totmap.get(3)).get(key)).a);
			
			}
		
		System.out.println();
		System.out.println();
			
		System.out.println("\t\t정답\t\t패스\t\t시간\t\t점수\t\t총점\t\t평균");
		for (int i = 0; i < questionIndex; i++) {
			System.out.println(arr[i]+"시험 \t "+qClear[i]+"  \t\t "+passSu[i]+"\t\t"+totTimeJum[i]+"\t\t"+jum[i]+"\t\t"+sum+"\t\t"+avg);
		}
		
	}

	private void result() {
		
			for(int i=0; i<questionIndex; i++){
			this.jum[i]+=totTimeJum[i];
			this.sum+=jum[i];
			}
			this.avg=sum/questionIndex;
		
	}	
}




class ThreadTime extends Thread{
	Total tot;
	int timeJum=60;
	
	
	public ThreadTime(Total tot) {
		this.tot=tot;
	}
	
	
	@Override
	public void run() {
		for(int i=timeJum; i>=0; i--){	
			try {
				if(tot.stop){
					break;
				}
				System.out.println("Time : "+i);
				sleep(1000);
				this.timeJum--;
				tot.totTimeJum[tot.timeIndex]=timeJum;
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
			
		this.tot.timeIndex++;		
		this.tot.stop=true;
		this.tot.mainwhile=true;

	}

}





class ThreadQuest extends Thread{
	Total tot;
	
	public ThreadQuest(Total tot) {
		this.tot=tot;
		
	}
	
	@Override
	public void run() {
		
		Iterator it = ((Map)tot.totmap.get(tot.questionIndex)).keySet().iterator();
		int key=0;
		String res="";
		

		
		while(it.hasNext()){
			if(tot.stop)
				break;
			
			if(key==0){
			key=(int)it.next();
			}
			
			res = JOptionPane.showInputDialog(key+"번 문제 : "+((Question)((Map)tot.totmap.get(tot.questionIndex)).get(key)).q);
			
			if((((Question)((Map)tot.totmap.get(tot.questionIndex)).get(key)).a).equals(res)){
				System.out.println("정답!");
				tot.qClear[tot.questionIndex-1]++;
				key=(int)it.next();
			}
			
			else if(res.equals("p")){
				System.out.println("Pass!!!");
				((List)tot.pass.get(tot.arrayIndex)).add(key);
				tot.passSu[tot.arrayIndex]++;
				key=(int)it.next();
			}
			
		}
		
		tot.arrayIndex++;
		tot.stop=true;
		tot.mainwhile=true;
		tot.jum[tot.questionIndex-1]=(tot.qClear[tot.questionIndex-1])*20;
		
		if(tot.questionIndex<3)
		this.tot.questionIndex++;
		
	}
}



public class ThreadQuestion {
	static int in=0;	
	static String [] arr = {"국어","영어","수학"};
	
	
	public static void starting(int i,Total tot){
		if(i>=3)
			return;
		
	
		in = JOptionPane.showConfirmDialog(null,arr[i]+"시험을 응시하시겠습니까?");	
		
		if(in==0){	
			tot.stop=false;
		new ThreadQuest(tot).start();
		new ThreadTime(tot).start();
		}else{
			tot.mainTimeOver=true;
		}
		
		
	}
	
	public static void main(String [] args){
		
		Total tot = new Total();
		int i=0;
		
		 while(in==0){
			 
			if(tot.mainwhile){
				tot.mainwhile=false;
				starting(i,tot);
				i++;
			} 
			
			if(i==5 || tot.mainTimeOver){
				break;
			}
		
		}

		tot.print();
		
	}

}
