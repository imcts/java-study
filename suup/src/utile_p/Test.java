package utile_p;
import java.util.*;



public class Test {
	public static void main(String [] args){
		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>();
		List listFA = new ArrayList<>();
		List listFa = new ArrayList<>();
		
		
		list1.add("박재상");
		list1.add("박정권");
		list1.add("최정");
		list1.add("김광현");
		list1.add("엄정욱");
		list1.add("박희수");
		list1.add("이호준");
		
		list2.add("이호준");
		list2.add("엄정욱");
		list2.add("박재홍");
		list2.add("이신협");
		list2.add("장동건");
		
		listFA.add("이병규");
		listFA.add("이승엽");
		listFA.add("박정권");
		listFA.add("장동건");
		listFA.add("박용택");
		listFA.add("홍성흔");
		
		listFa.add("이병규");
		listFa.add("이승엽");
		listFa.add("박용택");
		listFa.add("홍성흔");
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		
		list2.removeAll(listFA);
		System.out.println(list2);
		
		
		listFA.retainAll(listFa);
		System.out.println(listFA);
		
	}

}
