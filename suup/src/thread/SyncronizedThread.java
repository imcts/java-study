package thread;


class Sysnh implements Runnable{
	int a=0;
	
	@Override
	public void run() {
		int b=0;
		
		String name = Thread.currentThread().getName(); //���� ���� ������ �����尡 ������.
		
		while(b<3){
			System.out.println(name+"  b:" +  ++b);			
			System.out.println(name+"  a:" +  ++a);
			System.out.println();
			
		}
	}
	
}

public class SyncronizedThread {
	public static void main(String [] args){
		Sysnh r= 	new Sysnh();
		
		Thread t1 = new Thread(r,"t1");
		Thread t2 = new Thread(r,"t2");
		
		t1.start();
		t2.start();
		
		
		
		
		
		
	}
}
