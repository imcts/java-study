package thread;

class ThStart extends Thread{
	
	public ThStart(String name) {
		super(name); //�������� �������߿� �̸��� �޴� ���� �ִ�.
		
	}
	
	
	
	@Override
	public void run() {
		
		for (int i = 0; i < 300; i++) {
			try {
				//sleep(10);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			
			System.out.print(getName());
		}
		
	}
}

public class ThreadStart_C {
	public static void main(String [] args){
	
		ThStart ts1 = new ThStart("+");
		ts1.start();
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		
		System.out.println("���� ������ �� : "+Thread.activeCount());
		System.out.println("�� ���� ������.");
		
		
	}
}
