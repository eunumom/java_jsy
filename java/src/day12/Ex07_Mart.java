package day12;

import java.util.Scanner;

public class Ex07_Mart {
// 음료수/박스과자 관리 마트 (종류는 최대 30개 = 음료+박스과자)
// 1. 제품등록(신규제품)
// 2. 제품입고
// 3. 제품선택
// 4. 제품구매
// 5. 프로그램 종료
	public static void main(String[] args) {
		//제품관리를 위한 배열 (판매 제품 목록)
		Product list[] = new Product[30];
		//저장된 판매제품 개수
		int listCount =0;
		int menu;
		int subMenu, price, amount, capacity, count;
		String name;
		
		Scanner scan = new Scanner(System.in);
		do {
			menu = selectMenu(scan);
			switch(menu) { 
			case 1:
				// 제품종류구분, 제품명, 가격, 수량 입력
				// 박스과자면 1박스 당 개수, 음료수면 용량 입력
				// 입력받은 정보를 객체화 한 뒤 판매 목록에 추가
				subMenu = selectSubMenu(scan);
				
				switch(subMenu) {
				case 1: case 2:
					list[listCount] =createProduct(subMenu, scan);
					listCount++;
					break;
				default :
					System.out.println("선택할 수 없는 종류입니다.");
				}
				break;
			case 2:
				printProductList(list, listCount);
				if(addAmountProductList(scan,list,listCount)) {
					System.out.println("입고가 완료되었습니다.");
				}else {
					System.out.println("입고에 실패했습니다.");
				}
				break;
			case 3:
				printProductList(list, listCount);
				
				break;
			case 4:
				break;
			case 5:
				break;
			default:
			}
			
		}while(menu != 5);
		scan.close();
	}
	/* 기능: 메뉴를 출력하고 메뉴를 Scanner로 입력받아 입력한 메뉴를 알려주는 메소드
	 * 매개변수: Scanner scan
	 * 리턴타입: int
	 * 메소드명: selectMenu
	 * */
	public static int selectMenu(Scanner scan) {
		System.out.println("메뉴");
		System.out.println("1.제품 등록");
		System.out.println("2.제품 입고");
		System.out.println("3.제품 선택");
		System.out.println("4.제품 구매");
		System.out.println("5.프로그램 종료");
		System.out.print("메뉴를 선택하세요: ");
		int menu = scan.nextInt();
		System.out.println("===============");
		return menu;
		
	}
	/* 기능: 제품등록 서브메뉴 출력 후 Scanner로 서브메뉴 입력 후 출력
	 * 매개변수: Scanner scan
	 * 리턴타입: int
	 * 메소드명: selectSubMenu
	 * */
	public static int selectSubMenu(Scanner scan) {
		System.out.println("1.음료수 등록");
		System.out.println("2.박스과자 등록");
		System.out.println("제품 종류 선택: ");
		int subMenu = scan.nextInt();
		return subMenu;
		
	}
	/* 기능: 선택한 subMenu에 맞는 제품 정보를 Scanner로 입력해 제품 객체 생성 후 출력
	 * 매개변수: int subMenu, Scanner scan
	 * 리턴타입: Product //중요!
	 * 메소드명: createProduct
	 * */
	public static Product createProduct(int subMenu, Scanner scan) {
		System.out.println("제품명: ");
		String name = scan.next();
		System.out.println("가격: ");
		int price = scan.nextInt();
		System.out.println("수량: ");
		int amount = scan.nextInt();
		
		switch(subMenu) {
		
		case 1:
			System.out.print("음료수 용량: ");
			int capacity = scan.nextInt();
			return new Drink(name, price, amount, capacity);
		case 2:
			System.out.print("박스당 개수: ");
			int count = scan.nextInt();
			return new SnackBox(name, price, amount, count);
		default:
			return null;
		}
	}
	/* 기능: 제품목록 출력
	 * 매개변수: Product productList[], int listCount
	 * 리턴타입: void
	 * 메소드명: printProductList
	 * */
	public static void printProductList(Product productList[], int listCount) {
		if(productList == null || listCount == 0) {
			System.out.println("등록된 제품이 없습니다.");
			return;
		}
		for(int i=0; i<listCount; i++) {
			System.out.println(i+1+"."); //선택 용이를 위해 번호 붙임
			productList[i].print();
		}
	}
	/* 기능: Scanner를 이용해 제품 목록에서 제품과 수량을 입력해 수량을 추가하는 메소드
	 * 매개변수: Scanner scan, Product List[], int listCount
	 * 리턴타입: boolean
	 * 메소드명: addAmountProductList
	 * */
	public static boolean addAmountProductList(Scanner scan, Product list[], int listCount) {
		if(list == null || listCount == 0) {
			return false;
		}
		System.out.println("입고할 제품을 선택하세요: ");
		int num = scan.nextInt();
		System.out.println("입고할 제품의 수량을 입력하세요: ");
		//입고된 수량
		int amount = scan.nextInt();
		// 제품선택을 잘못했거나 수량을 잘못 선택한 경우
		if(num > listCount || amount <=0) {
			return false;
		}
		//해당 제품의 수량 변경
		int preAmount = list[num-1].getAmount();
		list[num].setAmount(preAmount + amount);
		return true;
		
	}

}
