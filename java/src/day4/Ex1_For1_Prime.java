package day4;

public class Ex1_For1_Prime {

	public static void main(String[] args) {
		/*정수 num가 소수인지 아닌지 판별하는 코드를 작성하시오.
		 * 소수는 약수가 1과 자기자신
		 * 약수가 2개
		 * 1은 소수 아님
		 * 
		 * 규칙성: i가 num의 약수면 약수의 개수를 하나 증가
		 * 		 num을 i로 나눴을 때 나머지가 0과 같다면 count를 1 증가
		 * 반복문 종료 후: 약수의 개수가 2개면 소수, 아니면 소수 아님으로 출력
		 * 			   count가 2면 소수, 아니면 소수 아님으로 출력
		 * */
		int i, count = 0;
		int num = 131;
		for(i=1; i<=num; i++) {
				if(num % i == 0) {
						count ++ ;
				}
		}
		if (count == 2) {
			System.out.println(num+"은 소수");
		}
		else {
			System.out.println(num+"은 소수가 아님");
		}
		

	}

}
