package utile_p;

import java.io.File;
import java.util.Scanner;

class ScanData
{
	String name ;
	String [] label = {"성명","국어","영어","수학","교련","총점","평균"};
	int [] jum ;
	int sum,avg;
	
	public ScanData(String nextLine) {
		String [] arr = nextLine.split(" ");
		
		name = arr[0];
		
		jum = new int [arr.length-1];
		
		for(int i=0;i<jum.length;i++)
		{
			jum[i]=Integer.parseInt(arr[i+1]);
		
		}
		
		result();
		
	}
	
	public void result(){
		
		for(int i=0; i<jum.length; i++){
			this.sum+=jum[i];
		}
		this.avg=sum/jum.length;
		
	}
	
	public String toString() {
		String ress="";
		
		System.out.println(ress);
		
		
		String res = name+"\t";
		for(int i=0; i<jum.length; i++){
			res+=jum[i]+"\t";
		}
		res+=sum+"\t"+avg;
		
		return res;
	}
}

public class Scanner_c {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		File ff = new File("abcd.efg");
		
		Scanner sc = new Scanner (ff);
		
		
		
		int cnt=0;
		
		
		while(sc.hasNext())
		{
			
			cnt++;
			sc.nextLine();
		
		}
		ScanData [] sd = new ScanData [cnt];
		
		
		sc = new Scanner (ff);
		
		cnt = 0 ;
		while(sc.hasNext()){
			sd[cnt] = new ScanData(sc.nextLine());
			cnt ++;
		}
		for(ScanData sss : sd){
			System.out.println(sss);	
		}
		
		
	
	}

}
