package day2;

public class Ex12_If2 {

	public static void main(String[] args) {
		/* num이 짝수면 짝수라고 출력, 짝수가 아니면 홀수라고 출력하는 코드를 if문을 이용해 작성하시오.
		 * if(num이 짝수) {짝수라고 출력;}
		 * if(num이 짝수가 아님) {홀수라고 출력;}
		 * if(num이 짝수) {짝수라고 출력;} else {홀수라고 출력;}*/

		int num = 4;
				//if문을 두번 쓴 예제는 num을 홀/짝에 관계없이 무조건 2번 비교함
		if(num % 2 == 0) { System.out.println(num + "은 짝수"); }
		if(num % 2 != 0) { System.out.println(num + "은 홀수"); }
		if(num % 2 == 0) { System.out.println(num + "은 짝수"); }
		else { System.out.println(num + "은 짝수"); }
		
		
	}

}
