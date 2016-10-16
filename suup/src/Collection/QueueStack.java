package Collection;

import java.util.*;

public class QueueStack {
	public static void main(String [] args){
		Stack st = new Stack();//스택은 스택으로 생성한다.
		Queue qu = new LinkedList<>(); //큐는 링크드 리스트로 생성한다.
		
		
		
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
