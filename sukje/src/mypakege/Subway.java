package mypakege;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Samho{
	String [] samho={"��ȭ","�ֿ�","���߻�","����","�鼮","ȭ��","����","���","����","���Ĺ�","���ų�","�ұ�","���",
			"ȫ��","������","������","�溹��","�ȱ�","����3��","������3��","�湫��","�����Ա�","���","��ȣ","����","�б���","�Ż�","���","����͹̳�"
			+ "����","�����͹̳�","����","�ź�","����","��ġ","�п���","��û","�Ͽ�","����","��������","��������","����"};
	
	}
	

class Ilho{
	String [] ilho={"��õ","����õ","����","������","��ȭ","�־�","����","����","���","����","�ΰ�","�۳�","�ߵ�",
			"��õ","�һ�","����","�¼�","������","����","����","����","�ŵ���","������","�ű�","���","�뷮��","���",
			"����","���￪","��û","����","����3��","����5��","���빮","������","�ż���","û����","ȸ��","�ܴ��",
			"���̹�","����","�����","����","��õ","â��","����","����","������","������","ȸ��","������","���","���",
			"����","����","����","����","����õ�߾�","����","����õ","�ҿ��"};

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
		start="��õ";
		end="��ȣ";
		moving();
	}

	private void moving() {
		getTime();
		hosun();
		result();
	}

	private void result() {
		
		if(startho.equals(endho)){//�ΰ��� �뼱�� ���ٸ�.
			if(startho.equals("3ȣ��")){
				iteratornext();
			}
		}
		if(startho.equals(endho)){//�ΰ��� �뼱�� ���ٸ�.
			if(startho.equals("3ȣ��")){
				listIterator();
			}
		}
		
		if(startho.equals(endho)){//�ΰ��� �뼱�� ���ٸ�.
			if(startho.equals("1ȣ��")){
				iteratornext();
			}
		}
		if(startho.equals(endho)){//�ΰ��� �뼱�� ���ٸ�.
			if(startho.equals("1ȣ��")){
				listIterator();
			}
		}
		
		if(!startho.equals(endho)){
			this.getChange();
			
			if(startho.equals("3ȣ��")){
				changeIter();
			}
					
			if(startho.equals("3ȣ��")){
					changeListiter();
			}
			if(startho.equals("1ȣ��")){
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
								System.out.println("���ۿ� : "+start+"  "+startho);
								System.out.println("ȯ�¿� : "+change+"  "+startho);
								System.out.println("���� ���� :"+this.count+"��");
								System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
								this.totaltime=0;
								this.count=0;
								break stop;
							}
							this.count++;
						}
					}					
				}
				
			}
			if(startho.equals("1ȣ��")){
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
								System.out.println("���ۿ� : "+start+"  "+startho);
								System.out.println("ȯ�¿� : "+change+"  "+startho);
								System.out.println("���� ���� :"+this.count+"��");
								System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
								this.totaltime=0;
								this.count=0;
								break stop1;
							}
							this.count++;
						}
					}					
				}
			}
				
		if(startho.equals("3ȣ��") && change.equals("����3��")){
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
									System.out.println("ȯ�¿� : "+change+"  "+startho);
									System.out.println("������ : "+end+"  "+endho);
									System.out.println("���� ���� :"+this.count+"��");
									System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
									this.totaltime=0;
									this.count=0;
									break stop;
								}
								this.count++;
							}
						}					
					}
				}
				
				
				
				if(startho.equals("1ȣ��") && change.equals("����3��")){
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
									System.out.println("ȯ�¿� : "+change+"  "+startho);
									System.out.println("������ : "+end+"  "+endho);
									System.out.println("���� ���� :"+this.count+"��");
									System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
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
						System.out.println("���ۿ� : "+start+"  "+startho);
						System.out.println("ȯ�¿� : "+change+"  "+startho);
						System.out.println("���� ���� :"+this.count+"��");
						System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
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
						System.out.println("���ۿ� : "+start+"  "+startho);
						System.out.println("ȯ�¿� : "+change+"  "+startho);
						System.out.println("���� ���� :"+this.count+"��");
						System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
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
		System.out.println("���ۿ� : "+start+"  "+startho);
		System.out.println("������ : "+end+"  "+endho);
		System.out.println("���� ���� :"+this.count+"��");
		System.out.println("�ҿ� �ð� : "+this.totaltime+"��");
		this.count=0;
		this.totaltime=0;
	}

	private void hosun() {
		for(int i=0; i<samList.size(); i++){
			String buf=(String)samList.get(i);
			if(buf.equals(start)){
				this.startho="3ȣ��";
			}
			else if(buf.equals(end)){
				this.endho="3ȣ��";
			}
			
		}
		for(int i=0; i<ilList.size(); i++){
			String buf=(String)ilList.get(i);
			if(buf.equals(start)){
				this.startho="1ȣ��";
			}
			else if(buf.equals(end)){
				this.endho="1ȣ��";
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
