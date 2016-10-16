package oops;

class Con_sh{
	
	double pi=3.14, area, border; 
	String name;
	
	
	public Con_sh() {
	
		this(5,6);
		
		//	print();
		
	}
	
	
	//기본 생성자는 힙에 인스턴스 공간을 잡아주는 것이다. 디폴트 생성자의 경우에는 자신의 값을 정의해야만 힙 영역에 다른 인스턴스 변수들의 공간을 잡을 수 있기 때문에 맨 먼저 올라가야만 한다.
	//생성자 안에 생성자를 사용할때에는 오로지 생성자만이 우선순위가 될 수 있다.
	public Con_sh(int w, int h) {
		
		//this();

		area = w*h; 
		border = (h+w)*2;
		
		name = "사각형";
		
		//print();
		
	}
	
	
	void print(){
		System.out.println(name + "의 넓이 : " + area);
		System.out.println(name + "의 둘레 : " + border);
		
	}
}


public class Con_Shape {
	public static void main(String [] args ){
		//Con_sh con = new Con_sh(5);
		//new Con_sh(4,5); //익명 클래스.
		
		
		new Con_sh().print();
		
		
		
		
		
	}
}
