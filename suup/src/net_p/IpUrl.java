package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IpUrl {
	public static void main(String [] args){
		
		try {
			InetAddress ip = InetAddress.getByName("www.naver.com");
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			System.out.println(ip);
			
			byte[] ipByte = ip.getAddress();
			
			System.out.println(Arrays.toString(ipByte));
			
			InetAddress [] arr = ip.getAllByName("www.naver.com"); //가지고있는 모든 ip값을 내놔라. 
			
			for(InetAddress buf : arr){
				
				System.out.println(buf);
				
			}
			
			
		ip = InetAddress.getLocalHost();
		System.out.println(ip);
		
		
		
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
