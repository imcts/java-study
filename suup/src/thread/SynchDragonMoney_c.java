package thread;


class SyncDM implements Runnable{
	int total = 100;
	int ddal=0, adle=0,abba=0;
	
	
	synchronized void showMetheMoney(int money){//싱크로 나이즈드이기때문에 ! 여기는 한개의스레드만
		//진입이 가능하다. 1개씩 무조건 순차적으로 이용한다.
		
		
		if(total >=money){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(Thread.currentThread().getName().equals("아들")){
			adle+=money;
			total-=money;
		}
		else if(Thread.currentThread().getName().equals("딸")){
			ddal+=money;
			total-=money;
		}
		else{
			abba+=money;
			total+=money;
		}
		
		
		
		//System.out.println("\t"+Thread.currentThread().getName()+":"+money);
		System.out.println("잔액 : " +total);
		System.out.println("아빠가 넣은돈 : "+abba);
		System.out.println("딸이 빼간 돈 : "+ddal);
		System.out.println("아들이 빼간 돈 : "+adle);
		
		
	}
	
	}
	
	
	@Override
	public void run() { //런메소드를 사용해서 들어감. 
		while(total>0){//total값이 0보다 커야 이걸 사용가능
			int money = (int)(Math.random()*30)+1;//int money에 값을 랜덤으로 받아옴.
			showMetheMoney(money);//money값을 들고 들어감.
			
			
			//궁금한점은 싱크로나이즈드가 걸려있는 메소드에 진입하려 할때. 다른 런메소드에 와일이 없다면..?
			//단 한번만 진입하고 말아버리려나? 순서대로 진입을 무조건 하려나? 
			
			
			//런.start()를 실행시키면 무조건 저 메소드에는 들어가는데, 나머지 스레드는 대기.
			//무조건 한번은 진입한다. 
			// while문의 조건이 없이 단일적으로 실행시킨다면.
			
		}
	}
}


public class SynchDragonMoney_c {
	public static void main(String [] args){
		
		SyncDM r = new SyncDM();
		
		new Thread(r,"아들").start(); //스레드를 생성하고, 스레드의 타겟값과 이름을 넘겨줌. 
		new Thread(r,"딸").start(); //해당 클래스에 들어가보면 Thread를 상속받았고, 그 상속받은곳에 run메소드이용
		new Thread(r,"아빠").start(); 
		
	}

}
