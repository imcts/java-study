import java.util.ArrayList;
import java.util.List;

class A {
	int a;
	
	public A() {
		
	}
	
	public A(int a) {
		this.a = a;
	}
}

public class Test {
	public static void main(String [] args) {
		A a = new A(3);
		test(a);
		System.out.println(a);
		
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		
		test2(list);
	}
	
	public static void test2(List<String> l) {
		for(int i = 0; i < l.size(); i++) {
			if(true) {
				l.add("2");
			}
			
			if(true) {
				l = new ArrayList<String>();
			}
		}
	}
	
	public static void test(A a) {
		a = new A();
		System.out.println(a);
		a.a = 7;
	}
	
}
