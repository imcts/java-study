package oops;


class Inh_UserParent{
	int a=20;
	
	int [] arr;
	
	public Inh_UserParent(int a) {	
		this.a=a;
		
		arr = new int[a];
		
		System.out.println("�θ� ����� ���� ������"+this.a);	
	}
	
	public Inh_UserParent() {
		System.out.println("�θ� �⺻ ������"+this.a);
	}
	
}

class Inh_UserChild extends Inh_UserParent
{ 
	int aa=10;
	static int setA(){
		return 10;
	}
	
	public Inh_UserChild(int a) {
		
		//super.a=a; �����ڰ� ���� �� ������ �Ǿ�� �Ѵ�.
		//super(aa); aa�� �������� ���� �ʾҴ�. �׷��� ���� �����ϱ� ������ �߻�. 	
		super(setA());
		
		System.out.println("�ڽ� ����� ������ ������ ");
		
		//�ݵ��!!! �θ� �����ں��� ���� ������ ���� �ؾ� �Ѵ�. �ڽ� �����ڰ� �����ɶ� �θ��� ����� �� �����־�� �ϰ�, ����� �θ��� ����� ���� �� ������� ������ �ڽ��� �����ڶ� ����� ���������.
		//�θ� �����ڴ� �� ���� �� �Ŀ��� �ڽİ� ���� �����ϴ°�. 
	}
	
	public Inh_UserChild() {
		// TODO Auto-generated constructor stub
		super.a = 70; //��� �̹� �θ� �����ڰ� �� ���̱� ������ �����ϴ�.
		System.out.println("�ڽ� �⺻ ������");
	}
	
}


public class Inh_UserCon_c {
	public static void main(String [] args){
		int aa = 10;

		Inh_UserChild a = new Inh_UserChild(10);
		
		System.out.println(a.a);
	}
}
