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
		
		
		col1.add("침대는 가구가 아니면");
		col1.add(new Coffee());
		col1.add(new TnT());
		col1.add(new Starbucks());
		
		//col2.add("침대는 가구가 아니면");
		col2.add(new Coffee()); //상속받으면 가능하다.
		col2.add(new TnT());  //상속받으면 가능하다. 다형성이라는 것.
		//col2.add(new Starbucks()); 얘는 상속을 받지 않았기때문에 들어갈 수가 없다.
		
		//col3.add("침대는 가구가 아니면");
		//col3.add(new Coffee()); //부모는 자식을 받을 수 있지만, 자식은 부모를 받을 수 없다. 다형성을 그대로 받아온다.
		col3.add(new TnT());
		//col3.add(new Starbucks());
		
		
		//col4.add("침대는 가구가 아니면");
		//col4.add(new Coffee());
		//col4.add(new TnT());
		col4.add(new Starbucks());
		
		meth1(col1);
		meth1(col2);
		meth1(col3);
		meth1(col4);
		
		meth2(col1); //얘는 형변환 안되니까 들어가서 터진다.
		meth2(col2);
	/*	meth2(col3); //얘는 자식인데 왜 못 들어가?
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
	
	static void meth1(List list){}//리스트는 다 받는다.
	static void meth2(List<Coffee> list){}
	static void meth3(List<TnT> list){}
	static void meth4(List<? extends Coffee> list){
	
		Iterator<? extends Coffee> it = list.iterator();
		while(it.hasNext()){
			Coffee co = it.next();
			System.out.println(co.a);
		}
		
		
	} //커피를 상속받는 모든 애들.
	
}
