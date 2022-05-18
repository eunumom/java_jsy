package day07;

import java.util.Scanner;

public class Ex6_Array_Lotto {

	public static void main(String[] args) {
		//로또 번호 생성기
		
		int min=1, max=45;
		int lotto[] = new int[7];
		
		int count=0; //배열에 저장된 중복되지 않은 숫자의 개수
		
		for( ; count<lotto.length; ) {
			int r=(int)(Math.random()*(max-min+1)+min);
			int i=0;
			for(; i<count; i++) {
				if(r==lotto[i]) {
					break;
				}
			}
			if(i ==count) {
				lotto[count]=r;
				System.out.print(lotto[count]+" ");
				count++;
			}
		}
		
		int lotto1[] = new int[7];
		int count1=0;
		for( ; count1<7; ) {
			int r = (int)(Math.random()*45+1);
			int i;
			for(i=0; i<count; i++) {
				if(r==lotto1[i]) {
					break;
				}
			}
			if(i==count1) {
				lotto1[count1++] = r;
				System.out.println(r+" ");
			}
		}
		
		//사용자 번호: 1~45 정수 6개를 입력받아 user 배열에 저장하는 코드
		int user [] = new int [6];
		Scanner scan =  new Scanner(System.in);
		System.out.println("1에서 45 사이의 정수 6개를 입력하세요.");
		for (int i=0; i<user.length; i++) {
			user[i] = scan.nextInt();
		}
		
//		로또번호와 사용자번호를 이용해 등수 출력하는 코드를 작성하시오.
//		1등 : 6개
//		2등 : 5개 + 보너스번호(6번지)
//		3등 : 5개
//		4등 : 4개
//		5등 : 5개
//		꽝 : 그 외
		
		//로또번호 랜덤 생성
		
		
		
		scan.close();
	}

}
