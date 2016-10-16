package mypakege;

import java.io.*;
import java.net.*;
import java.util.*;

class RecieverM extends Thread{
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String res="",name="������";
	ServerOn server;
	
	
	public RecieverM(Socket socket,ServerOn server) throws Exception {
		this.server=server;
		this.socket=socket;
		this.ois=new ObjectInputStream(this.socket.getInputStream());
		this.oos=new ObjectOutputStream(this.socket.getOutputStream());
		
	}
	
	
	@Override
	public void run() {

		try {
		if(ois!=null)
		this.name=(String)ois.readObject();
		this.server.list.put(name, this.oos); //������ �ʿ� ����ڿ� �ƿ�ǲ���� ���� ����.
		this.server.sendAll(name, res); //���� �ߴٰ� �˷���.
	
		
		while(ois!=null){
			this.res=(String)ois.readObject();  //������� ������ �� ���� res�� ��Ƴ���.
			this.server.sendAll(name+" : ", res);
		}
		} catch (Exception e) {
			this.server.list.remove(name);
			this.res="����";
			
			try {
				this.server.sendAll(name, res);
			} catch (Exception e1) {
				//e1.printStackTrace();
			}
			
		} 
	}

	
	
}



class ServerOn{
	ServerSocket server;
	Map list;
	int first=0;
	public ServerOn() throws Exception {
		this.list=new HashMap();
		Collections.synchronizedMap(list);
		
		this.server=new ServerSocket(8888);
		this.serverStart();
	}


	public void serverStart() throws Exception {
		while(true){
			Socket socket=server.accept(); //������ ������ ���� �ߴٸ�. 
			new RecieverM(socket,this).start();
		
		}
	}


	public void sendAll(String name, String res) throws Exception {
		Iterator it = list.keySet().iterator();
		
		if(this.first==0){
			while(it.hasNext()){
				ObjectOutputStream oos = (ObjectOutputStream) list.get(it.next());
				oos.writeObject(name+"�Բ��� �����ϼ̽��ϴ�.  ���� �����ڼ� : "+this.list.size());
				this.first=1;
			}
		}
		else if(res.equals("����")){
			while(it.hasNext()){
				ObjectOutputStream oos = (ObjectOutputStream) list.get(it.next());
				oos.writeObject(name+"�Բ��� ���������ϼ̽��ϴ�.  ���� �����ڼ� : "+this.list.size());
			}
		}
		else{
			while(it.hasNext()){
				ObjectOutputStream oos = (ObjectOutputStream)list.get(it.next());
				oos.writeObject(name+" : "+res);
			}
		}
	}
}


public class SwingMulChatServer {
	public static void main(String [] args) throws Exception{
		new ServerOn();
	}
}
