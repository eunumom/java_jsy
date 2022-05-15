package Self_Task;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		BoardManager boardManager = new BoardManager(scan);
		boardManager.run();
		scan.close();
	}

}
