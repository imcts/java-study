package lang_p;

import java.util.Scanner;

public class ABCGame {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int su = -1;
		String comsu="",mysu="";
		String [] arr = {"가위","바위","보"};
		
		
		while(true){
			
			System.out.println("가위 바위 보오 ! 게임 !");
			System.out.println("0. 종료, 1. 가위, 2. 바위, 3.보");
			
			su = sc.nextInt();
			
			int com = (int)(Math.random()*3)+1;
			
			String res="패";
			
			if(su==0){break;}
			
			if(com==su){
				res="비김";
				if(com==1){
					comsu="가위";
					mysu=comsu;
				}
				else if(com==2){
					comsu="바위";
					mysu=comsu;
				}
				else if(com==3){
					comsu="보";
					mysu=comsu;;
				}
				
				
			}
			else if(com==1 && su==2){
				res="승";
				comsu="가위";
				mysu="바위";
			}
			else if(com==2 && su==3){
				res="승";
				comsu="바위";
				mysu="보";
			}
			else if(com==3 && su==1){
				res="승";
				comsu="보";
				mysu="가위";
			}
			
			
			
			System.out.println("com : "+comsu );
			System.out.println("me : " + mysu);
			System.out.println("게임 결과 : "+res);
			
			
			
		}
		
	}
}
