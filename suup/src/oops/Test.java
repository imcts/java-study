package oops;

abstract class Parent{
	//�θ� Ŭ���� : ��� --- �հ�, ���հ��� �Ǵ�.
	String res = "���հ�";
	
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
			super.res="�հ�";
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
		Stud std = new Stud("ȫ�浿",90);
		
		Parent p = new College(std);
		
	}
	
}
