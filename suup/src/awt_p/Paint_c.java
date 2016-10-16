package awt_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import org.omg.PortableServer.AdapterActivator;

  
public class Paint_c extends Frame{
	public Paint_c() {
		super("그림을 그리자~");
		setBounds(600, 400, 600, 500);
		
		setVisible(true);
		setResizable(false);
		addWindowListener(new WinC());
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		
		/*g.setFont(new Font(null,Font.BOLD, 20));
		g.drawString("배고프다", 50, 100);
		
		g.setColor(Color.pink);
		
		g.drawOval(50, 150, 50, 50);
		g.fillOval(90, 150, 50, 50); //채워진 원을 그림.
		g.setColor(Color.black);
		g.drawOval(90,150,50,50); //원을 그림.
		g.drawLine(50, 100, 300, 200); //선을 그림.
		
		
		g.fillRoundRect(50, 250, 200, 100, 50, 50	);
		//라운드형모따기. 모서리를 따버리는거 
		
		g.fillArc(50, 200, 200, 200, 45, 90); //0도부터 높이를 90도 까지 올리겠다.
		//45도에서 시작해서 90도만큼 돌리겠다. 
		
		//polygon 인수 :(  x점들, y점들, 점의개수) int [] x , int []y , int jumsu
		
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
