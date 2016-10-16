package net_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;



public class URL_p {
	public static void main(String [] args){
		try {
			URL url = new URL("http://comic.naver.com/webtoon/detail.nhn?titleId=602925&no=29&weekday=sat");
			System.out.println(url.getAuthority());
			System.out.println(url.getContent());
			System.out.println(url.getDefaultPort());
			System.out.println(url.getPort());//이건 뭔가 잘못댐. 
			System.out.println(url.getFile());//주소 이후의 부분을 파일로 인지.
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getProtocol());//통신 규약. 인터넷은 http 를 사용. mail을 보낼때 쓰는건 smtp, 받을땐 popx
			System.out.println(url.toURI()); //풀테임으로 뺴준다. 
			System.out.println(url); //이것도 같음 - _- 
			
			
			
			System.out.println("---------------------------------------------------");
			
			
			InputStreamReader isr = new InputStreamReader(url.openStream());
			BufferedReader br = new BufferedReader(isr);
			
			
			String line;
			while((line=br.readLine())!=null){
				
				System.out.println(line);
				
			}
			
			br.close();
			isr.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
