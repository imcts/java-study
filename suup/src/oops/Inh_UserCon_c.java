package oops;


class Inh_UserParent{
	int a=20;
	
	int [] arr;
	
	public Inh_UserParent(int a) {	
		this.a=a;
		
		arr = new int[a];
		
		System.out.println("부모 사용자 정의 생성자"+this.a);	
	}
	
	public Inh_UserParent() {
		System.out.println("부모 기본 생성자"+this.a);
	}
	
}

class Inh_UserChild extends Inh_UserParent
{ 
	int aa=10;
	static int setA(){
		return 10;
	}
	
	public Inh_UserChild(int a) {
		
		//super.a=a; 생성자가 돌고 난 다음에 되어야 한다.
		//super(aa); aa는 존재조차 하지 않았다. 그런데 땅겨 버리니까 에러가 발생. 	
		super(setA());
		
		System.out.println("자식 사용자 생성자 생성자 ");
		
		//반드시!!! 부모 생성자부터 먼저 돌리고 나서 해야 한다. 자식 생성자가 생성될때 부모의 멤버는 다 잡혀있어야 하고, 멤버는 부모의 멤버가 먼저 다 만들어진 다음에 자식의 생성자랑 멤버가 만들어진다.
		//부모 생성자는 다 돌고 난 후에야 자식게 돌기 시작하는거. 
	}
	
	public Inh_UserChild() {
		// TODO Auto-generated constructor stub
		super.a = 70; //얘는 이미 부모 생성자가 돈 후이기 떄문에 가능하다.
		System.out.println("자식 기본 생성자");
	}
	
}


public class Inh_UserCon_c {
	public static void main(String [] args){
		int aa = 10;

		Inh_UserChild a = new Inh_UserChild(10);
		
		System.out.println(a.a);
	}
}
