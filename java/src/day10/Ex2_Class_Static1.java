package day10;

public class Ex2_Class_Static1 {

	public static void main(String[] args) {

	}

}

class Point{
	static String dimensional = "이차원";
	int x, y;
	
	public void print() {
		System.out.println("차원: " + dimensional);
		System.out.println("좌표: "+ x + ",");
	}
	
}
