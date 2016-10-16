package oops;



class Cla_M{
	
	int c = 10;
	
	
	void meth_1(){
		
		System.out.println("난 메소드1이야.");
	}
	
	void meth_2(int a, int b){
		System.out.println(a+" + "+b + " = " +(a+b));
		
	}
	
	void meth_3(){
		
		meth_2(2,3);
		
	}
	
	void meth_4(int a, int b){
		
		meth_1();
		meth_2(a,b);
		meth_3();
	
		
	}
	
	void meth_5(int [] arr){
		
		arr = new int[5];
		arr[1] = 100;
		
	}
	
	
	void meth_6(CmData dd){

		System.out.println(dd.kor+"   "+dd.eng);
		
		
	}
	
	void meth_7(CmData dd){
		dd.jum[1]=97;
		dd.print();
		
	}
	
	
}



class CmData
{	
	int kor=80, eng =80;
	
	int [] jum = {77,76,789};
	
	void print(){
		
		for(int i=0; i<jum.length;i++){
			System.out.print(jum[i]);
			if(i<jum.length-1){
				System.out.print(",");
			}
		}
		System.out.println();
		
		
	}

}

public class Cla_Meth {
	public static void main(String [] args){
		
		Cla_M cl = new Cla_M();
		
		cl.meth_1();
		cl.meth_2(1, 2);
		cl.meth_3();
		cl.meth_4(3, 4);
		
		
		int arr[] = {1,2,3};
		
		cl.meth_5(arr);
		
		System.out.println(arr[1]);
		
		CmData dd = new CmData();
		
		cl.meth_6(dd);
		cl.meth_7(dd);
		
		dd.print();
		
		
	}	
}
