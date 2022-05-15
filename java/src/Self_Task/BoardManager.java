package Self_Task;

import java.util.Scanner;

public class BoardManager implements BoardConsole{
	public static final int MAX = 10;
	
	private Text textL[] = new Text[MAX];
	private int count;
	
	private Scanner scan;
	
	public BoardManager(Scanner scan) {
		this.scan = scan;
	}

	@Override
	public int selectMenu(Scanner scan) {
		System.out.println("***** 메 뉴 *****");
		System.out.println("1 게시글 등록");
		System.out.println("2 게시글 확인");
		System.out.println("3 게시글 수정");
		System.out.println("4 프로그램 종료");
		System.out.print("메뉴 선택: ");
		int menu = scan.nextInt();
		System.out.println("=================");
		return menu;
	}

	@Override
	public void excute(int menu) {
		switch(menu) {
		case 1:
			writeText();
			break;
		case 2:
			readText();
			break;
		case 3:
			modifyText();
			break;
		case 4:
			break;
		default: 
			System.out.println("잘못된 메뉴입니다.");
			
		}
	}

	@Override
	public void run() {
		int menu = 0;
		do {
			menu = selectMenu(scan);
			excute(menu);
		}while(menu != 4);
		System.out.println("프로그램을 종료했습니다.");
	}

	public boolean writeText() {
		 System.out.print("날짜를 입력하세요(예 22-05-15): ");
		 String date = scan.next();
		 System.out.print("게시글 말머리를 선택하세요(공지(true)/일반(false)): ");
		 boolean type = scan.nextBoolean();
		 System.out.print("게시글 제목을 입력하세요: ");
		 String title = scan.next();
		 System.out.println("게시글 내용을 입력하세요: ");
		 String content = scan.next();
		 Text text = new Text(type, date, title, content);
		 if(count == MAX) {
			 return false;
		 }
		 textL[count++] = text;
		 return true;
	}
	public void readText() {
		for(int i=0; i<count; i++) {
			System.out.println(i+1+". "+textL[i]);
		}
		return;
	}
	
	public boolean modifyText() {
		readText();
		System.out.print("수정할 글 번호: ");
		int modIndex = scan.nextInt();
		Text modi = textL[modIndex-1];
		if(modi != null) {
			System.out.println(modIndex+". "+modi);
		}else {
			return false;
		}
		System.out.print("선택한 게시글을 수정하시겠습니까?(true/false): ");
		boolean ok = scan.nextBoolean();
		if(!ok) {
			return false;
		}
		System.out.print("날짜를 입력하세요(예 22-05-15): ");
		String date = scan.next();
		System.out.print("게시글 말머리를 선택하세요(공지(true)/일반(false)): ");
		boolean type = scan.nextBoolean();
		System.out.print("게시글 제목을 입력하세요: ");
		String title = scan.next();
		System.out.println("게시글 내용을 입력하세요: ");
		String content = scan.next();
		Text text = new Text(type, date, title, content);
		textL[modIndex-1] = text;
		return true;
	}
}
