package utile_p;

import java.util.Random;

public class random_p {
	public static void main(String [] args){
		Random r1 = new Random(1); //����� ���ڸ� �ְ� �Ǹ� �� ����� ���� ��� ���´�. �ұ�Ģ������ ������ �ְ� �ȴ�. 
														//�� �Ȱ��� �̸���.. -_-.... �� ��Ʈ�� ���� �ǰڴ� 
		
		
		System.out.println(r1.nextInt()); //�̳��� �׳� ��Ʈ�� �������� ���´�.
		System.out.println(r1.nextInt(10));  //�̳��� �׳� ��Ʈ�� �������� ���´�.
		System.out.println(r1.nextBoolean());  //�̳��� �׳� ��Ʈ�� �������� ���´�.
		System.out.println(r1.nextFloat());  //�̳��� �׳� ��Ʈ�� �������� ���´�.
		System.out.println(r1.nextGaussian());  //�̳��� �׳� ��Ʈ�� �������� ���´�.
		System.out.println(r1.nextLong());  //�̳��� �׳� ��Ʈ�� �������� ���´�.
	}
}
