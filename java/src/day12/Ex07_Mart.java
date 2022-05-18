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
		//장바구니 생성, 종류 max=30
		Product basket[] = new Product [30];
		int basketCount = 0;
		
		
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
				/* 상품 선택
				 * 수량 입력
				 * 장바구니에 담기
				 * 제고에서 수량만큼 빼기
				 * 현재 장바구니에 담긴 목록 출력
				 * */
				Product selectProduct = selectProduct(scan, list, listCount);
				if(selectProduct !=null) {
					basket[basketCount] = selectProduct;
					basketCount++;
					printProductList(basket, basketCount);
				}else {
					System.out.println("선택된 제품이 없습니다.");
				}
				break;
			case 4:
				/* 장바구니 목록과 총 금액 출력
				 * 결제 금액 입력
				 * 결제 진행
				 *   금액이 부족하면 결제 취소?
				 *     취소하면 장바구니 비우기
				 *     취소하지 않으면 장바구니 보관
				 *   정상결제 후
				 *     거스름돈 출력 후 장바구니 비움
				 * */
				printProductList(basket, basketCount);
				//합계 출력
				int sum = sumProductList(basket,basketCount);
				//장바구니에 있는 제품을 하나씩 확인하며 가격*수량 누적
				
				System.out.println("금액을 입력하세요: ");
				int buyPrice = scan.nextInt();
				//결제 진행
				//금액 부족시 취소 여부 확인
				if(sum >buyPrice) {
					System.out.println("결제를 취소하시겠습니까?(취소시 장바구니 비워짐 y or n) ");
					char cancel = scan.next().charAt(0);
					if(cancel == 'Y' || cancel == 'y') {
						//장바구니 물량을 제고량에 돌려줘야 함
						returnProductList(list, listCount, basket, basketCount);
						//장바구니 비우기
						basketCount =0;
					}
				}else {
					//거스름돈 출력
					System.out.println("거스름돈: "+(buyPrice - sum)+"원");
					//장바구니 비움
					basketCount =0;
				}
				
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
		System.out.println("1.제품 등록(관리자)");
		System.out.println("2.제품 입고(관리자)");
		System.out.println("3.제품 선택(고객)");
		System.out.println("4.제품 구매(고객)");
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
		System.out.print("제품 종류 선택: ");
		int subMenu = scan.nextInt();
		return subMenu;
		
	}
	/* 기능: 선택한 subMenu에 맞는 제품 정보를 Scanner로 입력해 제품 객체 생성 후 출력
	 * 매개변수: int subMenu, Scanner scan
	 * 리턴타입: Product //중요!
	 * 메소드명: createProduct
	 * */
	public static Product createProduct(int subMenu, Scanner scan) {
		System.out.print("제품명: ");
		String name = scan.next();
		System.out.print("가격: ");
		int price = scan.nextInt();
		System.out.print("수량: ");
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
			System.out.print(i+1+"."); //선택 용이를 위해 번호 붙임
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
		list[num-1].sumAmount(amount);
		return true;
		
	}
	/* 가능: 스캐너를 이용해 제품과 수량을 선택하면 제품리스트에서 해당 제품을 꺼내 줌
	 * 매개변수: Scanner scan, Product list[], int listCount
	 * 리턴타입: Product
	 * 메소드명: selectProduct
	 * */
	public static Product selectProduct(Scanner scan, Product list[], int listCount) {
		System.out.print("구매할 제품을 선택하세요: ");
		int num = scan.nextInt();
		if(num <listCount) {
			return null;
		}
		System.out.println("구매할 제품의 수량을 입력하세요: ");
		int amount = scan.nextInt();
		
		Product buyProduct = list[num-1] ;
		Product selectProduct = null;
		//제품 선택 후 장바구니에 담기
		if(buyProduct instanceof SnackBox) {
			selectProduct = new SnackBox((SnackBox)buyProduct);
		}else if(buyProduct instanceof Drink) {
			selectProduct = new Drink((Drink)buyProduct);
		}else {
			return null;
		}
		//제고보다 많은 수량을 입력한 경우
		if(buyProduct.getAmount() < amount) {
			//수량을 제고량으로 수정
			amount = buyProduct.getAmount();
		}
		
		selectProduct.setAmount(amount);
		buyProduct.sumAmount(-amount);
		return selectProduct;
	}
	/* 기능: 제품 리스트가 주어지면 해당 제품 리스트의 합계를 구해 알려주는 메소드
	 * 매개변수: Product list[], int listCount
	 * 리턴타입: int
	 * 메소드명: sumProductList
	 * */
	public static int sumProductList(Product list[], int listCount) {
		int sum =0;
		for(int i =0; i <listCount; i++) {
			sum += list[i].getPirce()*list[i].getAmount();
		}
		return sum;
		
	}
	/* 기능: 장바구니에 담은 제품들을 마켓에 돌려주는 메소드
	 * 매개변수: Product list[], int listCount, Product basket[], int basketCount
	 * 리턴타입: void
	 * 메소드명: returnProductList
	 * */
	
	public static void returnProductList(Product list[], int listCount, Product basket[], int basketCount) {
		if(list == null || basket ==null) {
			return;
		}
		for(int i =0; i <listCount; i++) {
			for(int j =0; j <basketCount; j++) {
				if(list[i].getName().equals(basket[j].getName())) {
					list[i].sumAmount(list[j].getAmount());
				}
			}
		}
	}

}
