package thread;


class SyncDM implements Runnable{
	int total = 100;
	int ddal=0, adle=0,abba=0;
	
	
	synchronized void showMetheMoney(int money){//��ũ�� ��������̱⶧���� ! ����� �Ѱ��ǽ����常
		//������ �����ϴ�. 1���� ������ ���������� �̿��Ѵ�.
		
		
		if(total >=money){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(Thread.currentThread().getName().equals("�Ƶ�")){
			adle+=money;
			total-=money;
		}
		else if(Thread.currentThread().getName().equals("��")){
			ddal+=money;
			total-=money;
		}
		else{
			abba+=money;
			total+=money;
		}
		
		
		
		//System.out.println("\t"+Thread.currentThread().getName()+":"+money);
		System.out.println("�ܾ� : " +total);
		System.out.println("�ƺ��� ������ : "+abba);
		System.out.println("���� ���� �� : "+ddal);
		System.out.println("�Ƶ��� ���� �� : "+adle);
		
		
	}
	
	}
	
	
	@Override
	public void run() { //���޼ҵ带 ����ؼ� ��. 
		while(total>0){//total���� 0���� Ŀ�� �̰� ��밡��
			int money = (int)(Math.random()*30)+1;//int money�� ���� �������� �޾ƿ�.
			showMetheMoney(money);//money���� ��� ��.
			
			
			//�ñ������� ��ũ�γ�����尡 �ɷ��ִ� �޼ҵ忡 �����Ϸ� �Ҷ�. �ٸ� ���޼ҵ忡 ������ ���ٸ�..?
			//�� �ѹ��� �����ϰ� ���ƹ�������? ������� ������ ������ �Ϸ���? 
			
			
			//��.start()�� �����Ű�� ������ �� �޼ҵ忡�� ���µ�, ������ ������� ���.
			//������ �ѹ��� �����Ѵ�. 
			// while���� ������ ���� ���������� �����Ų�ٸ�.
			
		}
	}
}


public class SynchDragonMoney_c {
	public static void main(String [] args){
		
		SyncDM r = new SyncDM();
		
		new Thread(r,"�Ƶ�").start(); //�����带 �����ϰ�, �������� Ÿ�ٰ��� �̸��� �Ѱ���. 
		new Thread(r,"��").start(); //�ش� Ŭ������ ������ Thread�� ��ӹ޾Ұ�, �� ��ӹ������� run�޼ҵ��̿�
		new Thread(r,"�ƺ�").start(); 
		
	}

}
