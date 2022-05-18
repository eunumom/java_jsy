package day05;

import java.util.Scanner;

public class Ex03_UpDown {

	public static void main(String[] args) {
		/* 랜덤으로 생성된 수(1~100)를 맞추는 게임
		 * 정수를 입력했을 때 입력한 정수보다 랜덤 수가 크면 Up, 작으면 Down 표시
		 * 맞으면 "맞췄습니다"
		 * */
		int min =1, max =100;
		int r= (int)(Math.random() * (max-min+1)+min);
		System.out.println("랜덤으로 생성한 수(1~100) : "+r);
		
		Scanner scan = new Scanner(System.in);
		for( ; ; ) {
			int num = scan.nextInt();
			if (num==r) {
				System.out.println("맞췄습니다");
				break;
			}
			else if (num>r) {
				System.out.println("Down");
			}
			else {
				System.out.println("Up");
			}
		}
		//선생님은 while을 썼음
		//num<1 or num>100이면 스킵
		while(true) {
			System.out.println("1~100사이의 정수를 입력하세요 : ");
			int num = scan.nextInt();
			
			if(num<1 || num>100) {
				continue;
			}
			//아래 if를 esle if로 바꿀 필요 없음
			if(num==r) {
				System.out.println("맞췄습니다");	
				break;
			}
			else if(num>r) {
				System.out.println("Down");
			}
			else {
				System.out.println("Up");
			}
		}
		scan.close();
		
	
	}

}
