package utile_p;

import java.util.Random;

public class random_p {
	public static void main(String [] args){
		Random r1 = new Random(1); //여기다 숫자를 넣게 되면 그 경우의 수가 계속 나온다. 불규칙하지만 순서가 있게 된다. 
														//걍 똑같다 이말임.. -_-.... 걍 인트나 쓰면 되겠다 
		
		
		System.out.println(r1.nextInt()); //이놈은 그냥 인트형 랜덤으로 나온다.
		System.out.println(r1.nextInt(10));  //이놈은 그냥 인트형 랜덤으로 나온다.
		System.out.println(r1.nextBoolean());  //이놈은 그냥 인트형 랜덤으로 나온다.
		System.out.println(r1.nextFloat());  //이놈은 그냥 인트형 랜덤으로 나온다.
		System.out.println(r1.nextGaussian());  //이놈은 그냥 인트형 랜덤으로 나온다.
		System.out.println(r1.nextLong());  //이놈은 그냥 인트형 랜덤으로 나온다.
	}
}
