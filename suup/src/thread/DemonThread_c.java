package thread;


class DMTh extends Thread{
	
	@Override
	public void run() {
		while(true){
			
			try {
				
				sleep(3000);
				System.out.println("자동저장");
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}


class DMTh2 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i <= 40; i++) {
			try {
				sleep(1000);
				System.out.println("DM"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class DemonThread_c {
	public static void main(String [] args){
		
		DMTh t = new DMTh(); //맨 마지막까지 살아있는 스레드가 죽어야 데몬스레드가 종결됨. 
		new DMTh2().start();
		
		t.setDaemon(true); //fasle 는 그냥 계속 살아있게 된다. //true는 마지막 메소드가 죽을때까지 살아있게 된다. 
		//데몬설정은 반드시 스레드가 실행되기 전에 알려주어야 한다. 데몬이라는 것을. 
		t.start();
		
		
		
		
		for(int i=0; i<=20; i++){
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
