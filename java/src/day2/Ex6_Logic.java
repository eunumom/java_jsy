package day2;

public class Ex6_Logic {

	public static void main(String[] args) {
		
		//성적이 A학점인가? A학점의 기준은 90점 이상 ~ 100점 이하
		// score가 90점 이상 && score가 100점 이하
		// score >= 90 && score <= 100
		int score = 89;
		System.out.println(score + "점은 A 학점인가? " + (score >=90 && score <= 100));
		
		/* 유효하지 않은 성적인가?
		 * 유효한 성적은 0점 이상 100점 이하 : score >= 0 && score <= 100
		 * 유효하지 않은 성적 : score < 0 || score > 100
		 */
		
		int score1 = 105;
		System.out.println(score1 + "점은 잘못된 성적인가? " + (score1 < 0 || score1 > 100));
		

	}

}
