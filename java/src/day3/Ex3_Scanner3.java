package day3;

import java.util.Scanner;

public class Ex3_Scanner3 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자(+ - / %) 를 입력받아 출력하는 코드를 작성하시오.
		 * 산술 연산자는 문자로!
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int num1 = scan.nextInt();
		
		System.out.println("연산자(+ - / %)를 입력하세요: ");
		char ch = scan.next().charAt(0); //연산자를 의미하는 op로 선언
		
		System.out.println("정수를 입력하세요: ");
		int num2 = scan.nextInt();
		
		System.out.println("입력한 연산식은 "+num1+ch+num2+"입니다.");
		/*num1+op+num2 = 46이 나옴
		 문자는 정수취급 +는 유니코드표에서 십진수 43에 해당
		 문자열 +정수 = 문자열 
		 ""+num1+op+num2
		 */
		
		
		/*Answer
		 * 방법1
		 * 정수1을 입력하세요
		 * 정수2를 입력하세요
		 * 산술 연산자를 입력하세요
		 * 
		 * 방법2
		 * 두 정수와 산술 연산자를 입력하세요(예: 1 + 2)
		 * 
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하세요(예: 1 + 2)");
		int num1 = scan.nextInt();
		char op1 =scan.next().charAt(0);
		int num2 = scan.nextInt();
		System.out.println(""+num1 + op + num2);
		*/
				
		scan.close();
		
	

	}

}
