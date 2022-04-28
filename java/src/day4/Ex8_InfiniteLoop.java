package day4;

public class Ex8_InfiniteLoop {

	public static void main(String[] args) {

		for(int i=1; i>0; i++) { //(무한루프는 아님)
			//System.out.println(i); : 1부터 int 최대 정수까지 반복 
		}
		System.out.println("안녕하세요.");// 무한루프인 경우 반복문 아래 코드 에러 발생
	}

}
