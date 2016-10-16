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
			ServerSocket server = new ServerSocket(7777); //��Ʈ��ȣ�� �����Ѵ�.
			System.out.println(getTime()+"���� �غ� �Ϸ�");
			
			while(true){
				
				System.out.println(getTime()+"���� ���");
				
				Socket client = server.accept(); //�������� ������ ����.
				
				
				System.out.println(getTime()+client.getInetAddress()+"���� ��û");
				
				OutputStream os = client.getOutputStream(); //Ŭ���̾�Ʈ���� �� ���ڴ�.
				
				DataOutputStream dos = new DataOutputStream(os);//�����;ƿ�ǲ��Ʈ���� 
				
				dos.writeUTF("�¼��� ���� ~  ");
				
				System.out.println(getTime()+client+" ������ ����");
				
				dos.close();
				os.close();
				client.close();
				
			}
		
		
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
