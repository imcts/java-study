package awt_p;

import java.awt.*;

public class Container_p {
	public static void main(String [] args){
		Frame f = new Frame("panel");
		Panel p2 = new Panel();
		
		ScrollPane sp = new ScrollPane(); //���� �ִ°� �ǹ̰����� ������. 
		Panel p = new Panel(new GridLayout(20,1));
		Dialog dd= new Dialog(f,"�̰�������",false);  //�������� ��.  ���������� ������ ���ο� â�� ����. true�� �길 Ŭ��
		FileDialog fd = new FileDialog(f,"��������");
		fd.setLocation(200,300);
		fd.setDirectory("C:\\Users\\TaeSan\\Pictures\\Camera Roll");
		fd.setVisible(true);
		System.out.println(fd.getDirectory());
		System.out.println(fd.getFile());
		
		dd.setBounds(200, 300, 300, 200);
		dd.setVisible(true);
		
		
		sp.setBounds(200, 50, 100, 100);
		
		
		p.setBackground(Color.green);
		p.setBounds(50,50,100,100);
		
		
		p2.setBounds(150,50,100,100);
		p2.setBackground(Color.pink);
		
		for(int i=0; i<20; i++){
			p.add(new Button("��ư"+i));
			p2.add(new Button("��ư"+i));
			
		}
		sp.add(p);
		
		
		
		
		f.setBounds(700,180,600,800);
		
		
		f.add(sp);
		f.add(p);		
		f.add(p2);
		f.setLayout(null);
		f.setVisible(true);
	
		
		
	}
}
