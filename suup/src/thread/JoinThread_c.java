package thread;




public class JoinThread_c {
	public static void main(String [] args){
		ThStart t1 = new ThStart("+");
		ThStart t2 = new ThStart("/");
		ThStart t3 = new ThStart("-");
		
		
		t1.start();
		try {
			t1.join(800); //���⿡ ���ڸ� �����ְ� �Ǹ�, �̳༮�� ���۵ǰ� ������� �ð��� ������ ���� ���� ��������� ����ȴ�. 
			//��, t2.start�� ����ǰ� t1�� ����Ǹ� �ᱹ�� ����� ����. 
			//������ ���� ��� ������� �����ǰ� �̳༮�� ����Ǵµ�, 
			//�̳༮ ���������� �����̴� ���� �����尡 �Ǳ� ������, �ش� �����忡�� ������ �߻��ŵ�, main������ �� �� ����.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		t2.start();
		t3.start();
	}

}
