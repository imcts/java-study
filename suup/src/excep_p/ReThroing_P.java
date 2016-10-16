package excep_p;

class ReThrow{
	
	void mom() throws Exception{
		
		
		try {
			leeEon();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("mom 贸府 : "+e.getMessage());
			throw e;
		}
	}
	
	void leeEon() throws Exception{
		throw new Exception("端轿.");		
	}
}


public class ReThroing_P {
	public static void main(String [] args){
		 try {
			new ReThrow().mom();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("酒狐啊 贸府 : "+e.getMessage());
		};
		
		
		
	}

}
