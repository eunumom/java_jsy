package day12;

public class Ex06_Abstract {

	public static void main(String[] args) {
//		추상클래스를 이용해 객체를 만들 수 없음
//		Ex06_Animal animal = new Ex06_Animal();
		Ex06_Dog dog = new Ex06_Dog();
		dog.bark();
//		상속한 자식클래스를 이용해서 만들 수 있음
		Ex06_Animal animal = new Ex06_Dog();
		animal.bark();
	}

}
// 추상클래스는 추상메소드와 일반메소드 모두 존재할 수 있음
// 추상 메소드에는 필드가 있을 수 있음
abstract class Ex06_Animal{
	public String type;
	public abstract void bark();
	public void print() {
		System.out.println("동물입니다.");
	}
}
// 추상클래스를 상속받은 일반클래스는 반드시 추상메소드를 오버라이딩해야함
class Ex06_Dog extends Ex06_Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
		
	}
	
}
