package oops;

class Con_sh{
	
	double pi=3.14, area, border; 
	String name;
	
	
	public Con_sh() {
	
		this(5,6);
		
		//	print();
		
	}
	
	
	//�⺻ �����ڴ� ���� �ν��Ͻ� ������ ����ִ� ���̴�. ����Ʈ �������� ��쿡�� �ڽ��� ���� �����ؾ߸� �� ������ �ٸ� �ν��Ͻ� �������� ������ ���� �� �ֱ� ������ �� ���� �ö󰡾߸� �Ѵ�.
	//������ �ȿ� �����ڸ� ����Ҷ����� ������ �����ڸ��� �켱������ �� �� �ִ�.
	public Con_sh(int w, int h) {
		
		//this();

		area = w*h; 
		border = (h+w)*2;
		
		name = "�簢��";
		
		//print();
		
	}
	
	
	void print(){
		System.out.println(name + "�� ���� : " + area);
		System.out.println(name + "�� �ѷ� : " + border);
		
	}
}


public class Con_Shape {
	public static void main(String [] args ){
		//Con_sh con = new Con_sh(5);
		//new Con_sh(4,5); //�͸� Ŭ����.
		
		
		new Con_sh().print();
		
		
		
		
		
	}
}
