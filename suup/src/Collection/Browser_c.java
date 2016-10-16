package Collection;
import java.util.*;


public class Browser_c {
	static String now;
	static Stack back=new Stack(),next=new Stack();
	
	
	static void goUrl(String url){
	
		back.push(now); 
		
		now = url;
		
		next.clear();
		
		System.out.println("====================================goUrl("+url+")");
		print();
		
	}
	
	static void goNext(){
		System.out.println("====================================goNext()");
		
		if(!back.empty()){
		next.push(now);
		
		now =  (String)back.pop();
		
		
		print();
		}else{
			System.out.println("이전페이지가 없습니다.");
		}
	}
	static void goBack(){
		System.out.println("====================================goBack()");
		
		if(!next.empty()){
			back.push(now);
			
			now =  (String)back.pop();
			
			
			print();
		}else{
			System.out.println("다음페이지가 없습니다.");
		}
	}
	
	static void print(){
		System.out.println("현재 : "+now);
		System.out.println("이전 : "+back);
		System.out.println("다음 : "+next);
	}
	public static void main(String [] args){
		goUrl("www.naver.com");
		goUrl("www.google.com");
		goUrl("www.daum.com");
		goUrl("www.nate.com");
		
		goNext();
		goNext();
		goNext();
		goNext();
		goNext();
		
		goBack();
		goBack();
		goBack();
		goBack();
		goBack();
		
		
		
	}
}
