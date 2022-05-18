package day08;

public class Ex3_Method3_GCD_LCM {

	public static void main(String[] args) {

		int a = 4, b = 8;
		int gcd = gcd(a, b);
		System.out.println(gcd);
		int lcm = lcm(a, b);
		System.out.println(lcm);
		
		
	}
	/* 기능 : 두 정수가 주어지면 최대공약수를 알려주는 메소드
	 매개변수 : int num1, int num2,
	 리턴타입 : 정수 int
	 메소드명: gcd
	 * */
	
	
	public static int gcd(int num1, int num2) {
		int gcd = 0;
		for (int i=1; i<=num1; i++) {
			if (num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
		return gcd;
		
	}
	/*
	 * 기능 : 두 정수의 최소공배수를 알려주는 메소드
	 * 매개변수 : 두 정수 int num1, int num2
	 * 리턴타입 : 정수 int
	 * 메소드명 : lcm
	 */
	
	public static int lcm(int num1, int num2) {
		return num1*num2 / gcd(num1,num2);
		
	}
	

}
