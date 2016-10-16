package mypakege;

import java.io.*;
import java.net.*;
import java.util.*;

class RecieverM extends Thread{
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String res="",name="아으앙";
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
		this.server.list.put(name, this.oos); //서버의 맵에 사용자와 아웃풋값을 집어 넣음.
		this.server.sendAll(name, res); //접속 했다고 알려줌.
	
		
		while(ois!=null){
			this.res=(String)ois.readObject();  //결과값이 들어오면 그 값을 res에 담아놓고.
			this.server.sendAll(name+" : ", res);
		}
		} catch (Exception e) {
			this.server.list.remove(name);
			this.res="종료";
			
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
			Socket socket=server.accept(); //누군가 서버에 접속 했다면. 
			new RecieverM(socket,this).start();
		
		}
	}


	public void sendAll(String name, String res) throws Exception {
		Iterator it = list.keySet().iterator();
		
		if(this.first==0){
			while(it.hasNext()){
				ObjectOutputStream oos = (ObjectOutputStream) list.get(it.next());
				oos.writeObject(name+"님께서 접속하셨습니다.  현재 접속자수 : "+this.list.size());
				this.first=1;
			}
		}
		else if(res.equals("종료")){
			while(it.hasNext()){
				ObjectOutputStream oos = (ObjectOutputStream) list.get(it.next());
				oos.writeObject(name+"님께서 접속종료하셨습니다.  현재 접속자수 : "+this.list.size());
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
