package mypakege;

import java.awt.Adjustable;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.OrientationRequested;

class WinC extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		e.getWindow().dispose();
	}
}

////////////////////////////////////////////////////////////////////////////////////////



class TotalPaint extends Frame implements MouseMotionListener,ActionListener,MouseListener,AdjustmentListener{
	
	Image image;
	Graphics gg;
	Frame colorf,sized;
	Panel cp,cp2,null1,null2,sizep1,sizep2,sizenull;
	Scrollbar red,green,blue,xscroll,yscroll;
	Label redl,greenl,bluel,sizel1,sizel2;
	Button colobt,ovalbt,sqbt,cChoice,pen,but,size,sizeset;
	int sx,sy,x,y,index=1;
	int redColor=0,greenColor=0,blueColor=0;
	int xSize=30,ySize=30;
	
	
	
	public TotalPaint() {
		super("그림판");
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(900,1000);
		setLayout(null);
		sx = (int)(screen.getWidth()/2 - super.getWidth()/2);
		sy = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLocation(sx,sy);
		
		
		this.colobt=new Button("color");
		this.colobt.setBounds(40, 800, 50, 50);
		this.colobt.setBackground(new Color(0,0,0));
		this.colobt.addActionListener(this);		
		
		this.ovalbt=new Button("원");
		this.ovalbt.setBounds(40, 740, 50, 50);
		this.ovalbt.addActionListener(this);
		
		this.sqbt=new Button("네모");
		this.sqbt.setBounds(40, 680, 50, 50);
		this.sqbt.addActionListener(this);
		
		this.pen=new Button("펜");
		this.pen.setBounds(40, 620, 50, 50);
		this.pen.addActionListener(this);
		
		this.but=new Button("붓");
		this.but.setBounds(40, 560, 50, 50);
		this.but.addActionListener(this);
		
		this.size=new Button("size");
		this.size.setBounds(40, 500, 50, 50);
		this.size.addActionListener(this);
		
		
		add(size);
		add(pen);
		add(but);
		add(sqbt);
		add(ovalbt);
		add(colobt);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WinC());
		setVisible(true);
		
		this.image=createImage(900,1000);
		this.gg=image.getGraphics();
		gg.drawString("그림을 그립니다~", 50, 70);

		repaint();
		
		///////////////////////////////////////////////////////////////colorf 생성.
		
		this.null1=new Panel();
		this.null2=new Panel();
		
		this.colorf=new Frame("색상 선택");
		this.colorf.setBounds(sx, sy, 400, 250);

		this.colorf.setLayout(new GridLayout(2,1));
		this.cp=new Panel();
		this.cp2=new Panel();
		this.cp.setBackground(new Color(0,0,0));
		this.cChoice=new Button("설정");
		
		this.red=new Scrollbar(Adjustable.HORIZONTAL,0,0,0,256);
		this.red.setSize(50,20);
		this.redl=new Label("red : 0");
		this.red.addAdjustmentListener(this);
		
		this.green =new Scrollbar(Adjustable.HORIZONTAL,0,0,0,256);
		this.green.setSize(50,50);
		this.greenl=new Label("green : 0");
		this.green.addAdjustmentListener(this);
		
		this.blue =new Scrollbar(Adjustable.HORIZONTAL,0,0,0,256);
		this.blue.setSize(50,50);
		this.bluel=new Label("blue : 0");
		this.blue.addAdjustmentListener(this);
		
		
		cp2.setLayout(new GridLayout(4,2,5,5));
		cp2.add(redl);
		cp2.add(red);
		cp2.add(greenl);
		cp2.add(green);
		cp2.add(bluel);
		cp2.add(blue);
		cp2.add(null1);
		cp2.add(cChoice);
		cChoice.addActionListener(this);
		
		colorf.add(cp);
		colorf.add(cp2);	
		
		
		
		this.colorf.addWindowListener(new WinC());
		this.colorf.setVisible(false);
		this.colorf.setResizable(false);
		
		/////////////////////////////////////////////////////////////////////////////////
		
		this.sized=new Frame();
		this.sized.setSize(300,150);
		this.sized.setLocation(sx,sy);
		
		this.sizeset=new Button("완료");
		this.sizeset.addActionListener(this);
		
		this.sized.setLayout(new GridLayout(3,2,5,5));
		
		this.sizel1 = new Label("가로 : 20");
		this.sizel2 = new Label("세로 : 20");
		
		this.sizenull = new Panel();
		
		this.xscroll = new Scrollbar(Adjustable.HORIZONTAL,0,0,20,301);
		this.xscroll.addAdjustmentListener(this);
		this.yscroll = new Scrollbar(Adjustable.HORIZONTAL,0,0,20,301);
		this.yscroll.addAdjustmentListener(this);
		
		this.sized.add(sizel1);
		this.sized.add(xscroll);
		this.sized.add(sizel2);
		this.sized.add(yscroll);
		this.sized.add(sizenull);
		this.sized.add(sizeset);
		
		
		
		this.sized.addWindowListener(new WinC());
		this.sized.setVisible(false);
		this.sized.setResizable(false);
		
		
	}
	

	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, this);
		
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("color")){
			colorf.setVisible(true);
		}
		else if(e.getActionCommand().equals("설정")){
			this.colorf.setVisible(false);
			this.colobt.setBackground(new Color(this.redColor,this.greenColor,this.blueColor));
			repaint();
		}
		else if(e.getActionCommand().equals("펜")){
			this.index=1;
		}
		else if(e.getActionCommand().equals("붓")){
			this.index=2;
		}
		else if(e.getActionCommand().equals("네모")){
			this.index=3;
		}
		else if(e.getActionCommand().equals("원")){
			this.index=4;
		}
		else if(e.getActionCommand().equals("완료")){
			this.sized.setVisible(false);
		}
		else if(e.getActionCommand().equals("size")){
			this.sized.setVisible(true);
		}
		
	
	}

	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK && this.index==1){
			gg.setColor(new Color(this.redColor,this.greenColor,this.blueColor));
			gg.drawLine(x, y,e.getX(), e.getY());
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK && this.index==2){
			gg.setColor(new Color(this.redColor,this.greenColor,this.blueColor));
			gg.fillOval(x, y, this.xSize, this.ySize); //붓 사이즈 조절 가능 해야 함. 
			
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
			gg.setColor(new Color(255,255,255));
			gg.fillOval(x-50, y-50	, 100,100);
		}
		
		this.x=e.getX();
		this.y=e.getY();
		repaint();
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		this.x=e.getX();
		this.y=e.getY();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		this.redColor = red.getValue();
		this.greenColor = green.getValue();
		this.blueColor = blue.getValue();
		this.redl.setText("red : "+red.getValue());
		this.greenl.setText("green : "+green.getValue());
		this.bluel.setText("blue : "+blue.getValue());
		this.cp.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
		this.xSize=xscroll.getValue();
		this.ySize=yscroll.getValue();
		this.sizel1.setText("가로 : "+xSize);
		this.sizel2.setText("세로 : "+ySize);
		
		this.sized.repaint();
		this.colorf.repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		if(e.getButton()==1 && this.index==3){
			gg.setColor(new Color(this.redColor,this.greenColor,this.blueColor));
			gg.drawRect(x, y, this.xSize, this.ySize);
		}
		else if(e.getButton()==1 && this.index==4){
			gg.setColor(new Color(this.redColor,this.greenColor,this.blueColor));
			gg.drawOval(x, y, this.xSize, this.ySize);
		}
		
		repaint();
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	


}

public class Paintingg_c {
	public static void main(String [] args){
		new TotalPaint();
	}
}
