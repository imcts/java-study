package oops;

abstract class AbsSh{
	double area;
	String name;
	
	public AbsSh() {
		//cal(); 생성자의 우선순위때문에 부모 생성자가 훙훙훙훙 하는데 자식 생성자는 아직 생성도 되지 않았다. 상수를 받아 쓸거라면 의미가 없다. 각 클래스별로 초기값이 있을때, ㅇ_ㅇ; 그땐 사용가능함.
	}
	
	abstract void cal();
	
	
	void print(){
		cal();
		System.out.println(name+"의 넓이 : "+area);
		
	}
	
	
}

class AbsCir extends AbsSh{

	int r;
	double pi=3.14;
	
	
	public AbsCir(int r) {
		super();
		this.r=r;
		name="원";
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
