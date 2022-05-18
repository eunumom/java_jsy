package day05;

public class Ex02_Random {

	public static void main(String[] args) {
		/* 0<=Math.random()<1 실수범위
		 * min <= Math.random()*(max-min+1)+min < max+1
		 * r= (int)(Math.random() * (max-min+1)+min); //랜덤코드
		 * */
		int min=1, max=10;
		int r = 0;
		for(int i=1; i<=10;i++) {
			r= (int)(Math.random() * (max-min+1)+min);
		System.out.print(r+" ");
		}
		
	}

}
