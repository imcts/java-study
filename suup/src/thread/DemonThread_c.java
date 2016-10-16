package thread;


class DMTh extends Thread{
	
	@Override
	public void run() {
		while(true){
			
			try {
				
				sleep(3000);
				System.out.println("�ڵ�����");
				
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
		
		DMTh t = new DMTh(); //�� ���������� ����ִ� �����尡 �׾�� ���󽺷��尡 �����. 
		new DMTh2().start();
		
		t.setDaemon(true); //fasle �� �׳� ��� ����ְ� �ȴ�. //true�� ������ �޼ҵ尡 ���������� ����ְ� �ȴ�. 
		//�������� �ݵ�� �����尡 ����Ǳ� ���� �˷��־�� �Ѵ�. �����̶�� ����. 
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
