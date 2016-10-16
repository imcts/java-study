package lang_p;




public class Math_c {
	public static void main(String [] args){
		System.out.println(Math.PI); //선언 하지 않아도 쓸 수 있는 이유는 자체 제공 클래스이기때문.
		System.out.println(Math.ceil(123.456)); //무조건 반올림을 시켜버림. 
		System.out.println(Math.floor(987.654)); //반올림이 되던 안되던 무조건 짤라버림.
		System.out.println(Math.round(987.554)); //얘가 발올림이네 그러니까
		System.out.println(Math.abs(987.354)); //절대값을 반환해줌.
		System.out.println(Math.pow(2, 3)); //앞에수의 제곱승의 값을 알려준다.
		System.out.println(Math.sqrt(2)); //루트값을 알려준다.
		
		
		
		System.out.println((int)(Math.random()*48)+1); //0보다 크고 1보다 작다. 48까지라고 지정해 두면 0부터 47까지 된다.
		//그래서 마지막에 +1 을 해주게되면 1부터 48까지 나오게 되는거지.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
