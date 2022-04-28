package day4;

public class Ex9_While1 {

	public static void main(String[] args) {
		/* Hello 5회 출력
		 * */
		int i = 1;
		while(i<5) {
			System.out.println("Hello");
			i++;
		}
		
		i=5;
		while(i-- > 0) {
			System.out.println("Hi");
		} //더 간결하고 예쁨
	}

}
