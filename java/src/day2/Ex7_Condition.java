package day2;

public class Ex7_Condition {

	public static void main(String[] args) {
		/* 조건 선택 연산자 예제
		 * (조건식) ? 참일 때 값 : 거짓일 때 값
		 * 성적이 A학점이면 A로 출력, 아니면 A 아님으로 출력하는 예제
		 */
		int score = 90;
		String isA = (score >=90 && score <= 100) ? "A" : "A 아님";
		System.out.println(score + "점은 " + isA);
		System.out.println(score + "점은 A 학점인가? " + (score >=90 && score <= 100));

	}

}
