package day10;

import java.util.Scanner;

public class Ex4_Class_Point {

	public static void main(String[] args) {
		/* 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴선택: 1
		 * 좌표를 입력하세요 (예: 1 2 3) : 
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴선택: 2
		 * (1,2,3)
		 * 메뉴
		 * 1. 좌표설정
		 * 2. 좌표출력
		 * 3. 종료
		 * 메뉴선택: 3
		 * 프로그램 종료 */
		
		Scanner scan = new Scanner(System.in);
		int num=0;
		// Point3D1 p = new Point3D1(0,0,0);
		int x=0, y=0, z=0;
		
		while (num!=3) {
			System.out.println("메뉴");
			System.out.println("1.좌표설정");
			System.out.println("2.좌표출력");
			System.out.println("3.종료");
			System.out.print("메뉴선택: ");
			num = scan.nextInt();
			Point3D1 p = new Point3D1(x,y,z);
			
			switch (num) {
				case 1:
					System.out.print("좌표를 입력하세요 (예: 1 2 3) :");
					x = scan.nextInt();
					y = scan.nextInt();
					z = scan.nextInt();
					// p = new Point3D1(x,y,z);
					 break;
				case 2:
					p.print();
					break;
				case 3:
					System.out.println("프로그램 종료");
					break;
				default:
					System.out.println("잘못된 메뉴입니다.");
			}
		}
		scan.close();
	}

}

/* 다음 정보를 가지는 3차원에서 점을 나타내는 클래스를 생성하시오. 
 * 정보: 점 x, 점 y, 점 z
 * 기능: 좌표를 출력하는 기능
 *  */
class Point3D1{
	int x;
	int y;
	int z;
	
	public void print() {
		System.out.println("좌표: "+x+","+y+","+z);
	}

	public Point3D1(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
}
	
 