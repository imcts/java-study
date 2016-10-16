package net_p;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Tcp_Client {
	public static void main(String [] args){
		try {
			String ip = "192.168.0.5";
			Socket socket = new Socket(ip,7777);
			
			System.out.println("서버연결 완료"+ip);
			
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			System.out.println("서버 : "+dis.readUTF());
			
			System.out.println("연결종료");
			
			dis.close();
			is.close();
			socket.close();
			
		
		
		
		
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
	}
}
