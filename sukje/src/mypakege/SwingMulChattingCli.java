package mypakege;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

import javax.swing.*;


class RecievClient extends Thread{
	Socket socket;
	ObjectInputStream ois;
	TotalThread tot;
	
	public RecievClient(Socket socket,TotalThread tot) throws Exception {
		this.tot=tot;
		this.socket = socket;
		this.ois = new ObjectInputStream(socket.getInputStream());
	}
	
	@Override
	public void run() {
		try {
		
		while(ois!=null){
				tot.res+=(String)ois.readObject()+"\n";
				tot.ta.setText(tot.res);
		}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}


class SendClient extends Thread{
	TotalThread tot;
	String name;
	ObjectOutputStream oos;
	Socket socket;
	int index=1;
	
	public SendClient(Socket socket,TotalThread tot) throws Exception {
		this.tot=tot;
		this.socket = socket;
		this.name=tot.name;
		this.oos=new ObjectOutputStream(socket.getOutputStream());
	}
	
	
	@Override
	public void run() {
		try {
			if(oos!=null){
			oos.writeObject(this.name);
			}
			
		while(oos!=null){
			if(tot.index==1){
				this.index=1;
			}
			if(tot.index==1||this.index==1){
			oos.writeObject(tot.tx.getText());
			tot.tx.setText("");
			this.index=2;
			tot.index=2;
			}
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}



class TotalThread extends JFrame implements ActionListener{
	Container con;
	JTextArea ta;
	JTextField tx;
	JScrollPane sp;
	Socket socket;
	String ip="localhost";
	String name;
	String res="";
	int index=0;
	
	
	public TotalThread() throws Exception {
		super("Client-");
		setSize(600,700);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int)(screen.getWidth()/2 - super.getWidth()/2);
		int y = (int)(screen.getHeight()/2 - super.getHeight()/2);
		setLocation(x,y);
		
		this.socket=new Socket(ip,8888);
		
		
		this.con=getContentPane();
		this.ta=new JTextArea("아이디를 입력해 주세요 : ");
		this.tx=new JTextField();
		this.sp=new JScrollPane(ta);
		tx.addActionListener(this);
		
		this.con.add(sp,"Center");
		this.con.add(tx,"South");
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.index==0){
		this.name=this.tx.getText();
		this.tx.setText("");
		this.res+="접속자 아이디 : " + name +"\n";
		this.ta.setText(res);
		this.index=1;
		try {
			new SendClient(socket, this).start();
			new RecievClient(socket, this).start();
		} catch (Exception e1) {
			e1.printStackTrace();
		}	
		}else{
			this.index=1;
			
		}
	}
}


public class SwingMulChattingCli {
	public static void main(String [] args) throws Exception{
		new TotalThread();
	}
}
