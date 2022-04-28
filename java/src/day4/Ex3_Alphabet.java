package day4;

public class Ex3_Alphabet {

	public static void main(String[] args) {
		/* 반복문을 이용해 a~z까지 출력하는 코드를 작성하시오.
		 * */
		
		int i;
		for (i=0 ; i<26 ; i++) {
			System.out.print((char)('a'+i)+" ");
			}
		System.out.println();
		
		char j;
		for(j='a' ; j<= 'z'; j++) {
			System.out.print(j+" ");
		}
		
		int num = 1;
		char ch1 = 'a' + 1; // 1은 char 타입이라 타입변환이 발생하지 않음
		char ch2 = (char)('a' + num); //num은 int라 타입변환 발생, 자동타입변환되지 않음 - 강제변환 해야 함
		
	}
}
		


