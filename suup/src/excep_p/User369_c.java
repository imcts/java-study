package excep_p;

public class User369_c {
	public static void main(String [] args) {
		for(int i=1; i<=20; i++){
			
			try {
				
				if(i %10!=0 && i%10%3==0){
					
					throw new Exception("¦");
				
				}
				
				System.out.println(i);
				
			}catch (Exception e) { 
				System.out.println(e.getMessage());
			}
			
		}
	}
}

