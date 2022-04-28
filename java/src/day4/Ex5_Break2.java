package day4;

import java.util.Scanner;

public class Ex5_Break2 {

	public static void main(String[] args) {
		/* 양의 정수를 5번 입력하고, 입력한 정수를 콘솔에 출력하는 코드를 작성하시오.*/
		
		int i, num;
		
		Scanner scan = new Scanner(System.in);
		
		for( ; ; ) {
			System.out.print("양의 정수 입력 : ");
			num = scan.nextInt();
			if(num<0) {
				System.out.println("음수임");
				break;
			}
			else {
				System.out.println(num);
			}
		scan.close();
			
		}
	
		
		/* 양의 정수를 무한으로 입력으로 수정*/
		/* Scanner를 이용해 정수를 입력받아 num에 저장
		 * num이 음수면 반복문을 빠져나가고, 아니면 num을 출력*/

	}

}
