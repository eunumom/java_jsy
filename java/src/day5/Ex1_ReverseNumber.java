package day5;

import java.util.Scanner;

public class Ex1_ReverseNumber {

	public static void main(String[] args) {
		/* 정수를 입력받아 그 정수를 역으로 출력하는 코드를 작성하시오.
		 * 1230 -> 0321
		 * 1230에서 0 출력 (1230을 123으로) 
		 * 순차적으로 진행...
		 * 
		 * 
		 * 반복횟수: num이 0이 아닐 때까지
		 * 규칙성: num의 일의 자리를 출력한 후 num을 10으로 나눈 몫을 num에 저장
		 * */
		System.out.print("정수를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
//		while (true) {
//			//일의 자리를 출력
//			System.out.print(num%10);
//			num=num/10;
//			if(num<1) {
//				break;
//			}
//	
//		}
			while (num != 0) {
			System.out.print(num%10);
			num=num/10;
		}
	}

}
