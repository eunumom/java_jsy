package day2;

import java.util.Scanner; //외부 라이브러리를 가져올 때 입력

public class Ex18_Scanner {

	public static void main(String[] args) {
		/* 콘솔창에서 정수를 입력받는 예제
		 * System.in : 콘솔에서 입력
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : "); //문자열 입력 후 옆에서 입력 받기 위해 print 사용
		int num1 = scan.nextInt();
		System.out.println("입력한 정수는 " + num1 + "입니다.");
		
		
		scan.close();
	}

}
