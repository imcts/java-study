package oops;

class Dyparent{
	
	int a= 10;
	int c= 30;
	
	
	void meth1(){
		System.out.println("난 부모 메소드");		
	}

	void met(){
		System.out.println("난 부모 메소드");		
	}
	
	int getB(){
		return 0;
	}
}



class DyChild extends Dyparent{
	int a=100;
	int b=200;
	
	public DyChild() {
		// TODO Auto-generated constructor stub
	}
	
	public DyChild(int a, int b) { //부모의 것으로 자식의 것을 생성했을때에, 자식의 a,b값에는 접근을 할 수가 없었다. 그러나 생성자를 같이 연동하게 되면 최초 초기값의 변경을 통해서 변경이 가능하다.
		super();
		this.a = a;
		this.b = b;
	}

	void meth1(){
		System.out.println("난 자식 메소드1");		
	}
	
	void meth2(){
		System.out.println("난 자식 메소드2");		
	}
	
	int getB(){
		return b;
	}
}


class DyNam{
		
}

public class Dynamic_c {
	public static void main(String [] args){
		Dyparent pp = new Dyparent();
		Dyparent pc = new DyChild(10000,20000); //부모의 형태로 자식의 생성자는 생성이 가능하다. 
		//DyChild cp = new Dyparent(); 자식의 형태로 부모의 생성자를 사용할 수는 없다. 
		DyChild cc= new DyChild();
		
		
	
		
		System.out.println("pp.a : " + pp.a);
		System.out.println("pc.a : " + pc.a);
		System.out.println("cc.a : " + cc.a);
		System.out.println("cc.b : " + cc.b);
		
		
		
		System.out.println("getB() : " + pc.getB()); //부모는 자식의 메소드에 접근할 수 있다. getB를 만들어서 그걸 사용하는데,
		
		
		pp.meth1();
		pc.meth1(); //메소드영역에서 부모의 것이 아닌 자식의 것을 사용하게 되니까. 자식의 메소드를 쓴다.
		cc.meth1();
		
		
		cc.a=1111;
		cc.b=2222;
		cc.c=3333;
		
		
		Dyparent pcc = cc;//자식 클래스가 부모로 바뀐것이다.
		
		
		
		System.out.println("pcc.a :"+pcc.a);//
		System.out.println("pcc.c :"+pcc.c); //자식이 보았던 c는 부모의 c
		//System.out.println("pcc.a :"+pcc.b);
		
		
		DyChild cpcc = (DyChild)pcc;
		System.out.println("cpcc.a :"+cpcc.a);//
		System.out.println("cpcc.c :"+cpcc.c);
		System.out.println("cpcc.b :"+cpcc.b);
		
		
		cc.meth1();
		pcc.meth1(); //static일 경우에는 볼 수 있따. 부모의 메소드가 static이라면 !!!!
		cpcc.meth1(); //무조건 자식 메소드만 보게된다 !!! 
		
		cc.meth1();
		//pcc.meth2(); //이놈은 접근을 할 수가 없다. 자식의 메소드는 볼 수가 없다.
		cpcc.meth1(); 
		pcc.met(); //이런식으로 자신의 메소드는 참조가 가능하지. 근데 만약에 meth1을 써버리면? 자식것에 meth가 있자너 그러니까 meth1를 쓰게 되는거야.
		
		
		//생성했던 놈은 cc밖에 없었던 것이다. 
		
		
		
		
		
		//ex)만일 도형이라는 부모 클래스가 있고, 그 밑에 원 사각형 자식클래스가 있을떄, 면적을 구해야 한다면, 부모는 area를 가지고있고, 자식은 area를 오버라이딩해서 사용. 
		//부모가 가지고 있는 area라는 멤버 변수에다가 값을 집어주는 캡슐화 메소드. 그러면 개는 값을 돌려주게될때, 부모의 메소드를 돌리는게 아니라, 자식의 메소드에서 돌려서 돌려주게 된다.
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		DyChild cpc = (DyChild)pc; //부모의 형태로 자식의 생성자를 사용하고, 그걸 다시 자식으로 바꾸게 되면.
		System.out.println("cpc.a :"+cpc.a);//
		System.out.println("cpc.c :"+cpc.c);
		System.out.println("cpc.b :"+cpc.b);
		
		System.out.println("-----------------------------------------------------------------------------------");
		
		
		
	//	DyChild cpp = (DyChild)pp; //애초에 부모의 형태인데 자식한테 줄 수가 없다. 
		//여기에서 등장하는 놈이 바로 instanceof -> 형변환이 가능한지를 체크해준다.
		DyNam nn = new DyNam();
		//System.out.println(nn instanceof DyChild);
		System.out.println(pp instanceof DyChild);
		System.out.println(pc instanceof DyChild);
		System.out.println(cc instanceof DyChild);
		
		
		
		//부모는 다 받을 수 있다. 
		
		
		
		
		
	
		
	}
}