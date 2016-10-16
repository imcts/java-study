package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


class TcpMulCliSender extends Thread{
	Socket socket;
	DataOutputStream dos;
	String name;
	
	public TcpMulCliSender(Socket socket, String name) throws Exception {
		this.socket=socket;
		this.name=name;
		
		dos = new DataOutputStream(socket.getOutputStream());
		
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
			try {
				if(dos!=null){
				dos.writeUTF(name);
				}
				
				while(dos!=null){
					dos.writeUTF(sc.nextLine());
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
}





class TcpMulCliReciever extends Thread{
	Socket socket;
	DataInputStream dis ;
	
	public TcpMulCliReciever(Socket socket) throws IOException {
		this.socket = socket;
		dis = new DataInputStream(socket.getInputStream());
	}
	
	@Override
	public void run() {
		while(dis!=null){
			try {
				System.out.println(dis.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

public class TcpMulClient {
	public static void main(String [] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대화명 : ");
		String name = sc.nextLine();
		
		Socket socket = new Socket("localhost",8888);
		System.out.println("서버 연결 성공");
		new TcpMulCliSender(socket, name).start();
		new TcpMulCliReciever(socket).start();
		
		
		
	}
}
