package day3;

public class Ex5_If2 {

	public static void main(String[] args) {
		/*num가 6의 배수인지 아닌지 판별하는 코드를 중첩 if문으로 작성하시오
		 * num % 6 == 0
		 * 6의 배수는 2와 3의 공배수
		 * */
		
		int num = 12;
		
		if (num % 6 == 0) {
			System.out.println(num+"은 6의 배수");
		}
		else {
			System.out.println(num+"은 6의 배수 아님");
		}

	}

}
