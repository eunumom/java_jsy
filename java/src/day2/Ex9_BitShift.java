package day2;

public class Ex9_BitShift {

	public static void main(String[] args) {
		/* 비트 이동 연산자
		 * A << B : A를 2의 B제곱 만큼 곱한 결과 값
		 * 3 << 2
		 * 000011 -> (00)001100 = 12 (3*2의 2제곱)
		 * 
		 * A >> B : A를 2의 B제곱 만큼 나눈 결과의 몫
		 * 3 >> 1
		 * 000011 -> 000001(1) = 1
		 * 
		 * A >> 1
		 * -4 >> 1
		 * 11111110 = -2
		 * -4 >>> 1
		 * 01111110 =6
		 * 
		 * 결과가 이러할 뿐 결과 값을 얻기 위해 사용하는 것은 아님
		 */
		
		byte no1 = 3;
		byte no2 = -4;
		System.out.println(no1 << 2);
		System.out.println(no1 >> 1);
		System.out.println(no2 >> 1);
		System.out.println(no2 >>> 1);
		


	}

}
