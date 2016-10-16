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
		super("사진올리기");
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
		
		
		//x좌표 y좌표, 200사이즈, 300사이즈, 0,0부터 200,200까지만,
		//마지막에 적어들어가는건 원본 사이즈의 크기만큼만 잘라낸다는것. 
	}
	
	public static void main(String [] args){
	new	ImageImage();

		
		
	}
}
