package utile_p;
import java.util.*;


public class Calendar_c {
	public static void main(String [] args){
		
		
		Calendar today = Calendar.getInstance(); //�������� ���� ������ ���ڽ��ϴ�.
		
		System.out.println(today); //������ �ð��� �� ��ǻ���� ������ ��� �̾� ��
		
		today.set(Calendar.MONTH, 5);
		System.out.println(today.get(Calendar.MONTH)+"ekf"); //��
		System.out.println(today.get(Calendar.YEAR)); //�⵵
		System.out.println(today.get(Calendar.DATE)); //�̹��� ��¥.
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); //����
		System.out.println(today.get(Calendar.WEEK_OF_YEAR)); //���ص�� �� ��° �ִ�.
		System.out.println(today.get(Calendar.WEEK_OF_MONTH)); //�̹��� ��� ���° �ֳ�
		
		System.out.println(today.get(Calendar.HOUR)); //�Ϸ縦 12�ð����� ����.
		System.out.println(today.get(Calendar.HOUR_OF_DAY)); //�Ϸ縦 24�ð����� ����.
		System.out.println(today.get(Calendar.SECOND)); //��������.
		System.out.println(today.get(Calendar.MILLISECOND)); //õ���� 1��.
		System.out.println(today.get(Calendar.AM_PM)); //�����̸� 0 ���ĸ� 1 
		
		today.set(2012, 1,27);
		/*today.set(2014, 11,14,21,50,30);
		today.set(Calendar.YEAR, 2015); //set�� ��쿡�� ����� ���� �־��ָ� ��. 
		today.set(Calendar.YEAR, today.get(Calendar.YEAR)+1);
		today.add(Calendar.YEAR, 2); //�߰��ϴ� ��.
*/		today.add(Calendar.DATE, 5); //����ϱⰡ �ʹ� ����. 20���İ� ������ �ȴ�. ���ޱ��� ������ش�.
		print(today);
		
		
		//today.setTimeInMillis(0);
		//System.out.println(today.getTimeInMillis());//1970�� 1�� 1�� 00�� 00�� ���� �����ؼ� ī��Ʈ�� �ϴ°�.
		print(today);
		
		Calendar today2 = Calendar.getInstance();
		
		System.out.println(today2.getTimeInMillis()-today.getTimeInMillis()/(1000*60*60*24)); 
		
	}
	
	static void print(Calendar day){
		
		String [] dayStr={"��","��","��","�","��","��","��"};
		String res  = day.get(Calendar.YEAR)+"-"+
							(day.get(Calendar.MONTH)+1)+"-"+
							day.get(Calendar.DATE) + "("+dayStr[(Calendar.DAY_OF_WEEK)-1]+")"+
							day.get(Calendar.HOUR_OF_DAY)+"-"+day.get(Calendar.MINUTE)+"-"+day.get(Calendar.SECOND);
		System.out.println(res);
	}
}
