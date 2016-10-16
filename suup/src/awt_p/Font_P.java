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
		Label lb = new Label("선생님은 귀여워요");
		
		setVisible(true);
	}
	public static void main(String [] args){
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font [] ff = ge.getAllFonts();
		
		
		for (Font buf : ff) {
			System.out.println(buf.getFontName());
			
		}
		
		
		//자바는 글꼴을 다 받을 수 없다,	Serif.plain처럼 가운데 점이 있는 녀석만 사용이 가능하다. 
		
		
		
		
		
	}
}
