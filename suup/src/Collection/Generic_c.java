package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Coffee{
	int a =100;
	
}

class TnT extends Coffee{
	
	
}

class Starbucks{
	
}

public class Generic_c {
	public static void main(String [] args){
		List col1  = new ArrayList();
		List<Coffee> col2  = new ArrayList<Coffee>();
		List<TnT> col3 = new ArrayList<TnT>();
		List<Starbucks> col4 = new ArrayList<Starbucks>();
		
		
		col1.add("ħ��� ������ �ƴϸ�");
		col1.add(new Coffee());
		col1.add(new TnT());
		col1.add(new Starbucks());
		
		//col2.add("ħ��� ������ �ƴϸ�");
		col2.add(new Coffee()); //��ӹ����� �����ϴ�.
		col2.add(new TnT());  //��ӹ����� �����ϴ�. �������̶�� ��.
		//col2.add(new Starbucks()); ��� ����� ���� �ʾұ⶧���� �� ���� ����.
		
		//col3.add("ħ��� ������ �ƴϸ�");
		//col3.add(new Coffee()); //�θ�� �ڽ��� ���� �� ������, �ڽ��� �θ� ���� �� ����. �������� �״�� �޾ƿ´�.
		col3.add(new TnT());
		//col3.add(new Starbucks());
		
		
		//col4.add("ħ��� ������ �ƴϸ�");
		//col4.add(new Coffee());
		//col4.add(new TnT());
		col4.add(new Starbucks());
		
		meth1(col1);
		meth1(col2);
		meth1(col3);
		meth1(col4);
		
		meth2(col1); //��� ����ȯ �ȵǴϱ� ���� ������.
		meth2(col2);
	/*	meth2(col3); //��� �ڽ��ε� �� �� ��?
		meth2(col4);*/
		
		
		meth3(col1);
		//meth3(col2);
		meth3(col3);
		//meth3(col4);
		
		
		//meth4(col1);
		meth4(col2);
		meth4(col3);
		//meth4(col4);
		
	}
	
	static void meth1(List list){}//����Ʈ�� �� �޴´�.
	static void meth2(List<Coffee> list){}
	static void meth3(List<TnT> list){}
	static void meth4(List<? extends Coffee> list){
	
		Iterator<? extends Coffee> it = list.iterator();
		while(it.hasNext()){
			Coffee co = it.next();
			System.out.println(co.a);
		}
		
		
	} //Ŀ�Ǹ� ��ӹ޴� ��� �ֵ�.
	
}
