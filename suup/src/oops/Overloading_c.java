package oops;

class Over_c{
	void meth_ori(int a, int b){
		
		System.out.println("貝 神軒陥~"+(a+b));
	}
	void meth_ori(int a, int b, int c){
		
		System.out.println("貝 鯵呪亜 含虞推~~"+(a+b+c));
	}
	void meth_ori(int a, String b){
		System.out.println("貝 切戟莫戚 含虞推"+(a+b));
	}
	void meth_ori(String a, int b){
		System.out.println("しししし?"+(a+b));
	}
	//神獄稽漁税井酔拭澗 昔呪亜 陥牽暗蟹, 昔呪税 切戟莫戚 陥牽暗蟹, 昔呪税 切戟莫税 是帖亜 陥研 井酔拭幻 失験吉陥. 
	
	
}

class Over_Shape{
	double pi = 3.14,area,border;; 
	String name;
	
	void triangle(int h, int w){
		//亜稽咽馬奄 室稽 蟹刊奄2 
		
		System.out.println("送唖誌唖莫税 覚戚 : "+(h*w)/2);
	}

	void triangle(int a, int b, int c){		
		System.out.println("送唖 誌唖莫税 却傾 : "+(a+b+c));
	}
	
	void shape(int r){
		name = "据";
		area = pi*r*r;
		border = pi*2*r;
		print();
	}
	
	void shape(int w, int h){
		name = "据";
		area = w*h;
		border = (h+w)*2;
		print();
		}
	void print(){
		System.out.println(name+"  税 覚戚 : "+area);
		System.out.println(name+"  税 却傾 : "+border);
	}
	
	void area(int r){
		System.out.println("据税 覚戚 : "+r*r*pi);
		System.out.println("据税 却傾 : "+2*r*pi);
	}
	void area(int h,int w){
		System.out.println("紫唖莫税 覚戚 : "+h*w);
		System.out.println("紫唖莫税 却傾 : "+(h+w)*2);
	}
	
	
}



public class Overloading_c {
	public static void main(String [] args){
		Over_c ov = new Over_c();
		ov.meth_ori(4, 6);
		ov.meth_ori(4, 5, 6);
		ov.meth_ori(4, "しし?");
		ov.meth_ori("しし", 4);
		
		
		Over_Shape os = new Over_Shape();
		
		os.area(5);
		os.area(5, 4);
		
		System.out.println();
		
		
		
		os.shape(5);
		os.shape(5, 4);
		
		
		os.triangle(4, 5);
		os.triangle(4, 5, 9);
		
		
		
		
	/*	 縦: (購痕)／(株戚)＼2*/
		
		
		
		
	}
}
