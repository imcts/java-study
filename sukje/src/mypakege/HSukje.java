package mypakege;

import java.util.Scanner;

class Student {
	String name, sex;
	int kor, eng, math, avg, tot;
	int cnt = 3;
	int rank = 1;
	
	public Student(String name, String sex, int kor, int eng, int math) {
		this.name = name;
		this.sex = sex;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.tot = this.kor + this.eng + this.math;
		this.avg = this.tot / this.cnt;
	}
}

class Calculator {
	Student [] students;
	Student [] result, print;
	
	public Calculator(Student [] students) {
		this.students = students;
	}
	
	public void initialize() {
		this.result = new Student[5];
		this.result = this.students;
		this.print = new Student[5];
		
	}
	
	public void IteratingKor() {
		this.initialize();
		for(Student o : result) {
			for(Student s : result) {
				if(o.kor < s.kor)
					o.rank++;
				else if(o.kor == s.kor) {
					if(o.eng < s.eng) 
						o.rank++;
					else if(o.eng == s.eng) {
						if(o.math < s.math)
							o.rank++;
					}
				}
			}
		}
		
		
		for(int i = 0, r = 1; i < result.length; r++) {
			for(int j = 0; j < result.length; j++) {
				if(result[j].rank == r) {
						print[i] = result[j];
						i++;
				} 
			}
		}
		
		this.print();
	}
	
	public void print() {
		
		System.out.println("이름\t성별\t국어\t영어\t수학\t총점\t평균\t등수");
		
		for(Student r : print){
			System.out.println(
					r.name + "\t" +
					r.sex + "\t" +
					r.kor + "\t" +
					r.eng + "\t" +
					r.math + "\t" +
					r.tot + "\t" +
					r.avg + "\t" +
					r.rank
					);
		}
	}
}

public class HSukje {
	
	public static void main(String [] args){
		Student [] st = {
				new Student("aaa", "남자", 100, 43, 33),
				new Student("bbb", "여자", 100, 43, 33),
				new Student("지은정", "여자", 10, 65, 55),
				new Student("최태산", "남자", 20, 55, 66),
				new Student("양희경", "남자", 30, 44, 35)
		};
		Calculator cal = new Calculator(st);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. 국어 등수\n2. 영어 등수\n3. 수학 등수\n4. 이름 순\n5. 평균\n6.종료");
			
			String key = sc.nextLine();
			
			switch (key) {
			case "1":
				cal.IteratingKor();
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				System.exit(0);
				break;

			default:
				System.out.println("메뉴외의 번호는 입력하실 수 없습니다.");
				break;
			}
		}
		
	}
	
	
	
	

}
