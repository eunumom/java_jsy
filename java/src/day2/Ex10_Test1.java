package day2;

public class Ex10_Test1 {

	public static void main(String[] args) {
		// num가 짝수인지 아닌지 확인하는 코드를 작성하시오.
		// A성적 출력하는 예제를 활용
		/* 짝수는 num을 2로 나누었을 때 나머지가 0임
		 * unm 2 % 0 ==
		 * num % 2 == 0
		 */
		
		int num = 5;

		System.out.println(num + "는 짝수인가? " + true);
		System.out.println(num % 2 == 0);
		System.out.println(num + "는 짝수인가? " + (num % 2 == 0));
		
		/* num이 짝수면 num은 짝수라고 출력하고,
		 * num이 짝수가 아니면 num은 짝수가 아님으로 출력하도록 코드를 작성하시오.
		 */
		String str = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num + "는 " + str);
		
	}
	

}
