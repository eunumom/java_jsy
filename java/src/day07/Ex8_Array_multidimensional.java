package day07;

public class Ex8_Array_multidimensional {

	public static void main(String[] args) {
		// 1-1의 국어성적 저장을 위한 배열 선언
		// 각 반 인원 최대 30명
		int score1 [] = new int [30];
		
		// 1학년 전체 학생의 국어성적 저장을 위한 배열 선언
		// 각 학년은 최대 10반
		int score2 [] = new int [30*10];
		int score3 [][] = new int [10][30];
		score1[10] = 100; // 1반 11번
		score2[201] = 100; // 7반 22번
		score3[6][21] = 100; // 7반 22번
		
		//1~3학년 전제
		int score4[][][] = new int [3][10][30];
		
	}

}
