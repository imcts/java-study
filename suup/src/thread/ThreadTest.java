package thread;

class Test extends Thread {
	
	public void getList(){
		System.out.println("전화번호 리스트를 뽑아 옵니다");
	}
	
	public void checkList(){
		this.getList();
		
		System.out.println("전화번호 리스트를 비교 합니다.");
		
		this.insertList();
	}
	
	public void insertList() {
		System.out.println("전화번호를 인서트 합니다.");
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				i++;
				
				if(i % 5 == 0)
					this.checkList();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {
	public static void main(String [] args){
		new Test().run();
	}
}
