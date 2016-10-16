package thread;




public class JoinThread_c {
	public static void main(String [] args){
		ThStart t1 = new ThStart("+");
		ThStart t2 = new ThStart("/");
		ThStart t3 = new ThStart("-");
		
		
		t1.start();
		try {
			t1.join(800); //여기에 숫자를 적어주게 되면, 이녀석이 시작되고 어느정도 시간이 지나고 나서 다음 스레드들이 실행된다. 
			//단, t2.start가 실행되고 t1이 실행되면 결국은 결과는 같다. 
			//조인을 쓰면 모든 스레드는 정지되고 이녀석만 실행되는데, 
			//이녀석 독자적으로 움직이는 단일 스레드가 되기 떄문에, 해당 스레드에서 에러가 발생돼도, main에서는 알 수 없다.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		t2.start();
		t3.start();
	}

}
