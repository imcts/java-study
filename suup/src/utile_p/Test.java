package utile_p;
import java.util.*;



public class Test {
	public static void main(String [] args){
		List list1 = new ArrayList<>();
		List list2 = new ArrayList<>();
		List listFA = new ArrayList<>();
		List listFa = new ArrayList<>();
		
		
		list1.add("�����");
		list1.add("������");
		list1.add("����");
		list1.add("�豤��");
		list1.add("������");
		list1.add("�����");
		list1.add("��ȣ��");
		
		list2.add("��ȣ��");
		list2.add("������");
		list2.add("����ȫ");
		list2.add("�̽���");
		list2.add("�嵿��");
		
		listFA.add("�̺���");
		listFA.add("�̽¿�");
		listFA.add("������");
		listFA.add("�嵿��");
		listFA.add("�ڿ���");
		listFA.add("ȫ����");
		
		listFa.add("�̺���");
		listFa.add("�̽¿�");
		listFa.add("�ڿ���");
		listFa.add("ȫ����");
		
		list1.removeAll(list2);
		System.out.println(list1);
		
		
		list2.removeAll(listFA);
		System.out.println(list2);
		
		
		listFA.retainAll(listFa);
		System.out.println(listFA);
		
	}

}
