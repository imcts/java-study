package excep_p;


public class UserExcep_c {
	public static void main(String [] args){
		
		try{
			
			System.out.println("����.");
			
		/*	Exception eee = new Exception();
			
			throw eee;*/
			
			throw new Exception("����� ���� ������ ����������");
			
			
			//System.out.println("�� �� ������."); ������ ���� ������ ������ ������, �� �����δ� ������ �� ���� ����.

			
			
		}catch(Exception e){ //����� ���� �ͼ����� �����Ҷ����� catch�ο��� �޴� �༮�� ���� �θ���̾�� �Ѵ�. ������ �ͼ����̰� 
			//�Ʒ����� �Ƹ�����ƽ �ͼ����̶�� ������ �ȴ�.
			System.out.println(e.getMessage());
		}
		
		
	}
}
