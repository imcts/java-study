package awt_p;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class LayOut_c {
	public static void main(String [] args){
		Frame f1 = new Frame("border");
		f1.setBounds(700, 400, 300, 400);
		//f1.setLayout(new BorderLayout());

		f1.add("North",new Button("북쪽"));
		f1.add("South",new Button("남쪽"));
		f1.add("Center",new Button("중앙"));
		f1.add("West",new Button("서쪽"));
		f1.add("East",new Button("동쪽"));
		
		
	
	
		Frame f2 = new Frame("Flow");
		f2.setBounds(700, 400, 300, 400);
		f2.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		for(int i=0; i<20; i++){
			f2.add(new Button("버튼"+i));
		}
		
		
		f2.setVisible(true);
		
		
		Panel f3 = new Panel();
		f3.setLayout(new GridLayout(4,2));
		
		for(int i=0; i<8; i++){
			f3.add(new Button("버튼"+i));
		}
		
		//프레임은 제일 바깥에 존재하고, 그 안에 패널을 만들고, 그 안에 레이아웃을 집어 넣고 레이아웃을 셋팅함. 
		
		
		
		
		f1.add(f3,"Center");
		
		
		f1.setVisible(true);
		
	}
}
