package day5;

public class Ex09_MultiplicationTable {

	public static void main(String[] args) {
		/* 구구단 7단 출력
		 * */

		for(int j=2; j<=9; j++) {
			for(int i=1; i<=9; i++) {
				System.out.println(j+" x "+i+" = "+j*i);
			}
		}

	}

}
