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
	InetAddress xGrop; //����� ��ü.
	String name="���»�";
	int port=8888;
	
	
	public UdpChatting() throws Exception {
		super("udp ä��");
		setBounds(700, 600, 400, 500);
		
		add(ta,"Center");
		add(tf,"South");
		ms = new MulticastSocket(port);
		
		xGrop = InetAddress.getByName("230.0.0.1"); //dŬ���� ���θ� �����ͼ� �ϳ��� ��� ����Ѵ�. 
		
		ms.joinGroup(xGrop); //230.0.0.1�� ��Ʈ��ȣ 8888�� ���ڴٴ°�.  �ݵ�� ��������Ѵ�. 
		
		
		
		tf.addActionListener(this);
		
		setVisible(true);
		
		new Thread(this).start();
		
		
	}
	
	@Override
	public void run() {
		try {
		while(true){
			byte [] b = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(b,b.length); //�����ͱ׷� ��Ŷ���� ����� ��.
			
				ms.receive(packet);
				String s = new String(packet.getData()).trim(); //����Ʈ�� ��Ʈ������ �ٲ�ġ��.
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
		ms.leaveGroup(xGrop); //�� �༮���Լ� ���������ڴ�. 
		ms.close();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��������");
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
