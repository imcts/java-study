import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


class Student {
	int kor, eng, mat;
	String name;
	Scool scool;
	
	public Student(String scool, String name,int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.name = name;
		this.scool = new Scool(scool);
	}

	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", name=" + name + "]";
	}

	
	
	
}


class Scool {
	String name ;
	
	public Scool(String name) {
		this.name = name;
	}
}



public class baba {
	
	public static void main(String[] args) {
		Map<String, ArrayList<Student>> map = new HashMap<String, ArrayList<Student>>();
		
		map.put("금호", new ArrayList<Student>());
		map.put("신림", new ArrayList<Student>());
		
		
		List<String> list = new ArrayList<String>();
		list.add("금호");
		list.add("신림");
		
		
		for(int i=0; i<100; i++){
			int number = (int)(Math.random()*2);
			map.get(list.get(number)).add(new Student(list.get(number),"학생"+i, i, i+10, i+20));
		}
		
		Iterator<String> it = map.keySet().iterator();
		
		for(;it.hasNext();){
			String key = it.next();
			List<Student> itList = map.get(key);
			for(int i=0; i<itList.size(); i++){
				System.out.println( itList.get(i).toString()     );
				Scool scool = itList.get(i).scool;
				System.out.println(  scool.name   );
			}
		}
		
		
		
	}
	
	
	
}
