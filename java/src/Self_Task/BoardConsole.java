package Self_Task;

import java.util.Scanner;

public interface BoardConsole {
		//메뉴출력 후 선택하는 기능
		int selectMenu(Scanner scan);
		
		//선택한 기능에 맞게 동작
		void excute(int menu);
		
		//프로그램 실행
		void run();
}
