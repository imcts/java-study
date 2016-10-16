package mypakege;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.*;

import javax.swing.*;


class ServerS extends JFrame implements Serializable{
	Container con;
	JPanel c_panel;
	TextField txt;
	JTextArea c_txt;
	JButton bt;
	
	ServerSocket sc;
	Socket sk;
	
	
	
	
	
	public ServerS() throws Exception  {
		super("Server-");
		this.con=getContentPane();
		setSize(350,500);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLocation(x,y);
		setLayout(null);
		
		this.sc=new ServerSocket(8888);
		
		
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
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		serverOn();
	}

	private void serverOn() throws Exception {
		String stat = "서버 준비 완료\n";
		this.c_txt.setText(stat);
		while(true){
			this.sk=sc.accept();
			stat+=sk.getInetAddress()+"가 연결요청\n";
			this.c_txt.setText(stat);
			OutputStream ops = sk.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(ops);
			
			oos.writeUTF("ㅋㅋㅋㅋㅋㅋㅋㅋ가긴 가냐");
			
			stat+=sk+"데이터 전송 완료\n";
			this.c_txt.setText(stat);
			
			oos.close();
			ops.close();
			sk.close();
		}
		
	}
	
	
	
}


public class OnewayChatServer {
	public static void main(String [] args) throws Exception{
		new ServerS();
		
	}
}
