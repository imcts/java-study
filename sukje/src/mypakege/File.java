package mypakege;

class Result{
	Staff st;
	char arr[];
	String depart[] = {"영업","기획","총무","인사","생산"};
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
		
		//현재 날자. 2014년 6월 24일. 
		//입력 날자 2011년 6월 23일. 
		this.salary=this.nowYear-this.inputYear;
		
		
		if(this.nowMonth >= this.inputMonth){ //현재 달이 니가 입사한 달보다 크니? 
			if(this.nowDay > this.inputDay){ //현재 날자가 니가 입사한 날자보다 크니?
				this.salary--;
			}	
		}
	
		System.out.println(st.name+"님은 "+this.salary+"호봉 입니다.");
		
		
	}

	public void check(){
	
		
		try {
			if(st.name.length() < 2 || st.name.length() > 4){
				throw new Exception("이름은 2-4글자만 입력 가능합니다.");
			}
			if(!(st.hiredate.length()==8)){
				throw new Exception("입사일자는 ex)20140624 의 형식으로 입력하셔야 합니다.");
			}
			for(int i=0; i<depart.length; i++){
				if(st.depart.equals(this.depart[i])){
					this.checkdepart=true;
				}
			}
			if(this.checkdepart==false){
				throw new Exception("부서명은 영업,기획,총무,인사,생산 외에는 입력할 수 없습니다.");
			}
			
			
			for(int i=0; i<arr.length; i++){
				if(arr[i]=='0'||arr[i]=='1'||arr[i]=='2'||arr[i]=='3'||arr[i]=='4'
						||arr[i]=='5'||arr[i]=='6'||arr[i]=='7'||arr[i]=='8'||arr[i]=='9'){
					this.numcheck=true;
					
				}else{
					this.numcheck=false;
				}
				if(numcheck==false){
					throw new Exception("입사일자는 숫자외에는 입력하실 수 없습니다.");
				}
			}
			
			for(int i=0; i<this.filename.length; i++){
				if(st.filename.equalsIgnoreCase(this.filename[i])){
					this.filenameCheck=true;
				}
			}
			if(this.filenameCheck==false){
				 throw new Exception("이미지 파일형은 jpg,gif,bmp만 업로드 가능합니다");
				
			}
		
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("사진 업로드에 성공하셨습니다!!!");
		
	
		
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
		Staff st = new Staff("영업_aaa_20110623.JPg");
		new Result(st);
	
	}
	

}
