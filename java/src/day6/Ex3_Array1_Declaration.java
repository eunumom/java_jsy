package day6;

public class Ex3_Array1_Declaration {
	
	public static void main(String[] args) {
		
		int [] arr1 ;
		int [] arr2 = null;
		//5개짜리 정수 배열 선언과 동시에 초기화
		int [] arr = new int[5];
		int size = 5;
		//5개짜리 정수 배열 선언과 동시에 초기화
		int [] arr4 = new int[size];
		//5개짜리 정수 배열 선언과 동시에 초기화
		int arr5[] = new int[5];
		
		int arr6[], arr7; //arr6 : 배열  arr7 : 변수
		int []arr8, arr9; //arr8 : 배열  arr9 : 배열
		//이름 앞에 있는 게 , 뒤에도 붙음
		
		int []arr10 = {1,2,3};
		//arr10 = {4,5,6}; // {}를 이용한 방법은 초기화 이후 사용 불가
		// {}를 이용한 초기화는 배열 선언과 동시에 하는 경우만 가능
		int []arr11 = new int[] {1,2,3};
		arr11 = new int[] {1,2,3};
	}

}
