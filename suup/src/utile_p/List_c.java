package utile_p;

import java.util.*;




class A{
	String str = "�� ��� �ٶ�.";
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return str;
	}//�θ�Ŭ������ �ڽ� Ŭ������ �޼ҵ带 �̿��ϰ� �ȴ�. �������̵� �ع����� �����ϴ�. 
}


public class List_c {
	public static void main(String [] args){
		
		List li = new ArrayList<>(); //�迭����Ʈ�� �ƴϰ� , LinkedList �� Ȯ����, malloc�� ��� �����Ӱ� JVM�� ������ Ȯ��.
		
		li.add(1); //������Ʈ�� �ޱ� ������ ���� �� ���� �� �ִ� .  �� � ���¶� !!! �� ����..? Ŭ���� ��ü�� ���� �� �ִٴ� �̾߱�.
		li.add("��ȣ�� ������.");
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
		
		
		li.remove(2); //������ remove�� ��������.
		System.out.print(li);
		System.out.println();
		
		
		List li2 = new ArrayList(li.subList(2, 5)); 
		
		System.out.println(li2);
		
		li2.add("��ȣ�� �ູ�ϴ�?");
		
		System.out.println(li2); //�׳� add���������� �� �ڿ� �ٰ� �ȴ�.
		
		
		li2.add(2,987);
		System.out.println(li2);
		
		li2.set(2, 132.333); // set��ɾ�� ���� �ٲٴ°�.
		
		System.out.println(li2);
		
		
		li2.add(li); //�K ī�Ǹ� �Ѱ�. 
		
		
		((A)(li2.get(3))).str="�ູ�� ��������";
		
		li.set(3, "abc");
		
		System.out.println(li2);
		
		System.out.println(li2.contains(132.333)); //contains : �ִ��� �˻����ִ� ��. 
		
		li2.add(1,132.333);
		System.out.println(li2.indexOf(132.333)); //indexOf : �ε����� ��ȣ�� �˷���. 
		System.out.println(li2); //������ ���� 2�� ������ ���� �ִ³��� �ε��� ��ȣ�� ã�Եȴ�. 
		
		li.retainAll(li2);//li2�� ������ �ִ°͵��� ������ ���͵��� �����ض�. 
		//retainAll : �������� �� ����. removeAll : ���� �������ִ¾ֵ��� ������.
		
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
		
		
		Collections.sort(li); //�ڵ�����. �� �ȿ� ����ִ� �ڷ����� �ϳ����߸� �����ϴ�.  
		
		System.out.println(li);
		
	}

}
