package awt_p;

import java.awt.Color;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


class Timer extends Thread{
	MouseEvent_c c;
	
	//라벨값만 받아와서 넘겨줘도 충분히 repaint가 가능하다. 
	
	public Timer(MouseEvent_c c) {
		this.c = c;
		
	}
	
	@Override
	public void run() {
		for(int i=60; i>=0; i--){
			
			try {
				c.lb1.setText(""+i+"");
				sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class MouseEvent_c extends Frame implements MouseMotionListener{

	Label lb = new Label();
	Label lb1 = new Label();
	
	
	public MouseEvent_c() {
		super("마우스이벤트");
		setBounds(600, 300, 600, 500);
		setVisible(true);
		setLayout(null);
		
		lb.setBounds(50, 50, 150, 30);
		lb.setBackground(new Color(255,0,0));
		lb1.setBounds(50, 100, 150, 30);
		
		
		new Timer(this).start();;
		add(lb1);
		add(lb);
		addWindowListener(new WinC());
		
		addMouseMotionListener(this);
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println(e.getX() +", "+e.getY());
		lb.setText(e.getX()+","+e.getY());
		
	}
	
	

	public static void main(String [] args){
		MouseEvent_c c = new MouseEvent_c();
		
		
	}
	
}
