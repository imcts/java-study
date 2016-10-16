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
			System.out.println(url.getPort());//�̰� ���� �߸���. 
			System.out.println(url.getFile());//�ּ� ������ �κ��� ���Ϸ� ����.
			System.out.println(url.getHost());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			System.out.println(url.getProtocol());//��� �Ծ�. ���ͳ��� http �� ���. mail�� ������ ���°� smtp, ������ popx
			System.out.println(url.toURI()); //Ǯ�������� ���ش�. 
			System.out.println(url); //�̰͵� ���� - _- 
			
			
			
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
