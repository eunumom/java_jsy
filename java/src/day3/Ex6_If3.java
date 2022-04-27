package day3;

public class Ex6_If3 {

	public static void main(String[] args) {
		
		/* if(num % 2 == 0 && num % 3 != 0) {
			System.out.println(num + "은 2의 배수");
		}else if(num % 3 == 0 && num % 2 != 0) {
			System.out.println(num + "은 3의 배수");
		}else if(num % 6 == 0) {
			System.out.println(num + "은 6의 배수");
		}else {System.out.println(num + "은 2, 3, 6의 배수가 아님");
		} */
		
		int num = 6;
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println(num+"는 6의 배수");
			}else {
				System.out.println(num+"는 2의 배수");
			}
		}else if(num % 3 == 0) {
			System.out.println(num+"은 3의 배수");
		}else {
			System.out.println(num+ "은 2, 3, 6의 배수가 아님");
		}

	}

}
