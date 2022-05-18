package day08;

public class Ex00_Test {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int num=3;
		int n=3;
		System.out.println(contains(arr,num,n));

	}
	public static boolean contains(int arr [], int num, int n) {
		if(arr==null || arr.length==0) {
			return false;
		}
		int count = 0;
		for(int i= 0; i<n; i++) {
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
