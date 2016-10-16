package net_p;

import java.io.*;
import java.net.*;
import java.util.*;



public class TcpMulServer {

	HashMap<String, DataOutputStream> clients = new HashMap();
	
	public TcpMulServer() throws Exception {
		start();
	}
	
	void start() throws IOException{
		Collections.synchronizedMap(clients);
		ServerSocket server = new ServerSocket(8888);
		System.out.println("���� ����");
		
		while(true){
			Socket client = server.accept();
			System.out.println("["+client.getLocalAddress()+"] ���� ����");	
			ServerReciever sr = new ServerReciever(client);
			sr.start();
		}
	}
	
	
	
	class ServerReciever extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		
		public ServerReciever(Socket socket) throws IOException {
			super();
			this.socket=socket;
			
			in = new DataInputStream(socket.getInputStream());
			out = new DataOutputStream(socket.getOutputStream());
			
		}
		
		
		@Override
		public void run() {
			String name="";
			
			try {
				name = "#"+in.readUTF();
				
				sendAll(name+"���� �����Ͽ����ϴ�.");
				clients.put(name, out);
				System.out.println("���� ������ �� : "+clients.size());
				
				while(in!=null){
					sendAll(name + " : " + in.readUTF());
				}
				
				
			} catch (IOException e) {
				//e.printStackTrace();
				
			}finally{
				clients.remove(name);
				System.out.println(name+"���� �����Ͽ����ϴ�.");
				System.out.println("["+socket.getLocalAddress()+"] ���� ���� ����");
				System.out.println("���� ������ �� : "+clients.size());
			}
		}
		
		
		private void sendAll(String name) throws IOException {
			Iterator it = clients.keySet().iterator();
			
			while(it.hasNext()){
				DataOutputStream out = clients.get(it.next());
				
				out.writeUTF(name);
			}
			
			
		}
	}
	
	public static void main(String [] args) throws Exception{
		new TcpMulServer().start();
		
		
	}
}
