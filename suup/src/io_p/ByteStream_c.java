package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;



public class ByteStream_c {
	public static void main(String [] args) throws IOException{
		byte [] inArr = {1,34,3,2,1,-2,-128,127,4,2,4,3,4,3,42,34,-1};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(inArr); //inArr�� bis�� �ѹ��� ���Եȴ�.
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		/*int data;
		
		while((data=bis.read())!=-1){ //byte�� ������ ������ ����� ������ ġȯ�ع�����. �� �� ������. 
			//data���ٰ� bis�� ������ 1����Ʈ�� �Ѱ��ش�.
			
			bos.write(data); //bos�� data���� write�� �ϳ��� �Է½�Ų��. 
			
		}*/
		
		/*byte [] buf = new byte[8];
		
		bis.read(buf, 0, buf.length); //0���� 8����Ʈ����.
		bos.write(buf, 3, 3);*/
	
		
		/*bis.read(buf, 4, 4); //4���� 4ĭ�� ��������� ����� �Ͽ����� �հ����� 0�� ä���� 4�� �����´�. 
		//�Ѹ���� �տ� 0���� 4ĭ ä��� 4������ �����Ͷ� �Ǵ°�. 
		bos.write(buf, 3, 3);*/
		
		
		byte [] buf = new byte[4];
		
		while(bis.available() > 0){//�۾����� ���� �ִ��ĸ� ����Ե�. 
		int len = 	bis.read(buf) ; //������ ��� ���´����� ��������. 
		
		bos.write(buf,0,len); //������ 0���� len�� �������� ��������� ����� ��Ŵ.
		
		}
		
		
		byte [] outArr = bos.toByteArray(); //�������� bos�� �ִ� ������ �ѹ濡 �Ѱܹ�����.
		
		System.out.println("InArr : "+Arrays.toString(inArr));
		System.out.println("outArr : "+Arrays.toString(outArr));
		System.out.println("buf : "+Arrays.toString(buf));
		
		
	}

}
