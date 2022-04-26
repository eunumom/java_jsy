package day2;

public class Ex17_Test5 {

	public static void main(String[] args) {
		/* num가 2의 배수면 2의 배수라고 출력
		 * num가 3의 배수면 3의 배수라고 출력
		 * num가 6의 배수면 6의 배수라고 출력
		 * num가 2, 3, 6의 배수가 아니면 2, 3, 6의 배수가 아니라고 출력
		 * 단, num가 6이면 6의 배수라고 출력해야 함(2 or 3의 배수 출력이 나오면 안됨
		 * */
		
		int num = 49;
		if (num % 6 == 0) {System.out.println(num + "은 6의 배수");}
		else if (num % 2 == 0) {System.out.println(num + "은 2의 배수");}
		else if (num % 3 == 0) {System.out.println(num + "은 3의 배수");}
		else {System.out.println(num + "은 2, 3, 6의 배수가 아님");}
		
		/* 선생님의 닶
		 * 힌트1: 6의 배수를 먼저 체크 - 이렇게 풀었음
		 * 힌트2: 2의 배수를 확인할 때 3의 배수가 아닌 수를 확인
		 * */

		if(num % 2 == 0 && num % 3 != 0) {System.out.println(num + "은 2의 배수");}
		else if(num % 3 == 0 && num % 2 != 0) {System.out.println(num + "은 3의 배수");}
		else if(num % 6 == 0) {System.out.println(num + "은 6의 배수");}
		else {System.out.println(num + "은 2, 3, 6의 배수가 아님");}
		
	
		
	}

}
