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
		super("ㅇㅇ");
		
		
		setBounds(700, 400, 500, 600);
		setVisible(true);
		setLayout(null);
		
		addMouseMotionListener(this);
		addWindowListener(new WinC());
		
		this.img = createImage(500,600); //사이즈를 잡아줘야된다.
		gg = img.getGraphics();
		gg.drawString("마우스를 움직여 보아요", 50, 80); //gg에다가 그리는 중임.
		//gg라는 그래픽스를 하나 만들어서 도화지를 장착시킨다. 
		//그다음에 gg.으로 그림을 도화지에 그리고, repaint에서는 이미지 파일을 가져와서 paint로 프레임이 뿌려주게된다.
	}
	
	@Override
	public void paint(Graphics g) {
	
		g.drawImage(img, 0, 0, this); //페인트 메소드에는 이미지 자체를 갖다가 붙여 버린다. 
		
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
		gg.drawString("*", x, y); //gg라는 도구의 도화지는 하나만 설정되어있기 때문에, img라는 도화지에 그림을 그리는것.
		repaint();//repaint를 실행시키면 paint메소드가 실행되고.
	}
	
	@Override
	public void update(Graphics g) { //repaint할때마다 과거것을 지우는놈임. 
		/*// TODO Auto-generated method stub
		super.update(g);*/
		paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
