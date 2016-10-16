package mypakege;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Samho{
	String [] samho={"대화","주엽","정발산","마두","백석","화정","원당","삼송","지축","구파발","연신내","불광","녹번",
			"홍제","무악재","독립문","경복궁","안국","종로3가","을지로3가","충무로","동대입구","약수","금호","옥수","압구정","신사","잠원","고속터미널"
			+ "교대","남부터미널","양재","매봉","도곡","대치","학여울","대청","일원","수서","가락시장","경찰병원","오금"};
	
	}
	

class Ilho{
	String [] ilho={"인천","동인천","도원","제물포","도화","주안","간석","동암","백운","부평","부개","송내","중동",
			"부천","소사","역곡","온수","오류동","개봉","구일","구로","신도림","영등포","신길","대방","노량진","용산",
			"남영","서울역","시청","종각","종로3가","종로5가","동대문","동묘앞","신설동","청량리","회기","외대앞",
			"신이문","석계","광운대","월계","녹천","창동","방학","도봉","도봉산","망월사","회룡","의정부","기능","녹양",
			"양주","덕계","덕정","지행","동두천중앙","보산","동두천","소요산"};

}
class TotalSubWay{
	String start,end,startho,endho,change;
	String [] sam,il;
	ArrayList samtime,iltime,samList,ilList;
	int count=0,totaltime=0;
	
	public TotalSubWay(Ilho i , Samho sam) {
		this.sam=sam.samho;
		this.il=i.ilho;
		samtime=new ArrayList();
		iltime=new ArrayList();
		ilList=new ArrayList();
		samList=new ArrayList();
		start="인천";
		end="금호";
		moving();
	}

	private void moving() {
		getTime();
		hosun();
		result();
	}

	private void result() {
		
		if(startho.equals(endho)){//두개의 노선이 같다면.
			if(startho.equals("3호선")){
				iteratornext();
			}
		}
		if(startho.equals(endho)){//두개의 노선이 같다면.
			if(startho.equals("3호선")){
				listIterator();
			}
		}
		
		if(startho.equals(endho)){//두개의 노선이 같다면.
			if(startho.equals("1호선")){
				iteratornext();
			}
		}
		if(startho.equals(endho)){//두개의 노선이 같다면.
			if(startho.equals("1호선")){
				listIterator();
			}
		}
		
		if(!startho.equals(endho)){
			this.getChange();
			
			if(startho.equals("3호선")){
				changeIter();
			}
					
			if(startho.equals("3호선")){
					changeListiter();
			}
			if(startho.equals("1호선")){
				Iterator it = ilList.iterator();
				Iterator itime = iltime.iterator();
				stop :while(it.hasNext()&&itime.hasNext()){
					itime.next();
					if(it.next().equals(start)){	
						while(true){
							if(!it.hasNext()){
								this.totaltime=0;
								this.count=0;
								break stop;
							}
							this.totaltime+=(int)itime.next();
							if(it.next().equals(change)){
								System.out.println("시작역 : "+start+"  "+startho);
								System.out.println("환승역 : "+change+"  "+startho);
								System.out.println("역의 개수 :"+this.count+"개");
								System.out.println("소요 시간 : "+this.totaltime+"분");
								this.totaltime=0;
								this.count=0;
								break stop;
							}
							this.count++;
						}
					}					
				}
				
			}
			if(startho.equals("1호선")){
				ListIterator it = ilList.listIterator();
				ListIterator itime = iltime.listIterator();
				while(it.hasNext()){
					it.next();
					itime.next();
				}
				stop1 :while(true){
					itime.previous();
					if(it.previous().equals(start)){
						while(true){
							if(!it.hasPrevious()){
								this.totaltime=0;
								this.count=0;
								break stop1;
							}
							this.totaltime+=(int)itime.previous();
							if(it.previous().equals(change)){
								System.out.println("시작역 : "+start+"  "+startho);
								System.out.println("환승역 : "+change+"  "+startho);
								System.out.println("역의 개수 :"+this.count+"개");
								System.out.println("소요 시간 : "+this.totaltime+"분");
								this.totaltime=0;
								this.count=0;
								break stop1;
							}
							this.count++;
						}
					}					
				}
			}
				
		if(startho.equals("3호선") && change.equals("종로3가")){
					Iterator it = ilList.iterator();
					Iterator itime = iltime.iterator();
					stop :while(it.hasNext()&&itime.hasNext()){
						itime.next();
						if(it.next().equals(change)){	
							while(true){
								if(!it.hasNext()){
									this.totaltime=0;
									this.count=0;
									break stop;
								}
								this.totaltime+=(int)itime.next();
								if(it.next().equals(end)){
									System.out.println("환승역 : "+change+"  "+startho);
									System.out.println("도착역 : "+end+"  "+endho);
									System.out.println("역의 개수 :"+this.count+"개");
									System.out.println("소요 시간 : "+this.totaltime+"분");
									this.totaltime=0;
									this.count=0;
									break stop;
								}
								this.count++;
							}
						}					
					}
				}
				
				
				
				if(startho.equals("1호선") && change.equals("종로3가")){
					Iterator it = samList.iterator();
					Iterator itime = samtime.iterator();
					stop :while(it.hasNext()&&itime.hasNext()){
						itime.next();
						if(it.next().equals(change)){	
							while(true){
								if(!it.hasNext()){
									this.totaltime=0;
									this.count=0;
									break stop;
								}
								this.totaltime+=(int)itime.next();
								if(it.next().equals(end)){
									System.out.println("환승역 : "+change+"  "+startho);
									System.out.println("도착역 : "+end+"  "+endho);
									System.out.println("역의 개수 :"+this.count+"개");
									System.out.println("소요 시간 : "+this.totaltime+"분");
									this.totaltime=0;
									this.count=0;
									break stop;
								}
								this.count++;
							}
						}					
					}
				}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
}
	
	
	
	
	
			
	
			
	

	private void changeListiter() {
		ListIterator it = samList.listIterator();
		ListIterator itime = samtime.listIterator();
		while(it.hasNext()){
			it.next();
			itime.next();
		}
		stop1 :while(true){
			itime.previous();
			if(it.previous().equals(start)){
				while(true){
					if(!it.hasPrevious()){
						this.totaltime=0;
						this.count=0;
						break stop1;
					}
					this.totaltime+=(int)itime.previous();
					if(it.previous().equals(change)){
						System.out.println("시작역 : "+start+"  "+startho);
						System.out.println("환승역 : "+change+"  "+startho);
						System.out.println("역의 개수 :"+this.count+"개");
						System.out.println("소요 시간 : "+this.totaltime+"분");
						this.totaltime=0;
						this.count=0;
						break stop1;
					}
					this.count++;
				}
			}					
		}
		
	}

	private void changeIter() {

		Iterator it = samList.iterator();
		Iterator itime = samtime.iterator();
		stop :while(it.hasNext()&&itime.hasNext()){
			itime.next();
			if(it.next().equals(start)){	
				while(true){
					if(!it.hasNext()){
						this.totaltime=0;
						this.count=0;
						break stop;
					}
					this.totaltime+=(int)itime.next();
					if(it.next().equals(change)){
						System.out.println("시작역 : "+start+"  "+startho);
						System.out.println("환승역 : "+change+"  "+startho);
						System.out.println("역의 개수 :"+this.count+"개");
						System.out.println("소요 시간 : "+this.totaltime+"분");
						this.totaltime=0;
						this.count=0;
						break stop;
					}
					this.count++;
				}
			}					
		}
		
	}

	private void iteratornext() {
		Iterator it = samList.iterator();
		Iterator itime = samtime.iterator();
		stop :while(it.hasNext()&&itime.hasNext()){
			itime.next();
			if(it.next().equals(start)){	
				while(true){
					if(!it.hasNext())
						break stop;
					this.totaltime+=(int)itime.next();
					if(it.next().equals(end)){
						print();
						break stop;
					}
					this.count++;
				}
			}					
		}
		
	}

	private void listIterator() {
		ListIterator it = ilList.listIterator();
		ListIterator itime = iltime.listIterator();
		while(it.hasNext()){
			it.next();
			itime.next();
		}
		stop1 :while(true){
			itime.previous();
			if(it.previous().equals(start)){
				while(true){
					if(!it.hasPrevious())
						break stop1;
					this.totaltime+=(int)itime.previous();
					if(it.previous().equals(end)){
						print();
						break stop1;
					}
					this.count++;
				}
			}					
		}
	}

	private void getChange() {
		this.samList.retainAll(ilList);
		Iterator ex = samList.iterator();
		this.change=(String)ex.next();
		
		getTime();
		
		
		
	}

	private void print() {
		System.out.println("시작역 : "+start+"  "+startho);
		System.out.println("도착역 : "+end+"  "+endho);
		System.out.println("역의 개수 :"+this.count+"개");
		System.out.println("소요 시간 : "+this.totaltime+"분");
		this.count=0;
		this.totaltime=0;
	}

	private void hosun() {
		for(int i=0; i<samList.size(); i++){
			String buf=(String)samList.get(i);
			if(buf.equals(start)){
				this.startho="3호선";
			}
			else if(buf.equals(end)){
				this.endho="3호선";
			}
			
		}
		for(int i=0; i<ilList.size(); i++){
			String buf=(String)ilList.get(i);
			if(buf.equals(start)){
				this.startho="1호선";
			}
			else if(buf.equals(end)){
				this.endho="1호선";
			}
		}
		
	}

	private void getTime() {
		samList.clear();
		ilList.clear();
		samtime.clear();
		iltime.clear();
		
		for(int i=0; i<sam.length; i++){
			samList.add(sam[i]);
			samtime.add((int)(Math.random()*5)+1);
		}
		for(int i=0; i<il.length; i++){
			ilList.add(il[i]);
			iltime.add((int)(Math.random()*5)+1);
		}
	}
	
	
	
	
}


public class Subway {
	public static void main(String [] args){
		Samho sam = new Samho();
		Ilho il = new Ilho();
		new TotalSubWay(il,sam);
		
	}
}
