package day12;

public class Ex04_Final {

	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
		ft.print();
	}

}
//class KoreanString extends String{} // String은 final클래스라 상속 불가

class FinalTest{
	private final int max =30;
	public final void print() {
//		max =20; //수정 불가 final변수
		System.out.println(max);
	}
}
class FinalTestChild extends FinalTest{
//	public final void print() {		// Overriding 할 수 없음 print()에 final이 있음
//	}
}


