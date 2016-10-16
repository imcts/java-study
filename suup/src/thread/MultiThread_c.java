package thread;

import java.util.Iterator;
import java.util.TreeMap;
import javax.swing.JOptionPane;

class  MulTimer extends Thread{
	MulChk chk;
	
	
	public MulTimer(MulChk chk) {
		this.chk=chk;
	}
	
	@Override
	public void run() {
		try {
			for(int i=5; i>=0; i--){
				if(chk.qq==true)
					break;
				
				System.out.println(i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		chk.qq=true;
		System.out.println("���� ������ : "+chk.count);
		System.exit(0);
	}
	
}

class MulData{
	String qq,aa;
	boolean chk=true;
	public MulData(String qq, String aa) {
		this.qq=qq;
		this.aa=aa;

	}
}

class MulQ extends Thread{
	TreeMap<Integer, MulData> map = new TreeMap<>();
	MulChk chk;
	public MulQ(MulChk chk) {
		this.chk=chk;
		map.put(1, new MulData("��Ʈ����ũ ������", "Ű��"));
		map.put(2, new MulData("����Ƽ��", "�ƽ���"));
		map.put(3, new MulData("�ƽ����", "�Ͼ���"));
		map.put(4, new MulData("�߻�", "�ɷη�"));
	}
	
	
	@Override
	public void run() {
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()){
			int key = it.next();
			
			
			
			String input = JOptionPane.showInputDialog(key+" : "+map.get(key).qq);
			
			
			if(map.get(key).aa.equals(input))
				chk.count++;
				
			System.out.println(input);
			
		}
		chk.qq=true;
		
	}
	
}


class MulChk{
	boolean qq = false; 
	int count=0;
	
}

public class MultiThread_c {
	
	public static void main(String [] args){
		
		
		MulChk chk = new MulChk(); //�� Ŭ������ KeyŬ������ �ȴ�. 
		new MulTimer(chk).start();
		new MulQ(chk).start();
		
		
		
		
	}
}
