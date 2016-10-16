package text_p;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

class DeciStud{
	String name;
	List<Integer> jum = new ArrayList<>();
	int sum=0, avg;
	String gimal;
	
	public DeciStud(String name, int kor, int eng, int mat) {
		this.name=name;
		this.jum.add(kor);
		this.jum.add(eng);
		this.jum.add(mat);
		cal();
	}
	public DeciStud(String name, int kor, int eng, int mat,String gimal) {
		this(name, kor, eng, mat);
		this.gimal=gimal;
		cal();
	}
	public DeciStud(String name, int kor, int eng, int mat, int mil) {
		this(name, kor, eng, mat);
		jum.add(mil);
		cal();
	}
	public DeciStud(String name, int kor, int eng, int mat, int mil,String gimal) {
		this(name, kor, eng, mat);
		this.gimal=gimal;
		cal();
	}
	
	
	private void cal() {
		sum=0;
		for(Integer buf:jum){
			sum+=buf;
		}
		this.avg=sum/jum.size();
	}
	
	@Override
	public String toString() {
		
		DecimalFormat df = new DecimalFormat("¡å#;¡â");	
		
		return name+" : " + jum + " ,"+sum+", "+avg+", "+"±â¸» : "+this.gimal+df.format(avg-(Integer.parseInt(gimal))).substring(0,1);
		
	}
	
	
}

public class DecimalExam {
	public static void main(String [] args){
		List<DeciStud> st = new ArrayList<>();
		
		st.add(new DeciStud("aaa", 90, 90, 90,"95"));
		st.add(new DeciStud("bbb", 89, 89, 97,20,"80"));
		st.add(new DeciStud("ccc", 66, 55, 88,"77"));
		
		
		
		
		
		
		for(DeciStud ss : st){
			System.out.println(ss);
			}
		
	}

}
