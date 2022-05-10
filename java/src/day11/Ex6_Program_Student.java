package day11;

import java.util.Scanner;

public class Ex6_Program_Student {

	public static void main(String[] args) {
		/* 학생 정보(이름, 학년, 반, 번호, 국어, 영어, 수학 성적)을 관리하는 프로그램을 작성하시오.
		 * 1. 학생 정보 입력
		 *  - 한번에 입력받음
		 * 2. 학생 정보 출력
		 * 3. 학생 정보 수정
		 *  - 학년 반 번호를 입력받음
		 *  - 저장데이터와 일치하면 나머지 일괄 수정
		 * 4. 학생 정보 삭제
		 *  - 학년 반 번호 입력받음
		 *  - 일치하면 삭제
		 * 5. 프로그램 종료
		 * 6. 필요한 클래스가 있으면 확인 후 제작 //클래스: 정보를 효과적으로 관리하기 위해 필요
		 *  - 학생 클래스: 이름 학년 반 번호 국어 영어 수학
		 *  - 기능: 입력 저장 출력 일치확인 수정
		 *  - 생성자: 초기화하는 생성자
		 * 7. 기능 구현
		 *  - 클래스 정의 및 구현
		 *  - 반복문으로 메뉴 출력 및 선택
		 *  
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		int menu =-1;
		String name;
		final int max =30;
		Ex6_Student std[] = new Ex6_Student[max];
		
		int grade = 0, room = 0, num = 0;
		double kor, eng, math;
		int index=0, delIndex = -1;
		
		while(menu!=5) {
			menu = selectMenu(scan);
			
			switch(menu) {
			case 1:
				System.out.println("학생 정보를 입력하세요.");
				System.out.print("이름: ");
				name = scan.next();
				System.out.print("학년 반 번호: ");
				grade = scan.nextInt();
				room = scan.nextInt();
				num = scan.nextInt();
				System.out.print("국어 점수: ");
				kor = scan.nextDouble();
				System.out.print("영어 점수: ");
				eng = scan.nextDouble();
				System.out.print("수학 점수: ");
				math = scan.nextDouble();
				std[index] = new Ex6_Student(name, grade, room, num, kor, eng, math);
				index++;
				break;
			case 2:
				for(int i=0; i<index; i++) {
					std[i].print();
				} break;
			case 3:
				System.out.print("학년, 반, 번호를 입력하세요: ");
				grade = scan.nextInt();
				room = scan.nextInt();
				num = scan.nextInt();
				for(int i = 0; i<index; i++) {
					if(std[i].identify(grade, room, num)) {
						System.out.println("수정할 내용을 입력하세요.");
						System.out.print("이름: ");
						name = scan.next();
						System.out.print("국어 점수: ");
						kor = scan.nextDouble();
						System.out.print("영어 점수: ");
						eng = scan.nextDouble();
						System.out.print("수학 점수: ");
						math = scan.nextDouble();
						std[i].modify(name, kor, eng, math);
						break;
					}//왜 else가 안되는지?
					if(i+1 == index) {
						System.out.println("등록된 학생이 아닙니다.");
					}
				}
				break;
			case 4:
				System.out.print("학년, 반, 번호를 입력하세요: ");
				grade = scan.nextInt();
				room = scan.nextInt();
				num = scan.nextInt();
				for(int i = 0; i<index; i++) {
					if(std[i].identify(grade, room, num)) {
						delIndex = i;
						break;
					}
				}
				if(delIndex>=0) {
					for(int i=delIndex; i<index-1; i++) {
						std[i]=std[i+1];
					}
					index--;
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("등록된 학생이 아닙니다.");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다..........");
				break;
			default:
				System.out.println("메뉴를 잘못 선택했습니다!!!!!!!!!!!!");
			}
			
		}
		scan.close();
	}	
		
		
	
	
	public static int selectMenu(Scanner scan) {
		System.out.println("메뉴");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 출력");
		System.out.println("3. 학생 정보 수정");
		System.out.println("4. 학생 정보 삭제");
		System.out.println("5. 종료");
		System.out.print("메뉴를 입력하세요: ");
		int menu = scan.nextInt();
	
		return menu;
		
	}
	

}
