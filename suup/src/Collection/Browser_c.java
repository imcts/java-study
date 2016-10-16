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
			System.out.println("������������ �����ϴ�.");
		}
	}
	static void goBack(){
		System.out.println("====================================goBack()");
		
		if(!next.empty()){
			back.push(now);
			
			now =  (String)back.pop();
			
			
			print();
		}else{
			System.out.println("������������ �����ϴ�.");
		}
	}
	
	static void print(){
		System.out.println("���� : "+now);
		System.out.println("���� : "+back);
		System.out.println("���� : "+next);
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
