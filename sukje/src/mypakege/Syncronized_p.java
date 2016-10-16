package mypakege;

class YongDon{
	int total=100,money=0, abba=0,addal=0;
}

class Gmgo extends Thread{
	YongDon yong;
	int money=0;
	
	public Gmgo(YongDon yong) {
		this. yong = yong;
	}
	
	public synchronized void money(){
	
		
		if(Thread.currentThread().getName().equals("¾Æºü") && yong.total>0){
			return;
		}
		
		try {
			sleep(800);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(yong.total<=0 && Thread.currentThread().getName().equals("¾Æºü")){
			this.money=(int)(Math.random()*100)+1;
			yong.total+=money;
			yong.abba+=money;
			System.out.println("¾Æºü°¡ µ·À» ¹ú¾î¿È : "+money);
			System.out.println("ÀÜ°í : "+yong.total);
			
		}
		else if(yong.total>0 && Thread.currentThread().getName().equals("µþ") || Thread.currentThread().getName().equals("¾Æµé")){
			yong.total-=money;
			yong.addal+=money;			
			System.out.println(Thread.currentThread().getName()+"ÀÌ "+money+"¸¸Å­ °¡Á®°¨");
			if(yong.total<0)
				yong.total=0;
			
			System.out.println("ÀÜ°í : "+yong.total);
		}
		
	}
	
	@Override
	public void run() {		
		while(true){
				
				this.money=(int)(Math.random()*30)+1;
				money();
		}
	}
}


public class Syncronized_p {
	public static void main(String [] args){
		Gmgo gm = new Gmgo(new YongDon());
		new Thread(gm,"¾Æµé").start();
		new Thread(gm,"µþ").start();
		new Thread(gm,"¾Æºü").start();
			
	}
}
