package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;



public class ByteStream_c {
	public static void main(String [] args) throws IOException{
		byte [] inArr = {1,34,3,2,1,-2,-128,127,4,2,4,3,4,3,42,34,-1};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr); //inArr이 bis에 한번에 들어가게된다.
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		/*int data;
		
		while((data=bis.read())!=-1){ //byte는 음수가 있으면 양수의 값으로 치환해버린다. 그 후 보낸다. 
			//data에다가 bis의 값들을 1바이트씩 넘겨준다.
			
			bos.write(data); //bos에 data값을 write로 하나씩 입력시킨다. 
			
		}*/
		
		/*byte [] buf = new byte[8];
		
		bis.read(buf, 0, buf.length); //0부터 8바이트까지.
		bos.write(buf, 3, 3);*/
	
		
		/*bis.read(buf, 4, 4); //4부터 4칸을 가져오라고 명령을 하였으나 앞공간에 0을 채워서 4를 가져온다. 
		//한마디로 앞에 0으로 4칸 채우고 4번까지 가져와라가 되는것. 
		bos.write(buf, 3, 3);*/
		
		
		byte [] buf = new byte[4];
		
		while(bis.available() > 0){//작업ㅎㄹ 놈이 있느냐를 물어보게됨. 
		int len = 	bis.read(buf) ; //보낼때 몇개를 보냈는지를 리턴해줌. 
		
		bos.write(buf,0,len); //받을때 0부터 len의 값까지만 가져오라고 명령을 시킴.
		
		}
		
		
		byte [] outArr = bos.toByteArray(); //마지막에 bos에 있는 값들을 한방에 넘겨버린다.
		
		System.out.println("InArr : "+Arrays.toString(inArr));
		System.out.println("outArr : "+Arrays.toString(outArr));
		System.out.println("buf : "+Arrays.toString(buf));
		
		
	}

}
