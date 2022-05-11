package day12;

public class Ex01_Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.x =10;
		c.y =20;
		//c.z =30; 에러발생
		c.setZ(30);
		
	}

}

class Parent{
	public int x;
	protected int y;
	private int z;
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public Parent(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
}
class Child extends Parent{
	private int s;
	public void print() {
		System.out.println(x);
		System.out.println(y);
		// z에 직접적으로 접근 불가 getter를 이용해 접근
		System.out.println(getZ());
		System.out.println(s);
	}
	public Child() {
		this(0,0,0,0);
//		super(0,0,0); // this()와 super()는 같이 쓸 수 없음 this()에서 부모생성자 이미 호출

	}
	public Child(int x, int y, int z, int s) {
		super(x,y,z);
		this.s =s;
	}
}
