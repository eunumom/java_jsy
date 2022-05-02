package day6;

import java.util.Scanner;

public class Ex8_Array6_Divisor {

	public static void main(String[] args) {
//		정수 num의 약수를 배열에 저장 후 출력
//		약수는 최대 10개까지 저장
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int max=10;
		int div[] = new int[max];
		int index=0;
		
		
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
//				System.out.print(i+" ");
				if(index<max) {
					div[index]=i;
					index++;
				}
			}
		}
		for(int i=0; i<index; i++) {
			System.out.print(div[i]+" ");
		}
		scan.close();
		
		
	}

}
