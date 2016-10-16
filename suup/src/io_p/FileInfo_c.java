package io_p;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.TreeSet;


class Comp implements Comparator{ //컴페어레이터의 경우에는 트리셋의 경우에 사용하게 된다. 

	
	//오브젝트1번은 지금마지막으로 들어가있던것, 오브젝트2 는 새로들어온것. 그 조건만 넣어주게되면 쉽게 진행 ㅇㅇ
	
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
		System.out.println(f.getName()); //경로는 나오지 않고 파일의 이름만 알려준다. 
		System.out.println(f.getName().substring(f.getName().lastIndexOf(".")+1));
		System.out.println(f.getAbsolutePath());//절대 경로 
		System.out.println(f.getParent());//디렉토리 
		System.out.println(f.isDirectory());//야 너 디렉토리냐
		System.out.println(f.isFile()); //파일이냐 
		
		System.out.println(System.getProperty("user.dir")); //사용자의 경로는 어디냐 
		
		System.out.println("-----------------------------------------------------------------------");
		
		File ff = new File("photo"); //폴더명을 지정 하였을때, 
		
		File [] files = ff.listFiles(); //파일 배열로 리스트파일을 넣어줌. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		TreeSet<File> set = new TreeSet(new Comp());
		
		
		for(File fff : files){
			
			set.add(fff);
			
		}
		
		
		
		for(File arr : set){ //파일은 파일대로 폴더는 폴더대로 
			
			String attr = "",name="";
			
			if(arr.isDirectory()){
				attr="dir";
				name="["+arr.getName()+"]";
			}else{
				name=arr.getName();
				attr+=arr.length()+" ";
				attr+=arr.canRead() ? "R" : " "; //읽을 수 있으면 
				attr+=arr.canWrite() ? "W" : " "; //쓸 수 있으면
				attr+=arr.isHidden() ? "H" : " "; //숨김파일이면. 
			}
			
			
			
			System.out.println(name + " " + sdf.format(arr.lastModified())+" "+attr);//마지막으로 사용한 시간이 언제냐. 라스트모디파이드 수정한시간
			
		}
		
	}

}
