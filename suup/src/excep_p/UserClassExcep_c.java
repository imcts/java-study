package excep_p;

class UserExcep extends Exception{
	String [] res = {"���̵� �ߺ�","��ȣ����","��ȭ��ȣ","�̸���","�����"};
	
	int num;

	
	public UserExcep() {
		
	}
	
	public UserExcep(int num) {
		super();
		this.num = num;
	}
	
	public UserExcep(String string) {
		super(string);
	} //�ͼ����� ��� �ް� �Ѵ�.
	
	public String getMessage(){
		
		return res[num];
		
	}
	
	public void printStackTrace(){
		
		System.out.println(res[num]);
	}
	
}


public class UserClassExcep_c {
	public static void main(String [] args){
		try {
			
			throw new UserExcep("����");
			
		} catch (UserExcep e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
