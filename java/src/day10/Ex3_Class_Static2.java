package day10;

public class Ex3_Class_Static2 {

	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		//t1.printX;
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		Test1.printCount();
		
	}
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
}

class Test1{
	int x;
	static int count; //Test1 클래스로 만들어진 객체의 수
	
	void printX() {
		System.out.println(x);
	}
	
	static void printCount() {
		System.out.println(count);
	}
	
	public Test1() {count++;}
}
