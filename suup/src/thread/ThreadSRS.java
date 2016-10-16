package thread;


class ThSRS extends Thread{
	
	public ThSRS(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(true){
			try {
				
				System.out.println(getName());
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadSRS {
	public static void main(String [] args){
		ThSRS t1 = new ThSRS("*");
		ThSRS t2 = new ThSRS("**");
		ThSRS t3 = new ThSRS("***");
	
		t1.start();
		t2.start();
		t3.start();
		
		
		try {
			Thread.sleep(2000);
			t1.suspend(); //멈추라는 명령어. 
			Thread.sleep(2000);
			t2.suspend(); //멈추라는 명령어. 
			t1.resume();//다시 시작 하라는 명령어 
			t2.resume();
			t1.stop();
			t2.stop();
			t3.stop();
			
			
			Thread.sleep(3000);
			t1 = new ThSRS("*"); //이렇게 다시 생성 해주고 돌려야 한다. 
			t1.start(); //한번 죽은건 다시 살릴 수 없다. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
