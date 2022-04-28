package day4;

public class Ex10_While2_Sum {

	public static void main(String[] args) {
		/* 1~5의 합을 구하시오.(While문)
		 * */
		
		int i = 1;
		int sum = 0;
		
		while (i<=5) {
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		i = 1;
		sum = 0;
		
		while (i<=5) {
			sum += i++;
		}
		System.out.println(sum);
		
		
	}

}
