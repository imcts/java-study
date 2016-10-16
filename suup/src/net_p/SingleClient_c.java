package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;




public class SingleClient_c {
	public static void main(String [] args) throws Exception{
		Socket socket = new Socket("localhost",8888);
		
		new SingleSender(socket).start();
		new SingleReceiver(socket).start();
	}
}
