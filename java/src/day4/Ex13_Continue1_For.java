package day4;

public class Ex13_Continue1_For {

	public static void main(String[] args) {
		/* 1~10 짝수 출력하기 (Continue 이용)
		 * 반복횟수: i는 1부터 10까지 1씩 증가
		 * 규칙성: i가 홀수면 continue 아니면 i 출력
		 * */

		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		int i =1;
		while(i<=10) {
			if(i%2 !=0) {
				i++;
				continue;
			}
			System.out.print(i);
			i++; //이것의 역할은?
		}
		
		
	}

}
