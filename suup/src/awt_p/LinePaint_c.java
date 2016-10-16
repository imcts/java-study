package awt_p;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;

public class LinePaint_c extends Frame implements MouseMotionListener{
	
	
	class BtnListener implements ActionListener{
		int cnt;
			public BtnListener(int cnt) {
				super();
				this.cnt=cnt;
			}
			
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			ccc = cnt;
			
		}
		
	}
	
	Graphics gg=null;
	Image img = null;
	int x,y,ccc=0;
	List<Color> cc = new ArrayList();
	List<Button> bt = new ArrayList();
	
	
	
	public LinePaint_c() {
		super("선으로 그리자");
		cc.add(new Color(0,0,0));
		cc.add(new Color(255,0,0));
		cc.add(new Color(0,255,0));
		cc.add(new Color(0,0,255));
		cc.add(new Color(255,255,0));
		cc.add(new Color(255,0,255));

		for(int i=0; i<cc.size(); i++){
			bt.add(new Button(""+i+1));
			bt.get(i).setBackground(cc.get(i));
			bt.get(i).setBounds(i*30+30, 550, 30, 30);		
			add(bt.get(i));
			bt.get(i).addActionListener(new BtnListener(i));
		}
		
		
		
		
		setBounds(700, 400, 500, 600);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WinC());
		addMouseMotionListener(this);
		
		
		img = createImage(500,600);
		gg = img.getGraphics();
		gg.drawString("선으로그립니다", 50, 50);
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
	//	super.update(g);
		paint(g);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
	
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){//마우스 뭘 눌렀느냐.
			gg.setColor(cc.get(ccc));
			gg.drawLine(x, y, e.getX(), e.getY());
		}
		else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK)
		{
			gg.setColor(Color.white);
			gg.fillOval(e.getX()-50, e.getY()-50, 100, 100);
		}
		
		x = e.getX();
		y = e.getY();
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
	}
	
	
	
	public static void main(String [] args){
		new LinePaint_c();
	}

	

}
