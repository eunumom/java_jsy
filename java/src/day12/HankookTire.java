package day12;

public class HankookTire extends Tire {
	public final static String COMPANY ="한국";
	public HankookTire(int state, int pressure, String position) {
		super(state, pressure, position);
	}
	public HankookTire() {
		//super(); //생략됨
	}

}

