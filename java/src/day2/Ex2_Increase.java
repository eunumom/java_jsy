package day2;

public class Ex2_Increase {

	public static void main(String[] args) {
		// 증감 연산자: 최종적으로 1증가 또는 1 감소
		// 전위형: ++변수형, 증가 후 동작
		// 후위형: 변수명++, 동작 후 증가
		
		int no1 = 10, no2 = 10;
		// no1: 전위형, no2: 후위형
		System.out.println(no1 + " , " + no2);
		System.out.println(++no1 + " , " + no2++);
		System.out.println(no1 + " , " + no2);
		
		System.out.println();
		
		int no3 = 10, no4 = 10;
		// no1: 전위형, no2: 후위형
		System.out.println(no3 + " , " + no4);
		no3++; //++no3; //no3 = no3 + 1;
		System.out.println(no3 + " , " + no4);
		no4++; //++no4; //no4 = no4 + 1;
		System.out.println(no3 + " , " + no4);
		
		
	}

}
