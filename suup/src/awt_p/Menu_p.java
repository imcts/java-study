package awt_p;

import java.awt.CheckboxGroup;
import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

import javax.swing.JPopupMenu.Separator;

public class Menu_p extends Frame {
	
	public Menu_p() {
		super("menu");
		
		MenuBar mb = new MenuBar();
		
		setMenuBar(mb);
		
		Menu main1 = new Menu("����");
		Menu main2= new Menu("����");
		Menu main3 = new Menu("����");
		
		
		mb.add(main1);
		mb.add(main2);
		mb.add(main3); //��� �޴��ٿ��ٰ� add�����־�� �Ѵ�. 
		
		
		Menu sub1_1 = new Menu("���θ����");
		Menu sub1_2 = new Menu("�ҷθ����");
		Menu sub1_3 = new Menu("���θ����");
		
		main1.add(sub1_1);
		main1.add(sub1_2);
		main1.add(sub1_3);
		
		
		MenuItem sub1_1_1=new MenuItem("�ҹ̻�����");
		MenuItem sub1_1_2=new MenuItem("¬��");
		MenuItem sub1_1_3=new MenuItem("���չ���");
		
		
		sub1_1.add(sub1_1_1);
		sub1_1.add(sub1_1_3);
		sub1_1.add(sub1_1_2);
		
		MenuItem sub3_1 = new MenuItem("��������");
	
		CheckboxMenuItem sub3_2 = new CheckboxMenuItem("�ȳ���",true);   //�̸�üũ���ǵ��� ���ִ°�. 
		CheckboxMenuItem sub3_3 = new CheckboxMenuItem("����",true);   //�̸�üũ���ǵ��� ���ִ°�. 
		CheckboxMenuItem sub3_4 = new CheckboxMenuItem("�",true);   //�̸�üũ���ǵ��� ���ִ°�. 
		
		main3.add(sub3_1);
		main3.add(sub3_2);
		main3.add(sub3_3);
		main3.addSeparator();
		main3.add(sub3_4);
		
		setBounds(700, 400, 300, 400);
		setVisible(true);
		
	}
	
	public static void main(String [] args){
		 new Menu_p();
		
	}
}
