package day05;

import java.util.Scanner;

public class Ex11_BaseballGame {

	public static void main(String[] args) {
		/*숫자야구게임
		 * 중복되지 않는 1~9 세 정수를 입력받아 맞추기
		 * 
		 * 반복횟수: s가 3보다 작을 때까지
		 * 규칙성: 정수 3개 입력 받음
		 * 		 com == user 면 s++
		 * 		 com1 == user2 || com1 == user3 면 b++
		 * 		 s !=0 면 sysout XS
		 * 		 b !=0 면 sysout YB
		 * 		 s==0 && b==0 면 sysout O
		 * */
		
		int com1=3, com2=8, com3=9;
		int s = 0, b;
		
		Scanner scan = new Scanner(System.in);
				
		while(s<3) {
			s=0;
			b=0;
			
			System.out.print("수를 입력하세요 (예: 1 2 3) : ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();
			
			if (com1==user1) {
				s++;
			}
			if (com2==user2) {
				s++;
			}
			if (com3==user3) {
				s++;
			}
			if (com1==user2 || com1==user3) {
				b++;
			}
			if (com2==user1 || com2==user3) {
				b++;
			}
			if (com3==user1 || com3==user2) {
				b++;
			}
			if (s!=0) {
			System.out.println(s+"S");
			}
			if (b!=0) {
			System.out.println(b+"B");
			}
			if (s==0 && b==0) {
			System.out.println("O");
			}		
			if (s==3) { //없어도 거짓이라 빠져나옴
			break;
			}
			
		}
		
		
		scan.close();
		
	}

}
