package day8;

public class Ex8_Method6_Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int num=2;
		printArray(arr);
		System.out.println(contains(arr,num));
		
		

	}
	/* 기능 : 정수형 배열이 주어졌을 때, 주어진 배열의 값을 콘솔에 출력하는 메소드
	 * 매개변수 : 정수형 배열 int [] arr
	 * 리턴타입 : 배열의 값 void
	 * 메소드명 : printArray
	 * */
	
	public static void printArray(int num[]) {
		if(num==null || num.length==0) {
			System.out.println("출력할 배열이 없습니다.");
			return;
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		
	}
	
	/* 기능 : 정수형 배열에 정수 num가 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열 int[] num, 정수 num
	 * 리턴타입 : 있는지 없는지 T/F boolean
	 * 매소드명 : contains
	 * */
	
	public static boolean contains(int [] arr, int num) {
		if(arr==null || arr.length==0) {
			return false;
		}
		int count = 0;
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		if(count==0) {
			return false;
		}else {
			return true;
		}
		
	}
	/* 기능 : 정수형 배열에서 처음부터 n개 중에서 정수 num이 있는지 없는지 알려주는 메소드
	 * 매개변수 : 정수형 배열, 정수 num, 정수 n = int arr [], int num, int n
	 * 리턴타입 : 있는지 없는지 = boolean
	 * 메소드명 : contains
	 * */
	
	public static boolean contains(int arr [], int num, int n) {
		if(arr==null || arr.length==0) {
			return false;
		}
		int count = 0;
		for(int i= 0; i<arr[n]; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		if(count==0) {
			return false;
		}else {
			return true;
		}
		
	}
	
}
