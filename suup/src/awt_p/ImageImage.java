package awt_p;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageImage extends Frame {
	
	Image img = null;
	Image img2 = null;
	Image img3 = null;
	
	public ImageImage() {
		super("�����ø���");
		setBounds(700, 400, 500, 600);
		setLayout(null);
		setVisible(true);
		
		addWindowListener(new WinC());
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		img = kit.getImage("photo/oh.jpg");		
		img2 = kit.getImage("photo/oh.jpg");		
		img3 = kit.getImage("photo/oh.jpg");		
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img,0, 0,250,300,	this);	
		/*g.drawImage(img2,
				100, 250,200,300,
			
				this);	
		g.drawImage(img3,
				200, 500,200,300,
				
				this);	*/
		
		
		//x��ǥ y��ǥ, 200������, 300������, 0,0���� 200,200������,
		//�������� ������°� ���� �������� ũ�⸸ŭ�� �߶󳽴ٴ°�. 
	}
	
	public static void main(String [] args){
	new	ImageImage();

		
		
	}
}
