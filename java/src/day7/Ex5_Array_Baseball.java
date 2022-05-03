package day7;

import java.util.Scanner;

public class Ex5_Array_Baseball {

	public static void main(String[] args) {
		//정수 3개 배열 com 생성 후 랜덤으로 1~9사이 정수 만들어 배열에 저장하는 코드
		
		Scanner scan = new Scanner(System.in);
		
		int min=1, max=9;
		int com[]=new int[3];
		int user[] = new int[3];
		
		int count=0;
		
		for( ; count<3; ) {
			int r=(int)(Math.random()*(max-min+1)+min);
			//랜덤한 수와 배열값들을 비교해 중복이 안되면 저장함
			int i=0;
			for(; i<count; i++) {
				if(r==com[i]) {
					break;
				}
			}
			if(i ==count) {//중복된 수가 없다는 의미
				com[count]=r;
				System.out.print(com[count]+" ");
				count++;
			}
		}
		
		//com[0]!=com[1] && com[0]!=com[2] && com[1]!=com[2];
		
		System.out.println();
			
		// 사용자가 정수 3개 입력해 3S가 될 때까지 게임 진행하도록 코드 작성
		// 단 사용자가 입력한 정수도 배열에 저장	
		
		int s, b;
		do {
			s = 0;
			b = 0;
			
			System.out.print("1~9사이의 세 정수를 중복되지 않게 입력하세요(예 1 2 3) : ");
			for(int i=0; i<user.length; i++) {
				user[i] = scan.nextInt();
			}
			
			for(int i=0; i<com.length; i++) {
				if(com[i]==user[i]) {
					s++;
				}
			}
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(i==j) {
						continue;
					}
					if(com[i]==user[j]) {
						b++;
					}
				}
			}
			s=0;
			b=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i]==user[j]) {
						if(i==j) { //같은 자리면 S
							s++;
						}else { //다른 자리면 b
							b++;
						}
					}
				}
			}
			
			if (s!=0) {
				System.out.println(s+"S");
				}
				if (b!=0) {
				System.out.println(b+"B");
				}
				if (s==0 && b==0) {
				System.out.println("O");
				}		
		}while(s<3);
			
		scan.close();
	}

}
