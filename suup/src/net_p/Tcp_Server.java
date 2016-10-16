package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Tcp_Server {
	
	
	static String getTime(){
		SimpleDateFormat sdf = new SimpleDateFormat("[mm:ss]");
		return sdf.format(new Date());
		}
	
	
	public static void main(String [] args){
		
		try {
			ServerSocket server = new ServerSocket(7777); //포트번호를 지정한다.
			System.out.println(getTime()+"서버 준비 완료");
			
			while(true){
				
				System.out.println(getTime()+"연결 대기");
				
				Socket client = server.accept(); //누군가가 서버에 접속.
				
				
				System.out.println(getTime()+client.getInetAddress()+"연결 요청");
				
				OutputStream os = client.getOutputStream(); //클라이언트에다 뭘 쓰겠다.
				
				DataOutputStream dos = new DataOutputStream(os);//데이터아웃풋스트림을 
				
				dos.writeUTF("승수형 하이 ~  ");
				
				System.out.println(getTime()+client+" 데이터 전송");
				
				dos.close();
				os.close();
				client.close();
				
			}
		
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
