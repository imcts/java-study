package lang_p;


class AAA{
	@Override
	public String toString() {
	
		return "��� �ֿ�ҿ��پ�~";
	}
}

public class Object_c {
	public static void main(String [] args){
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		
		
		System.out.println(a1); //Ŭ������ �̸��� �׳� ����ϸ� �ּҰ� ���´�. ��� �� ��Ʈ���̶�� �޼ҵ带 ȣ���Ѵ�. to String�� ����
		System.out.println(a1.toString());// to String �� �ּҶ�� ���� ����ϴµ� ������ Ŭ���� �ڷ����� ���ļ� ������ְԵȴ�.
		System.out.println(a2);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode()); //�ּҰ��� ã�ƿ´�. ����� ����ϰ� �Ǹ� �ؽ��ڵ带 ���ϰ� �Ǵ°��̴�.
		System.out.println(a2.hashCode());
		
		//a2 = a1.clone(); �׳��� ���� �ʴ´�. 
		
		int [] arr  = {1,5,4,3,3,2,3,2,3,5};
		/*int [] brr  = arr; //�̰� �ּҰ� ���� ����.
*/
		int [] brr = arr.clone(); //Ŭ���� ����ȭ�� �Ǿ��־�߸� ����� �� �ִ�.
		
		arr[2]=88;
		
		System.out.println(arr[2]);
		System.out.println(brr[2]);
		
		
		
		
		
		
	}
}
