package Collection;

import java.util.*;

public class QueueStack {
	public static void main(String [] args){
		Stack st = new Stack();//������ �������� �����Ѵ�.
		Queue qu = new LinkedList<>(); //ť�� ��ũ�� ����Ʈ�� �����Ѵ�.
		
		
		
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		
		while(!qu.isEmpty()){
			
			System.out.println(qu.poll());
			
		}
		System.out.println();
		
		
		
		while(!st.isEmpty()){
			System.out.println(st.pop());
			
		}
		
		
		
		
		
		
		
		
	}
}
