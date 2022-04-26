package day2;

public class Ex11_If1 {

	public static void main(String[] args) {
		/* num이 짝수면 짝수라고 출력하는 코드를 if문을 이용해 작성하시오
		 * ~하면 -한다
		 * ~ : 조건식
		 * - : 실행문
		 * if(조건식){실행문;}
		 * if(num이 짝수이다){짝수라고 출력;}
		 * if(num % 2 == 0){짝수}
		 */
		
		if(true) {
			System.out.println("참입니다.");
			
		int num = 2;
		if(num % 2 == 0){System.out.println("짝수");}
		}

		/* score가 90 이상이고 100 이하면 A라고 출력하는 코드를 if문을 이용해 작성하시오
		 * if(score가 90 이상이고 100 이하){A라고 출력}
		 */
		int score = 95;
		if (score >= 90 && score <= 100) {System.out.println(score + "점이면 " + "A");}
		
		
	}

}
