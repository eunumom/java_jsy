package day2;

public class Ex13_If3 {

	public static void main(String[] args) {
		/* num가 양수면 양수라고 출력
		 * num가 음수면 음수라고 출력
		 * num가 0이면 0이라고 출력하는 코드를 if문을 이용해 작성하시오.
		 * if문에서 if는 반드시 1개 있어야 함 (필수)
		 * else if는 0개 이상 있을 수 있음 (여러개 가능)
		 * else는 0개 또는 1개임
		 */
		
		int num = 0;
		if (num > 0) {System.out.println(num + "은 양수");}
		else if (num < 0) {System.out.println(num + "은 음수");}
		else {System.out.println(num + "은 0");}

	}

}
