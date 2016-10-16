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
			t1.suspend(); //���߶�� ��ɾ�. 
			Thread.sleep(2000);
			t2.suspend(); //���߶�� ��ɾ�. 
			t1.resume();//�ٽ� ���� �϶�� ��ɾ� 
			t2.resume();
			t1.stop();
			t2.stop();
			t3.stop();
			
			
			Thread.sleep(3000);
			t1 = new ThSRS("*"); //�̷��� �ٽ� ���� ���ְ� ������ �Ѵ�. 
			t1.start(); //�ѹ� ������ �ٽ� �츱 �� ����. 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
