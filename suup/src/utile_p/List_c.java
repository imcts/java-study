package utile_p;

import java.util.*;




class A{
	String str = "잘 살길 바라.";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}//부모클래스는 자식 클래스의 메소드를 이용하게 된다. 오버라이딩 해버리면 간단하다. 
}


public class List_c {
	public static void main(String [] args){
		
		List li = new ArrayList<>(); //배열리스트가 아니고 , LinkedList 의 확장형, malloc이 없어도 자유롭게 JVM이 공간을 확장.
		
		li.add(1); //오브젝트로 받기 때문에 모든걸 다 받을 수 있다 .  그 어떤 형태라도 !!! 그 말은..? 클래스 자체도 담을 수 있다는 이야기.
		li.add("석호야 축하해.");
		li.add(123.456);
		li.add(true);
		li.add('a');
		li.add(new A());
		li.add(new int[]{1,2,3});
		
		
		System.out.println(li);
		
		for(int i=0; i<li.size(); i++){
			System.out.println(li.get(i));			
		}
		
		for(Object buf : li){
			System.out.println(buf);			
		}
		
		System.out.println(((A)li.get(5)).str);
		System.out.println(li.get(5));
		
		
		li.remove(2); //삭제는 remove로 지워진다.
		System.out.print(li);
		System.out.println();
		
		
		List li2 = new ArrayList(li.subList(2, 5)); 
		
		System.out.println(li2);
		
		li2.add("석호야 행복하니?");
		
		System.out.println(li2); //그냥 add했을때에는 맨 뒤에 붙게 된다.
		
		
		li2.add(2,987);
		System.out.println(li2);
		
		li2.set(2, 132.333); // set명령어는 내용 바꾸는것.
		
		System.out.println(li2);
		
		
		li2.add(li); //딮 카피를 한것. 
		
		
		((A)(li2.get(3))).str="행복은 가정에서";
		
		li.set(3, "abc");
		
		System.out.println(li2);
		
		System.out.println(li2.contains(132.333)); //contains : 있는지 검색해주는 것. 
		
		li2.add(1,132.333);
		System.out.println(li2.indexOf(132.333)); //indexOf : 인덱스의 번호를 알려줌. 
		System.out.println(li2); //동일한 놈이 2개 있을땐 먼저 있는놈의 인덱스 번호를 찾게된다. 
		
		li.retainAll(li2);//li2가 가지고 있는것들을 제외한 모든것들을 삭제해라. 
		//retainAll : 나만빼고 다 지워. removeAll : 내가 가지고있는애들은 다지워.
		
		System.out.println(li);
		
		li.add(123456);
		
		System.out.println(li);
		
		li.removeAll(li2);
		System.out.println(li);
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(8);
		li.add(7);
		li.add(2);
		
		
		Collections.sort(li); //자동정렬. 이 안에 들어있는 자료형이 하나여야만 가능하다.  
		
		System.out.println(li);
		
	}

}
