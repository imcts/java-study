package oops;

class Cla_Return{
	
	void meth_1(){
		
		System.out.println("�޷ո޷�~~ �����޷� �ʵ� �޷� ��� �޷� ~ �޷γ� ~ ");

		return ;
	}
	int meth_2(){
		System.out.println("�޼ҵ� 2");
		return 10;
	}
	
	int [] meth_3(){
		
		
		System.out.println("�޼ҵ�3");
		return new int[]{10,20,30};
	}
	ClaReData meth_4(){
		
		System.out.println("�޼ҵ�4");
		
		
		ClaReData res = new ClaReData();
		res.a=20000;
		res.str="����?";
		
		
		
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
