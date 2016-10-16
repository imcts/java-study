package mypakege;

class Result{
	Staff st;
	char arr[];
	String depart[] = {"����","��ȹ","�ѹ�","�λ�","����"};
	String filename[] = {"jpg","gif","bmp"};
	boolean checkdepart=false,numcheck=false, filenameCheck=false;
	int nowYear=2014, nowMonth=06,nowDay=24,inputYear,inputMonth,inputDay,salary=0;	
	
	
	
	public Result(Staff st) {
		this.st = st;
		this.arr=st.hiredate.toCharArray();
		this.inputYear=Integer.parseInt(st.hiredate.substring(0,4));
		this.inputMonth=Integer.parseInt(st.hiredate.substring(4,6));
		this.inputDay=Integer.parseInt(st.hiredate.substring(6));
		
		check();
		salary();
	}
	
	private void salary() {
		
		//���� ����. 2014�� 6�� 24��. 
		//�Է� ���� 2011�� 6�� 23��. 
		this.salary=this.nowYear-this.inputYear;
		
		
		if(this.nowMonth >= this.inputMonth){ //���� ���� �ϰ� �Ի��� �޺��� ũ��? 
			if(this.nowDay > this.inputDay){ //���� ���ڰ� �ϰ� �Ի��� ���ں��� ũ��?
				this.salary--;
			}	
		}
	
		System.out.println(st.name+"���� "+this.salary+"ȣ�� �Դϴ�.");
		
		
	}

	public void check(){
	
		
		try {
			if(st.name.length() < 2 || st.name.length() > 4){
				throw new Exception("�̸��� 2-4���ڸ� �Է� �����մϴ�.");
			}
			if(!(st.hiredate.length()==8)){
				throw new Exception("�Ի����ڴ� ex)20140624 �� �������� �Է��ϼž� �մϴ�.");
			}
			for(int i=0; i<depart.length; i++){
				if(st.depart.equals(this.depart[i])){
					this.checkdepart=true;
				}
			}
			if(this.checkdepart==false){
				throw new Exception("�μ����� ����,��ȹ,�ѹ�,�λ�,���� �ܿ��� �Է��� �� �����ϴ�.");
			}
			
			
			for(int i=0; i<arr.length; i++){
				if(arr[i]=='0'||arr[i]=='1'||arr[i]=='2'||arr[i]=='3'||arr[i]=='4'
						||arr[i]=='5'||arr[i]=='6'||arr[i]=='7'||arr[i]=='8'||arr[i]=='9'){
					this.numcheck=true;
					
				}else{
					this.numcheck=false;
				}
				if(numcheck==false){
					throw new Exception("�Ի����ڴ� ���ڿܿ��� �Է��Ͻ� �� �����ϴ�.");
				}
			}
			
			for(int i=0; i<this.filename.length; i++){
				if(st.filename.equalsIgnoreCase(this.filename[i])){
					this.filenameCheck=true;
				}
			}
			if(this.filenameCheck==false){
				 throw new Exception("�̹��� �������� jpg,gif,bmp�� ���ε� �����մϴ�");
				
			}
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("���� ���ε忡 �����ϼ̽��ϴ�!!!");
		
	
		
	}
	
}

class Staff{
	String [] arr;
	String depart,name,hiredate,filename;
	int pay=0;
	public Staff(String stf) {
		this.arr=stf.split("_");
		this.depart = arr[0];
		this.name = arr[1];
		this.arr=arr[2].split("[.]");
		this.hiredate=arr[0];
		this.filename=arr[1];
	}
	
}

public class File {
	public static void main(String [] args){
		Staff st = new Staff("����_aaa_20110623.JPg");
		new Result(st);
	
	}
	

}
