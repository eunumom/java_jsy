package day11;

import day11_1.*;

public class EX5_AccessModifier {

	public static void main(String[] args) {
		Ex5_A t1 = new Ex5_A();
		// public은 모두 사용 가능
		System.out.println(t1.num1);
		// default는 같은 패키지 내에서 사용 가능
		System.out.println(t1.num2);
		// private는 내 클래스에서만 사용 가능
		//System.out.println(t1.num3); //에러발생
		
		Ex5_B t2 = new Ex5_B();
		// public 모두 사용 가능
		System.out.println(t2.num1);
		// default 에러
		//System.out.println(t2.num2);
		// private 에러
		//System.out.println(t2.num3);

	}

}
