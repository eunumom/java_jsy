package day5;

public class Ex10_NestedLoop4_Alphabet {

	public static void main(String[] args) {
		/* a
		 * ab
		 * abc
		 * ...
		 * abcd...xyz
		 * */
		
		for(char end ='a'; end<='z'; end++) {
			for(char ch='a'; ch<=end; ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}
