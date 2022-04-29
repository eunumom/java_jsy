package day5;

public class Ex7_NestedLoop2 {

	public static void main(String[] args) {
		/* 아래와 같이 출력되도록 코드 작성
		 * *		i=1, *=1
		 * **
		 * ***
		 * ****
		 * *****
		 * */
		
		for(int i=1; i<6; i++) {
			for(int j = 1; j<=i; j++) { //i개씩 : j<=i
				System.out.print("*");
			
			}
			System.out.println(); 
		}
		
		/* 아래와 같이 출력되도록 코드 작성
		 *     * 4 1 5-i i
		 *    ** 3 2
		 *   *** 2 3
		 *  **** 1 4
		 * ***** 0 5
		 * */
		
		for(int i=1; i<6; i++) {
			for(int j = 1; j<=(5-i); j++) {
					System.out.print(" ");
				}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*     *    	i=1 	" "=4		*=1
		 *    ***		i=2 	" "=3		*=3
		 *   *****		i=3 	" "=2 		*=5
		 *  *******		i=4 	" "=1 		*=7
		 * *********	i=5		" "=0 		*=9
		 * 						" "=5-i		*=1+((i-1)*2)
		 * 
		 *     *    	i=1 	" "=4 		*=1 		*=0
		 *    ** *		i=2 	" "=3 		*=2 		*=1
		 *   *** **		i=3 	" "=2 		*=3 		*=2
		 *  **** ***	i=4 	" "=1 		*=4 		*=3
		 * ***** ****	i=5 	" "=0 		*=5 		*=4
		 *    					" "=5-i		*=i			*=i-1
		 * */
		
		for(int i=1; i<6; i++) {
			for(int j = 1; j<=(5-i); j++) {
					System.out.print(" ");
				}
			for(int j=1; j<=1+((i-1)*2); j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<6; i++) {
			for(int j = 1; j<=(5-i); j++) {
					System.out.print(" ");
				}
			for(int j=1; j<=i; j++) {
					System.out.print("*");
			}
			for(int j=1; j<=(i-1); j++) {
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
