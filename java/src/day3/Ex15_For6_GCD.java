package day3;

public class Ex15_For6_GCD {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하시오.
		 * 12 : 1 2 3 4 6 12
		 * 18 : 1 2 3 6 9 18
		 * 12와 18의 공약수 : 1 2 3 6 
		 * 12와 18의 최대 공약수 : 6
		 * 반복 횟수: i는 1부터 num1까지 1씩 증가
		 * 규칙성: i가 num1의 약수이고 i가 num2의 약수면 i를 gcd라는 변수에 저장
		 * 		 = num1을 i로 나눴을 때 나머지가 0이고 num2를 i로 나눴을 때 나머지가 0이면 i를 gcd에 저장
		 * 반복문 종료 후 gcd를 출력
		 */
		

		/* 같은 타입의 변수를 여러개 선언하는 경우 ,을 통해 한 줄로 선언할 수 있음
		 * 타입 변수명1;
		 * 타입 변수명2;
		 * 타입 변수명3, 변수명4;
		 * */
		
		/* 변수 사용 범위
		 * i는 반복문 밖에 선언했기 때문에 반복문 이후에도 사용 가능
		 * j는 반복문 안에 선언했기 때문에 반복문 안에서만 사용 가능
		 * */
		
		/*int i;
		for(i=1; i<=5; i++);
		for(int j=1; j<=5; j++);
		*/
		
		int num1 = 12, num2 = 18, i, gcd = 0;
		for (i=1; i<=18; i++) {
				if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
				}				
		}
		System.out.println(gcd);
		
		
		//아래는 선생님 정답
		int num3 = 12, num4 = 18, gcd1 = 1;
		for(int i1=1 ; i1 <= num3 ; i1++ ) {
				if(num3 % i1 == 0 && num4 % i1 == 0) {
				gcd1 = i1;
			}
		}
		System.out.println(num3 + "과 " + num4 + "의 최대공약수는 " + gcd1 + "입니다." );
		

	}

}