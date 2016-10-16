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
		
		Menu main1 = new Menu("파일");
		Menu main2= new Menu("편집");
		Menu main3 = new Menu("보기");
		
		
		mb.add(main1);
		mb.add(main2);
		mb.add(main3); //얘는 메뉴바에다가 add시켜주어야 한다. 
		
		
		Menu sub1_1 = new Menu("새로만들기");
		Menu sub1_2 = new Menu("소로만들기");
		Menu sub1_3 = new Menu("개로만들기");
		
		main1.add(sub1_1);
		main1.add(sub1_2);
		main1.add(sub1_3);
		
		
		MenuItem sub1_1_1=new MenuItem("할미새사촌");
		MenuItem sub1_1_2=new MenuItem("짭새");
		MenuItem sub1_1_3=new MenuItem("조롱박이");
		
		
		sub1_1.add(sub1_1_1);
		sub1_1.add(sub1_1_3);
		sub1_1.add(sub1_1_2);
		
		MenuItem sub3_1 = new MenuItem("돌려보기");
	
		CheckboxMenuItem sub3_2 = new CheckboxMenuItem("안내선",true);   //미리체크가되도록 해주는것. 
		CheckboxMenuItem sub3_3 = new CheckboxMenuItem("직선",true);   //미리체크가되도록 해주는것. 
		CheckboxMenuItem sub3_4 = new CheckboxMenuItem("곡선",true);   //미리체크가되도록 해주는것. 
		
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
