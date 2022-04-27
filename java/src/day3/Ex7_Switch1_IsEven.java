package day3;

public class Ex7_Switch1_IsEven {

	public static void main(String[] args) {
		/* 홀수 짝수 판별 예제
		 */
		int num = 4;
		if (num % 2 == 0) {
			System.out.println(num + "는 짝수");
		}else {
			System.out.println(num + "는 홀수");
		}
		
		switch(num % 2) {
		case 0:
				System.out.println(num + "는 짝수");
				break;
		case 1:
				System.out.println(num + "는 홀수");
				break;
		}
		
		switch(num % 2) {
		case 0:
				System.out.println(num + "는 짝수");
				break;
		default:
				System.out.println(num + "는 홀수");
				
		}

	}

}
