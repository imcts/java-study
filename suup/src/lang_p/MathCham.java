package lang_p;

import java.util.Scanner;



public class MathCham {
	public static void main(String [] args){
		String [] str = {"����","������","���"};
		
		Scanner sc = new Scanner(System.in);
		int in=-1;
		
		
		while(true){
			System.out.println("�߾��� Game! �q�q�q ! ");
			System.out.println("0. ����, 1. ����, 2. ������, 3. ���");
			
			in = sc.nextInt();
			
			if(in==0){
				break;
			}
			
			int com  = (int)(Math.random()*3)+1;
			String res="��";
			
			if(com==in)
				res="��";
			
			System.out.println();
			System.out.println();
			
			System.out.println("���� ��� : " + res);
			
			System.out.println("��������");
		}
	}
}
