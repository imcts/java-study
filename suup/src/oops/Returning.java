package oops;

class Cla_Return{
	
	void meth_1(){
		
		System.out.println("메롱메롱~~ 나도메롱 너도 메롱 모두 메롱 ~ 메로나 ~ ");

		return ;
	}
	int meth_2(){
		System.out.println("메소드 2");
		return 10;
	}
	
	int [] meth_3(){
		
		
		System.out.println("메소드3");
		return new int[]{10,20,30};
	}
	ClaReData meth_4(){
		
		System.out.println("메소드4");
		
		
		ClaReData res = new ClaReData();
		res.a=20000;
		res.str="ㅇㅇ?";
		
		
		
		return res;
		
		
	}
}


class ClaReData{
	int a;
	String str;
}


public class Returning {
	public static void main(String [] args){
		
		Cla_Return cr = new Cla_Return();
		
		cr.meth_1();
		
		
		System.out.println(cr.meth_2());
		System.out.println(cr.meth_3());
		
		int [] reArr = cr.meth_3();
		
		System.out.println(reArr[0]);
		
		ClaReData re =  cr.meth_4();
		
		System.out.println(re.a);
		System.out.println(re.str);
		
		
		System.out.println("cr.meth_3()[2] :"+ cr.meth_3()[2]);
		System.out.println("cr.meth_4().str :"+ cr.meth_4().str);
	
		
		
		
		
		
		
	}
}
