package thread;

//권장하지 않는 방법이다.


class ThPriority extends Thread{
	String name;
	public ThPriority(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void run() {
	for(int i=0; i<300; i++){
		System.out.print(getName());
		
		}
	}
}

public class ThreadPriority_c {
	public static void main(String [] args){
		ThPriority t1= new ThPriority("+");
		ThPriority t2= new ThPriority("-");
		t1.setPriority(1);
		t2.setPriority(10); //10이면 우선순위가 높다. 1이면 우선순위가 낮다. 
		
		t2.start();
		t1.start();
	}
}
