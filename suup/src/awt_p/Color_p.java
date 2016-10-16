package awt_p;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;

public class Color_p extends Frame{
	
	public Color_p(){
		super("color");

		Color cc = new Color(233,95,108);

		List<String> ccStr = new ArrayList(); 
	
		ccStr.add("255,0,0");
		ccStr.add("255,128,64");
		ccStr.add("255,255,0");
		ccStr.add("0,255,0");
		ccStr.add("0,0,255");
		ccStr.add("0,0,160");
		ccStr.add("128,0,128");
		

		
		
		
		setBounds(700, 400, 300, 400);
		
		setLayout(new GridLayout(ccStr.size(),2));
		
		for(int i=0; i<ccStr.size(); i++){
			add(new Label(ccStr.get(i)));
			Label lbco1 = new Label();
			String [] ccInt = ccStr.get(i).split(",");
			lbco1.setBackground(
					new Color(
					Integer.parseInt(ccInt[0]),
					Integer.parseInt(ccInt[1]),
					Integer.parseInt(ccInt[2])
					
							)
					);
			add(lbco1);
		}
		
		
		
		setVisible(true);
		
		
	}
	
	public static void main(String [] args){
		new Color_p();
		
		
		
	}
}
