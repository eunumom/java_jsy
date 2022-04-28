package day4;

import java.util.Scanner;

public class Ex2_For2_Score {

	public static void main(String[] args) {
		/*3명의 국어 점수를 입력받아 총점과 평균을 구하는 코드를 작성하시오.(반복문 이용)
		 * 
		 * 반복 3회
		 * 규칙성: 성적을 입력받고 총점에 누적
		 * 		 Scanner를 이용해 정수를 입력받아 num에 저장 후
		 * 		 sum에 num을 더해서 sum에 저장
		 * 반복문 종료 후 총점 출력, 총점을 이용해 평균 계산, 총점 출력
		 * 			  sum을 출력하고 sum을 3으로 나눠서 avg에 저장 후 avg 출력*/
		
		
		/*System.out.println("국어점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		System.out.print("A님 : ");
		int num1 = scan.nextInt();
		if (num1>100 || num1<0) {
			System.out.println("잘못된 점수입니다.");
		}
		System.out.print("B님 : ");
		int num2 = scan.nextInt();
		if (num2>100 || num2<0) {
			System.out.println("잘못된 점수입니다.");
		}
		System.out.print("C님 : ");
		int num3 = scan.nextInt();
		if (num3>100 || num3<0) {
			System.out.println("잘못된 점수입니다.");
		}
		
		System.out.println("세 명의 국어성적 총점은 " + (num1+num2+num3) + "이고, 평균은 " + ((float)(num1+num2+num3)/3) + "입니다.");
		*/
		
		int i, sum = 0;
		double avg = 0;
		Scanner scan1 = new Scanner(System.in);
		
		for(i=1 ; i<=3 ; i++ ) {
				System.out.print("학생"+ i + "의 국어 성적 : "); 
				int num3 = scan1.nextInt();
				sum = sum + num3; //sum += num;
				avg = (double) (sum / i);
		}
		System.out.println("총점은" + sum + "입니다.");
		System.out.println("평균은" + avg + "입니다.");
		
		scan1.close();

	}

}
