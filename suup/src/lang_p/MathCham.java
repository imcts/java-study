package lang_p;

import java.util.Scanner;



public class MathCham {
	public static void main(String [] args){
		String [] str = {"왼쪽","오른쪽","가운데"};
		
		Scanner sc = new Scanner(System.in);
		int in=-1;
		
		
		while(true){
			System.out.println("추억의 Game! 촴촴촴 ! ");
			System.out.println("0. 종료, 1. 왼쪽, 2. 오른쪽, 3. 가운데");
			
			in = sc.nextInt();
			
			if(in==0){
				break;
			}
			
			int com  = (int)(Math.random()*3)+1;
			String res="패";
			
			if(com==in)
				res="승";
			
			System.out.println();
			System.out.println();
			
			System.out.println("게임 결과 : " + res);
			
			System.out.println("게임종료");
		}
	}
}
