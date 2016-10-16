package thread;

class Test extends Thread {
	
	public void getList(){
		System.out.println("��ȭ��ȣ ����Ʈ�� �̾� �ɴϴ�");
	}
	
	public void checkList(){
		this.getList();
		
		System.out.println("��ȭ��ȣ ����Ʈ�� �� �մϴ�.");
		
		this.insertList();
	}
	
	public void insertList() {
		System.out.println("��ȭ��ȣ�� �μ�Ʈ �մϴ�.");
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
