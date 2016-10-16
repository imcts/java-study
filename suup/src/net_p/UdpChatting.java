package net_p;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UdpChatting extends Frame implements ActionListener,Runnable{
	TextArea ta=new TextArea();
	TextField tf = new TextField();
	MulticastSocket ms;
	InetAddress xGrop; //통신의 주체.
	String name="최태산";
	int port=8888;
	
	
	public UdpChatting() throws Exception {
		super("udp 채팅");
		setBounds(700, 600, 400, 500);
		
		add(ta,"Center");
		add(tf,"South");
		ms = new MulticastSocket(port);
		
		xGrop = InetAddress.getByName("230.0.0.1"); //d클래스 전부를 가져와서 하나를 골라서 사용한다. 
		
		ms.joinGroup(xGrop); //230.0.0.1에 포트번호 8888을 쓰겠다는것.  반드시 물어줘야한다. 
		
		
		
		tf.addActionListener(this);
		
		setVisible(true);
		
		new Thread(this).start();
		
		
	}
	
	@Override
	public void run() {
		try {
		while(true){
			byte [] b = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(b,b.length); //데이터그램 패킷으로 통신을 함.
			
				ms.receive(packet);
				String s = new String(packet.getData()).trim(); //바이트를 스트링으로 바꿔치기.
				ta.append(s+"\n");
			
		}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				disConnection();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	void disConnection() throws Exception{
		ms.leaveGroup(xGrop); //이 녀석에게서 빠져나가겠다. 
		ms.close();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ㅇㅇㅇㅇ");
		if(ms!=null){
			return;
		}
		String str = tf.getText().trim();
		
		if(str.length()==0){
			return;
		}
		byte [] b = ("["+name +"]"+ str).getBytes();
		
		DatagramPacket packet = new DatagramPacket(b,b.length,xGrop,port);
		try {
			ms.send(packet);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		tf.setText("");
		tf.requestFocus(); 
		
	}
	
	
	public static void main(String [] args) throws Exception{
		
		new UdpChatting();
		
	}

}
