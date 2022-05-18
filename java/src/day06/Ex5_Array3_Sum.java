package day06;

import java.util.Scanner;

public class Ex5_Array3_Sum {

	public static void main(String[] args) {
//		학생 3명의 국어 성적을 입력받고 총점과 평균을 구하는 코드
//		단, 총점과 평균을 출력한 후, 학생 3명의 성적을 출력하시오

		int []score = new int[3];
	
		Scanner scan = new Scanner(System.in);
		int sum=0;
		double avg=0;

		for(int i=0; i<score.length; i++) {
			System.out.print(i+1+"번째 학생 성적 : ");
			score[i]=scan.nextInt();
		}
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		
		avg=sum/(double)score.length;
		
		System.out.println("3명의 총점은 "+sum+"점 이고, 평균은 "+avg+"점 입니다.");
		
		for(int i=0; i<score.length; i++) {
			System.out.println(i+1+"번째 학생 성적 : " + score[i]+"점");
		}
		
		scan.close();
	}

}
