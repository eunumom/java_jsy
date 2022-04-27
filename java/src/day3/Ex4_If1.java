package day3;

import java.util.Scanner;

public class Ex4_If1 {

	public static void main(String[] args) {
		/*두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하시오.
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.print("두 정수와 산술 연산자를 입력하세요(예: 1 + 2) : ");
		int num1 = scan.nextInt();
		char op1 = scan.next().charAt(0);
		int num2 = scan.nextInt();
		System.out.print(""+num1 + op1 + num2 +"=");
		
		if (op1 == '+') {
			System.out.print(num1+num2);
		}
		else if (op1 == '-') {
			System.out.print(num1-num2);
		}
		else if (op1 == '/') {
			System.out.print((double)num1/num2);
		}
		else if (op1 == '%') {
			System.out.print((double)num1%num2); //나머지 연산자에는 double을 붙이지 않아도 됨
		}
		else {
			System.out.print("잘못된 연산자입니다.");
		}
		
		
		scan.close();
	}

}
