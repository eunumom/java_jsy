package day2;

public class Ex14_Test2 {

	public static void main(String[] args) {
		/* 성적에 맞는 학점을 출력하는 코드를 if문을 이용해 작성하시오.
		 * A: 90이상 100이하
		 * B: 80이상 90미만
		 * C: 70이상 80미만
		 * D: 60이상 70미만
		 * F: 0이상 60미만
		 * 0미만, 100초과인 경우 잘못된 성적이라고 출력하도록 수정하시오.
		 * */
		int score = 101;
		if (score > 100 || score < 0) {System.out.println(score + "는 잘못된 성적임");}
		else if (score >= 90 && score <= 100) {System.out.println(score + "는 A학점");}
		// 위 if 추가로 현 else if의 && score <= 100은 불필요해짐
		// 수정: else if (score >= 90)으로 충분함
		else if (score >= 80) {System.out.println(score + "는 B학점");}
		else if (score >= 70) {System.out.println(score + "는 C학점");}
		else if (score >= 60) {System.out.println(score + "는 D학점");}
		else {System.out.println(score + "는 F학점");}
		

	}

}
