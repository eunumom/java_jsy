package day12;

public abstract class Product {
	
	// 제품명
	private String name;
	// 가격
	private int pirce;
	// 재고
	private int amount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	
	//수량이 주어지면 기존 수량에 누적하는 메소드
	public void sumAmount(int amount) {
		this.amount += amount;
	}
	
	public Product(String name) {
		this(name, 0, 0);
	}
	public Product(String name, int price, int amount) {
		this.name =name;
		this.pirce =price;
		this.amount = amount;
	}
	public abstract void print();
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
