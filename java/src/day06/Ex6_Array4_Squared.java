package day06;

public class Ex6_Array4_Squared {

	public static void main(String[] args) {
//		배열에 1의 제곱부터 10의 제곱까지 저장하고 출력하는 코드
		int []arr = new int[11];
		for(int i=1; i<arr.length; i++) {
			arr[i]=i*i;
			System.out.print(arr[i]+" ");
		}	
		System.out.println();
		
//		10개짜리 배열 사용
			int arr1[]=new int[10];
		for(int j=0; j<arr1.length; j++) {
			arr1[j]=(j+1)*(j+1);
			System.out.print(arr[j]+" ");
		}

	}

}
