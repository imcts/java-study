package awt_p;

import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Label;

public class Font_P extends Frame {



	public Font_P() {
		setBounds(200,300,500,500);
		Label lb = new Label("�������� �Ϳ�����");
		
		setVisible(true);
	}
	public static void main(String [] args){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font [] ff = ge.getAllFonts();
		
		
		for (Font buf : ff) {
			System.out.println(buf.getFontName());
			
		}
		
		
		//�ڹٴ� �۲��� �� ���� �� ����,	Serif.plainó�� ��� ���� �ִ� �༮�� ����� �����ϴ�. 
		
		
		
		
		
	}
}
