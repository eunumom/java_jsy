package day4;

public class Ex6_Break3_LCM {

	public static void main(String[] args) {
		/* 최소공배수 구하기
		 * */
		
		int num1 = 10;
		int num2 = 15;
		
		int i;
		for(i=1 ;i<=num1*num2 ; i++) {// i++(1씩 증가 대신) num1씩 증가하도록 하는 것이 더 좋음!
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
			}
		}

		
		for(i=num1 ;i<=num1*num2 ; i+=num1) {// i++(1씩 증가 대신) num1씩 증가하도록 하는 것이 더 좋음!
			if(i%num1==0 && i%num2==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
