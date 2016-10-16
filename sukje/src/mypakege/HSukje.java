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
		
		System.out.println("�̸�\t����\t����\t����\t����\t����\t���\t���");
		
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
				new Student("aaa", "����", 100, 43, 33),
				new Student("bbb", "����", 100, 43, 33),
				new Student("������", "����", 10, 65, 55),
				new Student("���»�", "����", 20, 55, 66),
				new Student("�����", "����", 30, 44, 35)
		};
		Calculator cal = new Calculator(st);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. ���� ���\n2. ���� ���\n3. ���� ���\n4. �̸� ��\n5. ���\n6.����");
			
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
				System.out.println("�޴����� ��ȣ�� �Է��Ͻ� �� �����ϴ�.");
				break;
			}
		}
		
	}
	
	
	
	

}
