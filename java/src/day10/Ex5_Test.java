package day10;

import java.util.Scanner;

public class Ex5_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		String name = null;
		int grade = 0, room = 0, num = 0;
		while (menu!=3) {
			System.out.println("메뉴");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 정보 출력");
			System.out.println("3. 프로그램 종료");
			System.out.print("메뉴를 선택하세요: ");
			Student student = new Student(name, grade, room, num);
			menu = scan.nextInt();
			
			switch(menu) {
				case 1:
					System.out.print("이름: ");
					name = scan.next();
					System.out.print("학년: ");
					grade = scan.nextInt();
					System.out.print("반: ");
					room = scan.nextInt();
					System.out.print("번호: ");
					num = scan.nextInt();
					break;
				case 2:
					student.print();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					break;
					
			}
		}
		scan.close();
	}

}
class Student {
	String name;
	int grade;
	int room;
	int num;
	
	public void print() {
		System.out.println(grade+"학년 "+room+"반 "+num+"번 "+name);
	}

	public Student(String name, int grade, int room, int num) {
		super();
		this.name = name;
		this.grade = grade;
		this.room = room;
		this.num = num;
	}
	
}
