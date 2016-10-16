package jdbc_C;

import java.util.Date;

public class Stud {
	private int id,kor,eng,mat;
	private String name, tel;
	private Date birth;
	
	public Stud(int id, int kor, int eng, int mat, String name, String tel,Date birth) {
		super();
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.name = name;
		this.tel = tel;
		this.birth = birth;
	} 
	
	
	
	@Override
	public String toString() {
		return "Stud [id=" + id + ", kor=" + kor + ", eng=" + eng + ", mat="
				+ mat + ", name=" + name + ", tel=" + tel + ", birth=" + birth
				+ "]";
	}



	public Stud() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	
	
}
