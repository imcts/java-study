package lang_p;


class AAA{
	@Override
	public String toString() {
	
		return "우왕 주우소오다아~";
	}
}

public class Object_c {
	public static void main(String [] args){
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		
		
		System.out.println(a1); //클래스의 이름을 그냥 출력하면 주소가 나온다. 얘는 투 스트링이라는 메소드를 호출한다. to String이 생략
		System.out.println(a1.toString());// to String 은 주소라는 놈을 출력하는데 본인의 클래스 자료형과 합쳐서 출력해주게된다.
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode()); //주소값을 찾아온다. 이퀄즈를 사용하게 되면 해쉬코드를 비교하게 되는것이다.
		System.out.println(a2.hashCode());
		
		//a2 = a1.clone(); 그냥은 되지 않는다. 
		
		int [] arr  = {1,5,4,3,3,2,3,2,3,5};
		/*int [] brr  = arr; //이건 주소가 같은 것임.
*/
		int [] brr = arr.clone(); //클론은 직렬화가 되어있어야만 사용할 수 있다.
		
		arr[2]=88;
		
		System.out.println(arr[2]);
		System.out.println(brr[2]);
		
		
		
		
		
		
	}
}
