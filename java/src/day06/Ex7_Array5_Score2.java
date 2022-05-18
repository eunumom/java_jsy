package day06;

import java.util.Scanner;

public class Ex7_Array5_Score2 {

	public static void main(String[] args) {
//		최대 10명 학생의 성적을 저장하기 위한 배열 선언
//		입력할 학생 수를 입력 받아 그만큼 성적을 입력 받고
//		총점과 평균을 출력하는 코드
//		예1
//		학생수를 입력하세요 : 3
//		1번 학생 : 90
//		2번 학생 : 80
//		3번 학생 : 70
//		총점 : 240점, 평균 : 80점
//		
//		예2
//		학생수를 입력하세요 : 11
//		최대 10명까지입니다.
//		
//		예3
//		학생수를 입력하세요 : 0
//		최소 1명부터입니다.
		
		
		Scanner scan = new Scanner(System.in);
		
		int sum=0;
		double avg=0;
		int i=0;
		
		for(i=1; i<=10; i++) {
		System.out.print("학생수를 입력하세요 : ");
		int num = scan.nextInt();
		
			if(num<1) {
				System.out.println("최소 1명부터입니다.");
			}
			else if(num>10) {
				System.out.println("최대 10명까지입니다.");
			}
			else {
				int []score = new int[num];
				for(int j=0; j<score.length; j++) {
					System.out.print(j+1+"번째 학생 성적 : ");
					score[j]=scan.nextInt();
				}
				
				for(int j=0; j<score.length; j++) {
					sum+=score[j];
				}
				
				avg=sum/(double)score.length;
			}
			System.out.println(num+"명의 총점은 "+sum+"점 이고, 평균은 "+avg+"점 입니다.");
		}
		
		scan.close();

	}

}
