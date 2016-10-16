package mypakege;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.*;


class SocketUser extends JFrame{
	Container con;
	JTextArea c_txt;
	TextField txt;
	JButton bt;
	
	Socket sc;
	
	public SocketUser() throws Exception {
		super("User Client-");
		this.con=getContentPane();
		setSize(350,500);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLocation(x,y);
		setLayout(null);
		
		this.txt=new TextField();
		this.txt.setBounds(20, 350, 290, 30);
		this.c_txt=new JTextArea(30,25);
		this.c_txt.setBounds(20, 20, 290, 300);
		this.c_txt.setLineWrap(true);
	
		this.bt=new JButton("전송");
		this.bt.setBounds(130, 390, 70, 30);
		

		
		
		con.add(txt);
		con.add(c_txt);
		con.add(bt);
		
		setVisible(true);
		
		ServerOn();
	
	}

	private void ServerOn() throws Exception {
		String ip="localhost";
		String res="";
		this.sc=new Socket(ip,8888);
		InputStream is = sc.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		res+="서버 연결 완료 : " + ip+"\n";
		this.c_txt.setText(res);
		res+="서버 : "+ois.readUTF()+"\n";
		this.c_txt.setText(res);
		res+="서버 연결 종료"+"\n";
		this.c_txt.setText(res);
		
	}
}

public class OnewayChatCl {
	public static void main(String [] args) throws Exception{
		new SocketUser();
	}

}
