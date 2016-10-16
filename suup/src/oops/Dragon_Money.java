package oops;

class Hunter{
	static int mom = 100;
	
	int myMoney = 0;
	
	
	String name; 
	
	
	
	void plusMoney(int money){
		mom+=money;
		System.out.println(name + "충전액  : " + money);
		System.out.println("금고에 남은금액 " + mom);
	}
	
	
	void showMetheMoney(int money){
		
	
		myMoney +=money;		
		mom -=money;
		System.out.println(name +"소비액: "+money);		
		System.out.println(name +"사용액 : "+myMoney);
		System.out.println("잔액 : " + mom);
		
		System.out.println("-------------------------------------");

}
}




public class Dragon_Money {
	public static void main(String [] args){
		
		
		Hunter son = new Hunter();
		Hunter dou = new Hunter();
		Hunter fat = new Hunter();
		
		
		son.name="아들";
		dou.name="딸";
		
		son.showMetheMoney(10);
		dou.showMetheMoney(5);
		son.showMetheMoney(7);
		dou.showMetheMoney(15);
		
		fat.name="아뽜!!!";
		fat.plusMoney(50);
		
		
		
		
		
		
		
		
		
	}
}
