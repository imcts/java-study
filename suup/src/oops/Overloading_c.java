package oops;

class Over_c{
	void meth_ori(int a, int b){
		
		System.out.println("�� ������~"+(a+b));
	}
	void meth_ori(int a, int b, int c){
		
		System.out.println("�� ������ �޶��~~"+(a+b+c));
	}
	void meth_ori(int a, String b){
		System.out.println("�� �ڷ����� �޶��"+(a+b));
	}
	void meth_ori(String a, int b){
		System.out.println("��������?"+(a+b));
	}
	//�����ε��ǰ�쿡�� �μ��� �ٸ��ų�, �μ��� �ڷ����� �ٸ��ų�, �μ��� �ڷ����� ��ġ�� �ٸ� ��쿡�� �����ȴ�. 
	
	
}

class Over_Shape{
	double pi = 3.14,area,border;; 
	String name;
	
	void triangle(int h, int w){
		//���ΰ��ϱ� ���� ������2 
		
		System.out.println("�����ﰢ���� ���� : "+(h*w)/2);
	}

	void triangle(int a, int b, int c){		
		System.out.println("���� �ﰢ���� �ѷ� : "+(a+b+c));
	}
	
	void shape(int r){
		name = "��";
		area = pi*r*r;
		border = pi*2*r;
		print();
	}
	
	void shape(int w, int h){
		name = "��";
		area = w*h;
		border = (h+w)*2;
		print();
		}
	void print(){
		System.out.println(name+"  �� ���� : "+area);
		System.out.println(name+"  �� �ѷ� : "+border);
	}
	
	void area(int r){
		System.out.println("���� ���� : "+r*r*pi);
		System.out.println("���� �ѷ� : "+2*r*pi);
	}
	void area(int h,int w){
		System.out.println("�簢���� ���� : "+h*w);
		System.out.println("�簢���� �ѷ� : "+(h+w)*2);
	}
	
	
}



public class Overloading_c {
	public static void main(String [] args){
		Over_c ov = new Over_c();
		ov.meth_ori(4, 6);
		ov.meth_ori(4, 5, 6);
		ov.meth_ori(4, "����?");
		ov.meth_ori("����", 4);
		
		
		Over_Shape os = new Over_Shape();
		
		os.area(5);
		os.area(5, 4);
		
		System.out.println();
		
		
		
		os.shape(5);
		os.shape(5, 4);
		
		
		os.triangle(4, 5);
		os.triangle(4, 5, 9);
		
		
		
		
	/*	 ��: (�غ�)��(����)��2*/
		
		
		
		
	}
}
