package awt_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import org.omg.PortableServer.AdapterActivator;

  
public class Paint_c extends Frame{
	public Paint_c() {
		super("�׸��� �׸���~");
		setBounds(600, 400, 600, 500);
		
		setVisible(true);
		setResizable(false);
		addWindowListener(new WinC());
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		/*g.setFont(new Font(null,Font.BOLD, 20));
		g.drawString("�������", 50, 100);
		
		g.setColor(Color.pink);
		
		g.drawOval(50, 150, 50, 50);
		g.fillOval(90, 150, 50, 50); //ä���� ���� �׸�.
		g.setColor(Color.black);
		g.drawOval(90,150,50,50); //���� �׸�.
		g.drawLine(50, 100, 300, 200); //���� �׸�.
		
		
		g.fillRoundRect(50, 250, 200, 100, 50, 50	);
		//�����������. �𼭸��� �������°� 
		
		g.fillArc(50, 200, 200, 200, 45, 90); //0������ ���̸� 90�� ���� �ø��ڴ�.
		//45������ �����ؼ� 90����ŭ �����ڴ�. 
		
		//polygon �μ� :(  x����, y����, ���ǰ���) int [] x , int []y , int jumsu
		
		//350, 330, 400, 550, 500
		//220, 150, 100, 170, 220
		//5
*/		
		
		
		/*g.drawPolygon(
				new int [] {80,100,130,180,300,410,500,550,570,540,490,400,480,300,200,180}, 
				new int [] {320,280,230,180,100,80,100,120,180,200,300,280,250,280,300,320},
				16
				);
		
				*/
				
				
		
		
	}
	
	
	
	
	
	public static void main(String [] args){
		new Paint_c();
	}
}
