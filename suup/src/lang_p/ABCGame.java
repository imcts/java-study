package lang_p;

import java.util.Scanner;

public class ABCGame {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		int su = -1;
		String comsu="",mysu="";
		String [] arr = {"����","����","��"};
		
		
		while(true){
			
			System.out.println("���� ���� ���� ! ���� !");
			System.out.println("0. ����, 1. ����, 2. ����, 3.��");
			
			su = sc.nextInt();
			
			int com = (int)(Math.random()*3)+1;
			
			String res="��";
			
			if(su==0){break;}
			
			if(com==su){
				res="���";
				if(com==1){
					comsu="����";
					mysu=comsu;
				}
				else if(com==2){
					comsu="����";
					mysu=comsu;
				}
				else if(com==3){
					comsu="��";
					mysu=comsu;;
				}
				
				
			}
			else if(com==1 && su==2){
				res="��";
				comsu="����";
				mysu="����";
			}
			else if(com==2 && su==3){
				res="��";
				comsu="����";
				mysu="��";
			}
			else if(com==3 && su==1){
				res="��";
				comsu="��";
				mysu="����";
			}
			
			
			
			System.out.println("com : "+comsu );
			System.out.println("me : " + mysu);
			System.out.println("���� ��� : "+res);
			
			
			
		}
		
	}
}
