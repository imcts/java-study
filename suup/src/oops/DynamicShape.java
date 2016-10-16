package oops;

class DyShape{
	
	double area ;
	String name;
	
	
	
	
	void print(){
		System.out.println(name+"의 넓이 : " + area);
		
	}
}

class DyCir extends DyShape{
	
	double pi = 3.14;
	int r;
	public DyCir(int r) {
		this.r=r;
		super.area = r*r*pi;
		super.name = "원";
	}
	
	@Override
	void print() {
	
		super.print();
		System.out.println("반지름 : " +r);
	}
}


class DyNeMO extends DyShape{
	int w, h;
	
	public DyNeMO(int w, int h) {
		this.w = w;
		this.h = h;
		super.area = w*h;
		super.name="사각형";
		
	}
	
	void print(){
		super.print();
		System.out.println("변의 길이 : "+(w+h)*2+"cm");
		
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
		
	
		//a대학은 : 50,30,20 , 
		//b대학은 :  40,40,20,
		//c대학은 : 30,40,30,
		//
		
		
	}
}
