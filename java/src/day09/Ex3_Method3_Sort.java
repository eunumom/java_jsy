package day09;

import java.util.Scanner;

public class Ex3_Method3_Sort {

	public static void main(String[] args) {
		/* 5명 학생의 성적을 입력받아 오름차순으로 출력하는 코드 작성
		 * 단, 입력받은 성적은 배열에 저장해야 함
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("5명의 성적을 입력하세요 : ");
		int score[] = scoreArray(scan, 5);
		
		bubbleSort(score, true);
		
		printArray(score);
		
		scan.close();

	}
	
	public static int [] scoreArray (Scanner scan, int n) {
		if (n<=0) {
			return null;
		}
		int arr [] = new int [n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}
	
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
	
	/* 기능 : 정수 배열이 주어지면 오름차순 또는 내림차순으로 정렬하는 메소드
	 * 매개변수 : 정수 배열, 오름(Ascending)/내림 여부 => int score[], boolean asc
	 * 리턴타입 : 정수 배열 void
	 * 메소드명 : bubbleSort
	 * */
	public static void bubbleSort(int arr[], boolean asc) {
		if(arr==null) {
			return;
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				// 오름차순
				if (asc && arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				// 내림차순
				else if(!asc && arr[j]<arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}

}
