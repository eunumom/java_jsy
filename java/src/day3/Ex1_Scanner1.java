package day3;

import java.util.Scanner;

public class Ex1_Scanner1 {

	public static void main(String[] args) {
		/*한 학생의 수학, 영어, 국어 성적을 입력받고
		 * 총점과 평균을 구하시오
		 * 단, 성적은 정수로 입력받고 0~100사이의 정수를 입력해야 함 */
		
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		System.out.print("수학 ");
		int num1 = scan.nextInt();
		if (num1>100 || num1<0) {
			System.out.println("잘못된 점수입니다.");
		}
		System.out.print("영어 ");
		int num2 = scan.nextInt();
		if (num2>100 || num2<0) {
			System.out.println("잘못된 점수입니다.");
		}
		System.out.print("국어 ");
		int num3 = scan.nextInt();
		if (num3>100 || num3<0) {
			System.out.println("잘못된 점수입니다.");
		}
		
		System.out.println("총점은 " + (num1+num2+num3) + "이고, 평균은 " + ((float)(num1+num2+num3)/3) + "입니다.");
		/* 선생님은 다음과 같이 변수 선언 후 실행
		 * int sum = num1 + num2 + num3;
		 * System.out.println("세 과목의 총점은 " + sum + "점입니다.");
		 * 
		 * double avg = sum / 3.0;
		 * System.out.println("세 과목의 평균은 " + avg + "점입니다.");
		 * */
		
		
		/* Scanner scan1 = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scan1.nextInt();
		System.out.println("입력한 정수는 "+num+"입니다.");
		
		
		scan1.close();
		*/

		
	}

}
