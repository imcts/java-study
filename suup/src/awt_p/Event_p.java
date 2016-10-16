package awt_p;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class WinC extends WindowAdapter{
	
public void windowClosing(WindowEvent e) {
		System.out.println("´ÝÇô¶ó¾Æ ");
		e.getWindow().setVisible(false);
		e.getWindow().dispose();
	}

}



public class Event_p {
	
	public static void main(String [] args){
	
		Frame f = new Frame("Ã¢´Ý±â");
		f.setBounds(700, 400, 300, 200);
		
		
		f.setVisible(true);
		f.addWindowListener(new WinC());
	}
}
