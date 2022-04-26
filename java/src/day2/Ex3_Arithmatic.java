package day2;

public class Ex3_Arithmatic {

	public static void main(String[] args) {
		// 산술 연산자 주의사항1 : 나누기 할 때 소수점 사라짐 주의
		// 정수 연산자 정수 = 정수 
		// 5 + 7 = 7
		// 5 - 2 = 3
		// 5 * 2 = 10
		// 5 / 2 = 2 -> 2.5가 나오지 않음 주의!
		// 5 % 2 = 1
		// 정수 연산자 실수 = 실수: 정수가 타입 변환 됨
		// 실수 연산자 실수 = 실수

		System.out.println(5 + 2);
		System.out.println(5 - 2);
		System.out.println(5 * 2);
		System.out.println(5 / 2);
		System.out.println(5 / 2.0);
		System.out.println(5 / (double)2);
		System.out.println(5 % 2);
		
		// 산술 연산자 주의 사항2 : 0으로 나누는 경우 예외 발생 가능 (정수 / 0인 경우, 정수 % 0인 경우)
		System.out.println(5 / 0.0);
		System.out.println(5 / 0);
		System.out.println(5 % 0);
		System.out.println("프로그램 종료");
	}

}
