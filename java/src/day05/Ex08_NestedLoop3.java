package day05;

public class Ex08_NestedLoop3 {

	public static void main(String[] args) {
		/* 1~100 모든 소수 출력
		 * */
		
		for(int num = 1; num<= 100; num++) {
			
			int i, count = 0;
			
			for(i=1; i<=num; i++) {
				if(num % i == 0) {
						count ++ ;
				}
			}
			if(count==2) {
				System.out.print(num+ " ");
				}
		}
	}

}
