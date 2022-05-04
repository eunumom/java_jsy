package day8;

public class Ex5_Class1 {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.print();
		p1.x1=20;
//		p1.x2=20; //에러 발생 : 접근제한자가 private이기 때문
	}

}
/* class 앞에 public은 class 이름과 file 이름이 같은 경우에만 붙일 수 있음 
 * 좌표평면(2차원)에서 두 점을 나타내는 클래스 : Point */

	//멤버변수
	
	//메소드
class Point{
	//멤버변수는 초기화하지 않아도 각 타입의 기본값으로 자동 초기화 됨
	int x, y;
	public int x1, y1;
	private int x2, y2;
	/* 매개변수 : 없음
	 * 리턴타입 : 없음 = void
	 * 메소드명 : print*/
	public void print () {
		System.out.println(x+", "+y);
	}
}
