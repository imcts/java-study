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

public class CharPaint_c extends Frame implements MouseMotionListener,ActionListener{
	int x=0,y=0;
	Image img = null;
	Graphics gg = null;
	

	public CharPaint_c() {
		super("����");
		
		
		setBounds(700, 400, 500, 600);
		setVisible(true);
		setLayout(null);
		
		addMouseMotionListener(this);
		addWindowListener(new WinC());
		
		this.img = createImage(500,600); //����� �����ߵȴ�.
		gg = img.getGraphics();
		gg.drawString("���콺�� ������ ���ƿ�", 50, 80); //gg���ٰ� �׸��� ����.
		//gg��� �׷��Ƚ��� �ϳ� ���� ��ȭ���� ������Ų��. 
		//�״����� gg.���� �׸��� ��ȭ���� �׸���, repaint������ �̹��� ������ �����ͼ� paint�� �������� �ѷ��ְԵȴ�.
	}
	
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(img, 0, 0, this); //����Ʈ �޼ҵ忡�� �̹��� ��ü�� ���ٰ� �ٿ� ������. 
		
	}
	
	
	
	public static void main(String [] args){
		new CharPaint_c();
		
		
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		gg.drawString("*", x, y); //gg��� ������ ��ȭ���� �ϳ��� �����Ǿ��ֱ� ������, img��� ��ȭ���� �׸��� �׸��°�.
		repaint();//repaint�� �����Ű�� paint�޼ҵ尡 ����ǰ�.
	}
	
	@Override
	public void update(Graphics g) { //repaint�Ҷ����� ���Ű��� ����³���. 
		/*// TODO Auto-generated method stub
		super.update(g);*/
		paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
