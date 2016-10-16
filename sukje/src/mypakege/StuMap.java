package mypakege;

import java.io.*;
import java.util.*;
import java.util.regex.*;

class Mapstu{
	String name,regex;
	int jum[]=new int[3];
	int avg, sum,num,rank=1;
	Pattern p;
	Matcher m;
	
	public Mapstu(String name, int num, int kor, int eng, int mat) {
		this.name=name;
		this.jum[0]=kor;
		this.jum[1]=eng;
		this.jum[2]=mat;
		this.num=num;
		
		this.formCheck();
		this.result();
		
	}

	private void result() {
		for(int i=0; i<jum.length; i++){
			this.sum+=jum[i];
		}
		this.avg=sum/jum.length;
	}

	private void formCheck() {
		this.regex="[a-zA-Z]{2,4}";
		this.namePattern(name,regex);
		this.regex="[0-9]{2,3}";
		this.jumPattern();
	}
	
	private void jumPattern() {
		
		for(int i=0; i<jum.length; i++){
			try {
				if(jum[i]<0 || jum[i] >100){
					throw new Exception("점수는 0부터 100점까지만 입력 가능 합니다.");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.exit(0);
			}
		}
		
	}

	private void namePattern(String name, String regex) {
		try{
		p=Pattern.compile(regex);
		m=p.matcher(name);
		if(!m.matches()){
			throw new Exception("이름은 2글자 이상 4글자 미만.");
		}

		}catch(Exception e){
			System.out.println(e.getMessage());
			System.exit(0);
		}
	
	}
	
}





class Resultte{
	Map totmap;
	int onemax,twomax,oneavg,twoavg;
	
	public Resultte() {
		this.totmap=new LinkedHashMap<>();
		input();
		max();
		totAvg();
		rank(this.onemax,1);
		rank(this.twomax,2);
		print(this.onemax,1,this.oneavg);
		print(this.twomax,2,this.twoavg);
		
		
	}
	private void print(int max, int index, int avg) {
		
		if(index==1)
		System.out.println("반\t번호\t이름\t국어\t영어\t수학\t총점\t평균\t등수\t반평균");
		
		for(int i=1,r=1; i<max+1; i++){
			for(int j=1; j<max+1; j++){
				Mapstu st = ((Mapstu)((Map)totmap.get(index)).get(j));
				if(st.rank==r){
					System.out.println(index+"\t"+st.num+"\t"+st.name+"\t"+st.jum[0]+"\t"+st.jum[1]+"\t"+
												st.jum[2]+"\t"+st.sum+"\t"+st.avg+"\t"+st.rank+"\t"+avg);
					r++;
				}			
			}
		}
		
	}
	private void rank(int max, int index) {
		
		for(int i=1; i<max+1; i++){
			for(int j=1; j<max+1; j++){
				
				if(((Mapstu)((Map)totmap.get(index)).get(i))	.avg <	((Mapstu)((Map)totmap.get(index)).get(j))	.avg){
					((Mapstu)((Map)totmap.get(index)).get(i))	.rank++;
				}				
			}
		}

	}
	
	private void totAvg() {
		int sum=0;
		
		for(int i=1; i<onemax+1; i++){
		sum += (int)((((Mapstu)((Map)(totmap.get(1))).get(i)).avg));
		}
		this.oneavg=sum/onemax;
		sum=0;
		
		for(int i=1; i<twomax+1; i++){
			sum += (int)((((Mapstu)((Map)(totmap.get(2))).get(i)).avg));
		}
		this.twoavg=sum/twomax;
		
		
	}
	private void max() {

		Iterator it = ((Map)(totmap.get(1))).keySet().iterator();
		
		 
		 while(it.hasNext()){//1반의 학생수를 구한다.
			 this.onemax=(int)it.next();
		 }
		 
		
		 it = ((Map)(totmap.get(2))).keySet().iterator();
		 
		 while(it.hasNext()){//2반의 학생수를 구한다.
			 this.twomax=(int)it.next();
			
		 }
	}
	private void input() {
		
		totmap.put(1, new TreeMap());
		totmap.put(2, new TreeMap());
		
		((Map)totmap.get(1)).put(1, new Mapstu("aaaa",1,89,67,89));
		((Map)totmap.get(2)).put(1, new Mapstu("bbb",1,86,58,78));
		((Map)totmap.get(1)).put(2, new Mapstu("ccc",2,58,87,90));
		((Map)totmap.get(1)).put(3, new Mapstu("ddd",3,67,78,56));
		((Map)totmap.get(2)).put(2, new Mapstu("eee",2,77,89,98));
		((Map)totmap.get(2)).put(3, new Mapstu("fff",3,98,79,98));
		((Map)totmap.get(1)).put(4, new Mapstu("ggg",4,100,55,77));
		
	}
	
}

public class StuMap {
	public static void main(String []args){	
		new Resultte();
	}
}
