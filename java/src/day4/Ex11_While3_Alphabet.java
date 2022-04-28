package day4;

public class Ex11_While3_Alphabet {

	public static void main(String[] args) {
		/* a에서 z까지 출력하는 코드를 While문으로 작성하시오.
		 * 반복횟수 26
		 * */
		
		char i = 'a';
		
		while (i<='z') {
			//i++을 먼저 쓰면 b부터 나옴
			System.out.print(i+ " ");
			i++;
		}
		
		System.out.println(" ");
		
		i='a';
		while (i<='z') {
			System.out.print(i++ +" ");
		}
		

	}

}
