package net_p;

import java.io.*;
import java.net.*;
import java.util.Scanner;


class SingleSender extends Thread{
	Socket socket;
	DataOutputStream dos;
	String name;
	
	public SingleSender(Socket socket) {
		super();
		this.socket = socket;
		try {
			dos = new DataOutputStream(socket.getOutputStream());
			name = "["+socket.getLocalAddress()+"]";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while(dos!=null){
			try {
				dos.writeUTF(name+sc.nextLine());
				
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		
	}
	
}


class SingleReceiver extends Thread{
	Socket socket;
	DataInputStream dis;
	
	public SingleReceiver(Socket socket) {
		this.socket = socket;
		try {
			dis= new DataInputStream(socket.getInputStream());
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		
		while(dis!=null){
			
			try {
				System.out.println(dis.readUTF());
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}


public class SingleServer_c {
	public static void main(String [] args) throws Exception{
		ServerSocket server = new ServerSocket(8888);
		System.out.println("서버준비완료");
		Socket client = server.accept();
		
		new SingleSender(client).start();
		new SingleReceiver(client).start();
		
		
		
	}

}
