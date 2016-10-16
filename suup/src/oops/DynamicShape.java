package oops;

class DyShape{
	
	double area ;
	String name;
	
	
	
	
	void print(){
		System.out.println(name+"�� ���� : " + area);
		
	}
}

class DyCir extends DyShape{
	
	double pi = 3.14;
	int r;
	public DyCir(int r) {
		this.r=r;
		super.area = r*r*pi;
		super.name = "��";
	}
	
	@Override
	void print() {
	
		super.print();
		System.out.println("������ : " +r);
	}
}


class DyNeMO extends DyShape{
	int w, h;
	
	public DyNeMO(int w, int h) {
		this.w = w;
		this.h = h;
		super.area = w*h;
		super.name="�簢��";
		
	}
	
	void print(){
		super.print();
		System.out.println("���� ���� : "+(w+h)*2+"cm");
		
	}
}

public class DynamicShape {
	public static void main(String [] args){
		/*DyShape ds;
		DyCir cir= new DyCir(5);
		DyNeMO dn = new DyNeMO(5, 4);
		
		ds=cir;
		
		ds.print();*/
		
		
		DyShape [] ds = {
				new DyCir(5),
				new DyNeMO(5, 4)
		};
		
		ds[0].print();
		ds[1].print();
		
	
		//a������ : 50,30,20 , 
		//b������ :  40,40,20,
		//c������ : 30,40,30,
		//
		
		
	}
}
