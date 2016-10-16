package awt_p;

import java.awt.*;

public class Container_p {
	public static void main(String [] args){
		Frame f = new Frame("panel");
		Panel p2 = new Panel();
		
		ScrollPane sp = new ScrollPane(); //색을 주는게 의미가없는 새끼임. 
		Panel p = new Panel(new GridLayout(20,1));
		Dialog dd= new Dialog(f,"이건위에거",false);  //종속적인 놈.  플프레임이 열릴때 새로운 창이 열림. true면 얘만 클릭
		FileDialog fd = new FileDialog(f,"파일저장");
		fd.setLocation(200,300);
		fd.setDirectory("C:\\Users\\TaeSan\\Pictures\\Camera Roll");
		fd.setVisible(true);
		System.out.println(fd.getDirectory());
		System.out.println(fd.getFile());
		
		dd.setBounds(200, 300, 300, 200);
		dd.setVisible(true);
		
		
		sp.setBounds(200, 50, 100, 100);
		
		
		p.setBackground(Color.green);
		p.setBounds(50,50,100,100);
		
		
		p2.setBounds(150,50,100,100);
		p2.setBackground(Color.pink);
		
		for(int i=0; i<20; i++){
			p.add(new Button("버튼"+i));
			p2.add(new Button("버튼"+i));
			
		}
		sp.add(p);
		
		
		
		
		f.setBounds(700,180,600,800);
		
		
		f.add(sp);
		f.add(p);		
		f.add(p2);
		f.setLayout(null);
		f.setVisible(true);
	
		
		
	}
}
