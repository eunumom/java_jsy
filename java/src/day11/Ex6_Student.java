package day11;

import java.util.Scanner;

/* - 학생 클래스: (private) 이름 학년 반 번호 국어 영어 수학
*  - 기능: (public) 입력 저장 출력 일치확인 수정
*  - 생성자: 초기화하는 생성자
*  */
public class Ex6_Student {
	
	private String name;
	private int grade, room, num;
	private double kor, eng, math;
	
	public void print() {
		System.out.println("========================================");
		System.out.println(name+": "+grade+"학년 "+room+"반 "+num+"번 "+"국어: "+kor+" 영어: "+eng+" 수학: "+math);
		System.out.println("========================================");
	}
	
	public boolean identify(int grade, int room, int num) {
		if(this.grade == grade && this.room == room && this.num == num) {
			return true;
		}
		return false;
	}
	
	public void modify(String name, double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}

	public Ex6_Student(String name, int grade, int room, int num, double kor, double eng, double math) {
		this.name = name;
		this.grade = grade;
		this.room = room;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	
}
