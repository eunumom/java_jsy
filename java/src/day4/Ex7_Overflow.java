package day4;

public class Ex7_Overflow {

	public static void main(String[] args) {
		/* 정수에서 표현범위를 넘어가는 경우 발생
		 * */
		byte num = 127;
		num = (byte) (num + 1);
		System.out.println(num); //overflow : byte는 127까지 표현가능
		
		num = (byte) (num - 1);
		System.out.println(num); //underflow : byte는 -128까지 표현 가능

	}

}
