package day12;

public class Tire {
	private int state; // 타이어 마모정도
	private int pressure; // 타이어 공기압
	private String position;
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPressure() {
		return pressure;
	}
	public void setPressure(int pressure) {
		this.pressure = pressure;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Tire(int state, int pressure, String position) {
		super();
		this.state = state;
		this.pressure = pressure;
		this.position = position;
	}
	public Tire() {
		this(100, 0, null);
	}
}
