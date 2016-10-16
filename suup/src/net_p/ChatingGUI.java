package net_p;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;

class Send extends Thread{
	DataOutputStream dos;
	String name;
	Socket socket;
	TotalMoving tot;
	String sendres="";
	
	
	public Send(Socket socket,TotalMoving tot) throws Exception {
		this.tot=tot;
		this.socket = socket;
		this.dos = new DataOutputStream(socket.getOutputStream());
	}
	
	
	@Override
	public void run() {
		while(dos!=null){
			
			if(tot.btcall==1){
			try {
				dos.writeUTF(tot.txt.getText());
				
				tot.btcall=0;
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
	
	
	
}


class Resive extends Thread{
	DataInputStream dis;
	Socket socket;
	TotalMoving tot;
	String resiveres="";
	
	public Resive(Socket socket, TotalMoving tot) {
		this.socket = socket;
		this.tot=tot;
		try {
			this.dis=new DataInputStream(socket.getInputStream());
			
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}
	@Override
	public void run() {
		while(this.dis!=null){
			try {
				this.resiveres = dis.readUTF();
				tot.resiveText(resiveres);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class TotalMoving extends JFrame implements ActionListener{
	ServerSocket server;
	Socket socket;
	Container con;
	JTextArea ta;
	JTextField txt;
	JButton bt;
	Send send;
	Resive resive;
	String res="";
	int btcall=0;
	JScrollPane scroll;
	
	public TotalMoving() {
		super("Server-");
		this.con=getContentPane();
		setSize(600,700);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLocation(x,y);
		this.con.setLayout(null);
		
		this.ta = new JTextArea();
		this.ta.setBounds(20, 30, 535, 480);
		this.ta.setLineWrap(true);
		
		this.scroll = new JScrollPane(ta);
		this.scroll.setBounds(20, 30, 535, 480);
		//this.scroll.getVerticalScrollBar().setValue(JScrollPane);;
		
		
		this.bt=new JButton("전송");
		this.bt.setBounds(250, 580, 80, 50);
		this.bt.addActionListener(this);
		
		
		this.txt=new JTextField();
		this.txt.setBounds(20, 540, 535, 30);
		
		
		
		
		this.con.add(bt);
		this.con.add(scroll);
		this.con.add(txt);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try {
			this.server=new ServerSocket(8888);
			this.socket=server.accept();
			
			
			this.send = new Send(socket, this);
			this.resive = new Resive(socket, this);
			
			this.send.start();
			this.resive.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void resiveText(String resiver){
		//받았을때 실행된다.
		this.res+=resiver+"\n";
		this.ta.setText(res);
		
	}
	
	public void sendText(){
		//처음에 전송 버튼을 눌렀을때 실행이 된다. 
		this.res+=this.txt.getText()+"\n"; //텍스트에 입력중인 값을 가져옴.
		this.ta.setText(res);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("전송")){
			this.sendText();
			this.txt.setText("");
			this.btcall=1;
		}
	
	}
	
}

public class ChatingGUI {
	public static void main(String [] args) throws Exception{
		new TotalMoving();
	}
}
