package awt_p;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gyesanp {
	public static void main(String [] args){
		Frame f = new Frame();
		Panel p = new Panel();
		
		f.setBounds(700, 400, 300, 400);
		p.setBounds(300, 300, 300, 300);
		
		p.setBackground(Color.pink);
		
		
		f.add(p);
		f.setVisible(true);
		
		
		
	}
}
