package io_p;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.TreeSet;


class Comp implements Comparator{ //���������� ��쿡�� Ʈ������ ��쿡 ����ϰ� �ȴ�. 

	
	//������Ʈ1���� ���ݸ��������� ���ִ���, ������Ʈ2 �� ���ε��°�. �� ���Ǹ� �־��ְԵǸ� ���� ���� ����
	
	@Override
	public int compare(Object o1, Object o2) {
		
		if(((File)o1).isDirectory()){
			if( ((File)o1).lastModified() > ((File)o2).lastModified()  && ((File)o2).isDirectory()  )
				return 1;
			else 
				return -1;
		}else{
			if( ((File)o1).lastModified() > ((File)o2).lastModified()  && ((File)o2).isFile()  )
				return -1;
			else 
				return 1;
		}
	}
}



public class FileInfo_c  {
	public static void main(String [] args ){
		File f = new File("photo/oh.jpg");
		System.out.println(f.getName()); //��δ� ������ �ʰ� ������ �̸��� �˷��ش�. 
		System.out.println(f.getName().substring(f.getName().lastIndexOf(".")+1));
		System.out.println(f.getAbsolutePath());//���� ��� 
		System.out.println(f.getParent());//���丮 
		System.out.println(f.isDirectory());//�� �� ���丮��
		System.out.println(f.isFile()); //�����̳� 
		
		System.out.println(System.getProperty("user.dir")); //������� ��δ� ���� 
		
		System.out.println("-----------------------------------------------------------------------");
		
		File ff = new File("photo"); //�������� ���� �Ͽ�����, 
		
		File [] files = ff.listFiles(); //���� �迭�� ����Ʈ������ �־���. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		TreeSet<File> set = new TreeSet(new Comp());
		
		
		for(File fff : files){
			
			set.add(fff);
			
		}
		
		
		
		for(File arr : set){ //������ ���ϴ�� ������ ������� 
			
			String attr = "",name="";
			
			if(arr.isDirectory()){
				attr="dir";
				name="["+arr.getName()+"]";
			}else{
				name=arr.getName();
				attr+=arr.length()+" ";
				attr+=arr.canRead() ? "R" : " "; //���� �� ������ 
				attr+=arr.canWrite() ? "W" : " "; //�� �� ������
				attr+=arr.isHidden() ? "H" : " "; //���������̸�. 
			}
			
			
			
			System.out.println(name + " " + sdf.format(arr.lastModified())+" "+attr);//���������� ����� �ð��� ������. ��Ʈ������̵� �����ѽð�
			
		}
		
	}

}
