package oops;

class JJ{ //�޼ҵ念���� ��. 
	int a=10; //�޼ҵ念�������� �� ����.'
	
	
	void math_1(){ //�޼ҵ� �������� ���ǵ�.
		System.out.println("�޼ҵ� 1 ����");
		math_2();
		System.out.println("�޼ҵ� 1 ��");
		
	}
	void math_2(){ //�޼ҵ� �������� ���ǵ�.
		System.out.println("�޼ҵ� 2 ����");
		
		math_3();
		
		System.out.println("�޼ҵ� 2 ��");
		
	}
	void math_3(){ //�޼ҵ� �������� ���ǵ�.
		System.out.println("�޼ҵ� 3 ����");
		System.out.println("�޼ҵ� 3 ��");
		
	}
	
}

public class JVM_c {
	public static void main(String [] args){
		JJ j1 = new JJ(); //�� ����. int a=10�� ������ �Ҵ��.
		JJ j2 = new JJ(); //�� ����. int a=10�� ������ �Ҵ��.
		
		j1.a = 100;
		
		System.out.println(j1.a);//���������� ���� ���� ������ �Ҵ�Ǳ� ������ ���� �ٸ� ���� �����Եȴ�. 
		System.out.println(j2.a);//
		
		j1.math_1();
		j2.math_1();
		//�޼ҵ� �������� ������ ������ ���� �������� �ʰ� ���� ������ ����ȴ�.
		
		
		
		
		
		
	}
}
