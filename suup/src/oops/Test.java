package oops;

abstract class Parent{
	//부모 클래스 : 계산 --- 합격, 불합격을 판단.
	String res = "불합격";
	
	abstract void cal();
	abstract void print();
	
}


class College extends Parent{
	Stud std;
	int num = 90;
	
	
	public College(Stud std) {
		this.std = std;
		cal();
		print();
	}
	
	void cal() {
		if(std.jum>=num){
			super.res="합격";
		}
		
	}
	
	void print() {
		System.out.println(res);
	}	
	
}

class Stud{
	
	String name;
	int jum;
	
	public Stud(String name, int jum) {
		this.name= name;
		this.jum=jum;
	}
	
}





public class Test {
	public static void main(String [] args){
		Stud std = new Stud("홍길동",90);
		
		Parent p = new College(std);
		
	}
	
}
