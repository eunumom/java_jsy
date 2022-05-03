package day7;

import java.util.Scanner;

public class Ex2_Array2_Duplicated {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = {1,2,3};
		//정수 num을 입력받고 그 정수가 배열에 있는지 없는지 확인하는 코드
		
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		int i, count =0;
		
		//방법1
		if(arr[0]==num) {
			count++;
		}
		if(arr[1]==num) {
			count++;
		}
		if(arr[2]==num) {
			count++;
		}
		
		if(count>=1) {
			System.out.println(num+"은 배열에 있습니다.");
		}else {
			System.out.println(num+"은 배열에 없습니다.");
		}
		
		
		//방법2 배열 전체 탐색
		for(i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println(num+"은 배열에 있습니다.");
		}else {
			System.out.println(num+"은 배열에 없습니다.");
		}
		
		
		//방법3 첫번째 중복 숫자가 나오면 확인 중단
		for(i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				break;
			}
		}
		if(i<arr.length) { //break를 만나면 i가 3보다 작음을 이용
			System.out.println(num+"은 배열에 있습니다.");
		}else {
			System.out.println(num+"은 배열에 없습니다.");
		}
		
		//별도 설명 : 배열 출력시 주소 출력(참조변수이기 때문)
		System.out.println(arr);
		
		scan.close();
	}

}
