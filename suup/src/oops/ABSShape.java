package oops;

abstract class AbsSh{
	double area;
	String name;
	
	public AbsSh() {
		//cal(); �������� �켱���������� �θ� �����ڰ� �������� �ϴµ� �ڽ� �����ڴ� ���� ������ ���� �ʾҴ�. ����� �޾� ���Ŷ�� �ǹ̰� ����. �� Ŭ�������� �ʱⰪ�� ������, ��_��; �׶� ��밡����.
	}
	
	abstract void cal();
	
	
	void print(){
		cal();
		System.out.println(name+"�� ���� : "+area);
		
	}
	
	
}

class AbsCir extends AbsSh{

	int r;
	double pi=3.14;
	
	
	public AbsCir(int r) {
		super();
		this.r=r;
		name="��";
	}
	
	
	@Override
	void cal() {
		area = r*r*pi;
		
	}

	
}


public class ABSShape {

	public static void main(String[] args) {
		
		AbsSh as = new AbsCir(5);
		
		as.print();
		
	}

}
