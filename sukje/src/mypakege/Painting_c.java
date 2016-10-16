package mypakege;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

class Closed extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().dispose();
		
	}
	
}


class Painted extends Frame implements MouseListener{
	int width1,width2;
	int height1,height2;
	List list1,list2;
	
	public Painted() {
		super("Face");
		this.list1=new ArrayList();
		this.list2=new ArrayList();
		
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(700,700);
		int x=(int)(screen.getWidth()/2 - super.getWidth()/2);
		int y=(int)(screen.getHeight()/2 - super.getHeight()/2);
		setLocation(x,y);
		setLayout(null);
		
		Label p = new Label("¿Ö - _-.. ¹¹");
		p.setBounds(505, 186, 300, 100);
		p.setFont(new Font(null,Font.PLAIN+Font.BOLD,20));
		
		
		
		
		add(p);
		
		setVisible(true);
		setResizable(false);
		addWindowListener(new Closed());
		addMouseListener(this);
	}
	
	
	@Override
	public void update(Graphics g) {
	
	}
	@Override
	public void paint(Graphics g) {
		g.drawPolyline(
				new int[]{225,198,182,176,216,285,325,363,398,422,429,413,411,394,385,384,379,371,351,319,300,309,281,259,265,222,208,225,207,205,182,183,198}, 
				new int[]{330,313,298,222,166,135,130,156,169,217,272,309,289,290,308,262,235,252,222,244,254,221,240,248,226,265,307,330,305,262,262,291,293}, 
				33);

		g.drawPolyline(
				new int[]{227,295,290,221,227}, 
				new int[]{241,253,294,286,241}, 
				5);
		g.drawLine(294, 271, 318, 277);
		g.drawLine(187,268,207,275);
		g.drawLine(244,256,268,260);
		g.drawLine(255,260,255,279);
		g.drawLine(244,278,265,280);
		g.drawLine(338,267,364,273);
		g.drawLine(350,270,347,285);
		g.drawLine(332,285,358,288);
		g.drawLine(224,328,270,360);
		g.drawLine(322,360,386,313);
		g.drawLine(408,316,413,308);
		g.drawLine(270,360,323,360);
		g.drawLine(385,313,406,316);
		g.drawLine(390,300,403,297);
		g.drawLine(281,327,300,329);
		g.drawPolyline(
				new int[]{315,321,381,376,315}, 
				new int[]{300,254,262,306,300}, 
				5);
		
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	
	
	@Override
	public void mousePressed(MouseEvent e) {

		this.width1=e.getX();
		this.height1=e.getY();
		
		this.list1.add(width1);
		this.list2.add(height1);
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		this.width2=e.getX();
		this.height2=e.getY();
		
		this.list1.add(width2);
		this.list2.add(height2);
		
		System.out.println(width2+" , "+height2);
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class Painting_c {
	public static void main(String [] args){
		new Painted();
		
		
		
		
	}
}
