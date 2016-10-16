package oops;

class Over_c{
	void meth_ori(int a, int b){
		
		System.out.println("난 오리다~"+(a+b));
	}
	void meth_ori(int a, int b, int c){
		
		System.out.println("난 개수가 달라요~~"+(a+b+c));
	}
	void meth_ori(int a, String b){
		System.out.println("난 자료형이 달라요"+(a+b));
	}
	void meth_ori(String a, int b){
		System.out.println("ㅇㅇㅇㅇ?"+(a+b));
	}
	//오버로딩의경우에는 인수가 다르거나, 인수의 자료형이 다르거나, 인수의 자료형의 위치가 다를 경우에만 성립된다. 
	
	
}

class Over_Shape{
	double pi = 3.14,area,border;; 
	String name;
	
	void triangle(int h, int w){
		//가로곱하기 세로 나누기2 
		
		System.out.println("직각삼각형의 넓이 : "+(h*w)/2);
	}

	void triangle(int a, int b, int c){		
		System.out.println("직각 삼각형의 둘레 : "+(a+b+c));
	}
	
	void shape(int r){
		name = "원";
		area = pi*r*r;
		border = pi*2*r;
		print();
	}
	
	void shape(int w, int h){
		name = "원";
		area = w*h;
		border = (h+w)*2;
		print();
		}
	void print(){
		System.out.println(name+"  의 넓이 : "+area);
		System.out.println(name+"  의 둘레 : "+border);
	}
	
	void area(int r){
		System.out.println("원의 넓이 : "+r*r*pi);
		System.out.println("원의 둘레 : "+2*r*pi);
	}
	void area(int h,int w){
		System.out.println("사각형의 넓이 : "+h*w);
		System.out.println("사각형의 둘레 : "+(h+w)*2);
	}
	
	
}



public class Overloading_c {
	public static void main(String [] args){
		Over_c ov = new Over_c();
		ov.meth_ori(4, 6);
		ov.meth_ori(4, 5, 6);
		ov.meth_ori(4, "ㅇㅇ?");
		ov.meth_ori("ㅇㅇ", 4);
		
		
		Over_Shape os = new Over_Shape();
		
		os.area(5);
		os.area(5, 4);
		
		System.out.println();
		
		
		
		os.shape(5);
		os.shape(5, 4);
		
		
		os.triangle(4, 5);
		os.triangle(4, 5, 9);
		
		
		
		
	/*	 식: (밑변)×(높이)÷2*/
		
		
		
		
	}
}
