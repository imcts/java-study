package oops;

class Hunter{
	static int mom = 100;
	
	int myMoney = 0;
	
	
	String name; 
	
	
	
	void plusMoney(int money){
		mom+=money;
		System.out.println(name + "������  : " + money);
		System.out.println("�ݰ� �����ݾ� " + mom);
	}
	
	
	void showMetheMoney(int money){
		
	
		myMoney +=money;		
		mom -=money;
		System.out.println(name +"�Һ��: "+money);		
		System.out.println(name +"���� : "+myMoney);
		System.out.println("�ܾ� : " + mom);
		
		System.out.println("-------------------------------------");

}
}




public class Dragon_Money {
	public static void main(String [] args){
		
		
		Hunter son = new Hunter();
		Hunter dou = new Hunter();
		Hunter fat = new Hunter();
		
		
		son.name="�Ƶ�";
		dou.name="��";
		
		son.showMetheMoney(10);
		dou.showMetheMoney(5);
		son.showMetheMoney(7);
		dou.showMetheMoney(15);
		
		fat.name="�Ɩ�!!!";
		fat.plusMoney(50);
		
		
		
		
		
		
		
		
		
	}
}
