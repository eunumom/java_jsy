package day9;

import java.util.Scanner;

public class Ex2_Method2_Lotto {

	public static void main(String[] args) {
		/* 앞 예제에서 사용한 메소드들을 필요하면 복사붙여넣기 해서 로또 프로그램 작성하기
		 * 필요한 기능은 메소드로 추가 가능
		 */
		
		// 겹치지 않는 숫자 7개 생성하기
		int com[] = new int [7];

		//저장된 개수가 7개가 될때까지 : count가 7보다 작으면 동작)
		for(int count = 0; count < 7; ) {
			//1~45사이의 랜덤한 수 생성
			int r = (int)(Math.random() * (45) + 1);

			//배열에 count개만큼 랜덤한 수와 비교하여 있는지 없는지 확인해서 없으면 배열 count번지에 랜덤한 수 저장하고, 
			//count를 1증가
			if(!contains(com, count, r)) {
				com[count] = r;
				count++;
			}
		}
		printArray(com);
		
		// 6개 번호 입력하기
				int user[] = new int[6];
				Scanner scan = new Scanner(System.in);
				System.out.print("로또 번호 입력 : ");
					for(int i = 0; i<user.length; i++) {
						user[i] = scan.nextInt();
					}
					//일치하는 숫자 개수 확인 후 등수판별
					switch(getScore(com, user)) {

					case 6:
						System.out.println("1등");
						break;
					case 5:
						int k;
						for(k=0; k<user.length; k++) {
							if(user[k] == com[6]) {
								break;
							}
						}
						if(k == user.length) {
							System.out.println("3등");
						}else {
							System.out.println("2등");
						}
						break;
					case 4:
						System.out.println("4등");
						break;
					case 3:
						System.out.println("5등");
						break;
					default:
						System.out.println("꽝");
					}
		scan.close();
		
	}
	
	
	/* 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열 => int num[]
	 * 리턴타입 : 없음 => void 
	 * 메소드명 : printArray
	 * */
	public static void printArray(int num[]) {
		if(num == null || num.length == 0) {
			System.out.println("출력할 배열이 없습니다.");
			return ;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean contains(int arr[], int n, int num) {
		//배열이 잘못되거나 비교 갯수가 잘못되서 비교할 필요가 없는 경우
		if(arr==null || arr.length == 0 || n <= 0) {
			return false;
		}
		if(arr.length < n) {
			n = arr.length;
		}
		for(int i = 0; i<n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	
	public static int getScore(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int score = 0;
		for(int tmp : arr1) {
			if(contains(arr2, arr2.length, tmp)) {
				score++;
			}
		}
		return score;
	}
	
}
