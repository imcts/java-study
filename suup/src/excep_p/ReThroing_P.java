package excep_p;

class ReThrow{
	
	void mom() throws Exception{
		
		
		try {
			leeEon();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("mom ó�� : "+e.getMessage());
			throw e;
		}
	}
	
	void leeEon() throws Exception{
		throw new Exception("�˽Υ�.");		
	}
}


public class ReThroing_P {
	public static void main(String [] args){
		 try {
			new ReThrow().mom();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("�ƺ��� ó�� : "+e.getMessage());
		};
		
		
		
	}

}
