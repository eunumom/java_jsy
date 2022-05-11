package day12;

public class Ex03_OverRide1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.bark();
		Dog d = new Dog();
		d.bark();
		Cat c = new Cat();
		c.bark();
	}

}
class Animal{
	public void bark() {
		System.out.println("짖다");
	}
}
class Dog extends Animal{
	public void bark() {
		// super.메소드()는 첫번째가 아니어도 됨
		super.bark();
		System.out.println("멍멍");
	}
}
class Cat extends Animal{
	public void bark() {
		System.out.println("야옹");
	}
	
}
