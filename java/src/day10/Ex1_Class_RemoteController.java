package day10;

import java.util.Scanner;

public class Ex1_Class_RemoteController {

	public static void main(String[] args) {
		/* 메뉴를 출력 후 메뉴에 맞는 기능을 동작하도록 코드 작성
		 * 메뉴
		 * 1. 채녈 up
		 * 2. 채녈 down
		 * 3. 채널 변경
		 * 4. 볼륨 up
		 * 5. 볼륨 down
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요: 6
		 * 메뉴
		 * 1. 채녈 up
		 * 2. 채녈 down
		 * 3. 채널 변경
		 * 4. 볼륨 up
		 * 5. 볼륨 down
		 * 6. 전원
		 * 7. 종료
		 * 메뉴를 선택하세요: */
		Scanner scan = new Scanner(System.in);
		RemoteController rc = new RemoteController();
		
		int num = 0;
		
		while (num!=7) {
			System.out.println("메뉴");
			System.out.println("1. 채녈 up");
			System.out.println("2. 채녈 down");
			System.out.println("3. 채널 변경");
			System.out.println("4. 볼륨 up");
			System.out.println("5. 볼륨 down");
			System.out.println("6. 전원");
			System.out.println("7. 종료");
			System.out.print("메뉴를 선택하세요: ");
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				rc.channelUp(); break;
			case 2:
				rc.channelDown(); break;
			case 3:
				System.out.print("채널을 입력하세요: ");
				int num1 = scan.nextInt();
				rc.channel(num1); break;
			case 4:
				rc.volumeUp(); break;
			case 5:
				rc.volumeDown(); break;
			case 6:
				rc.turn(); break;
			case 7:
				System.out.println("종료"); break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
		scan.close();
	}

}
/* TV리모컨 클래스를 생성하고 객체를 생성한 후 기능들을 테스트해보시오.
 * */
class RemoteController{
	// 전원, 채널, 볼륨
	boolean power;
	int channel;
	int volume;
	int minVolume = 0;
	int maxVolume = 32;
	int minChannel = 1;
	int maxChannel = 99;
	
	/* 기능: tv를 켜는 메소드
	 * 매개변수: none
	 * 리턴타입: none
	 * 메소드명: turnOn */
	void turnOnOn() {
		power = true;
		System.out.println("TV를 켰습니다.");
	}
	
	/* 기능: tv를 끄는 메소드
	 * 매개변수: none
	 * 리턴타입: none
	 * 메소드명: turnOff */
	void turnOnOff() {
		power = false;
		System.out.println("TV를 껐습니다.");
	}
	
	/* 기능: TV를 켜거나 끄는 메소드
	 * 매개변수: none
	 * 리턴타입: none - void
	 * 메소드명: turn */
	void turn() {
		power =! power;
		if(power) {
			System.out.println("TV를 켰습니다.");
		}else {
			System.out.println("TV를 껐습니다.");
		}
	}
	
	/* 기능: 소리를 한칸 올리는 메소드
	 * 매개변수: none
	 * 리턴타입: none - void 단순히 필드의 값만 바꾸는 경우 리턴타입이 없음
	 * 메소드명: volumeUp
	 * */
	void volumeUp() {
		// 전원 on && 볼륨이 최대치가 아니면
		if(power) {
			if(volume<maxVolume) {
				volume++;
			}
			System.out.println("소리: "+"volume");
		}
	}
	
	/* 기능: 소리를 한칸 내리는 메소드
	 * 매개변수: none
	 * 리턴타입: none - void 단순히 필드의 값만 바꾸는 경우 리턴타입이 없음
	 * 메소드명: volumeUp
	 * */
	void volumeDown() {
		// 전원 on && 볼륨이 최대치가 아니면
		if(power) {
			if(volume>minVolume) {
				volume--;
			}
			System.out.println("소리: "+"volume");
		}
	}
	
/* 기능: 채널을 1씩 증가하는 메소드
	 * 매개변수: none
	 * 리턴타입: none
	 * 메소드명: channelUp */
	void channelUp() {
		if(power) {
			if(channel<maxChannel) {
				channel++;
			}
			System.out.println("채널: "+"channel");
		}
	}
	
	/* 기능: 채널을 1씩 감소하는 메소드
	 * 매개변수: none
	 * 리턴타입: none
	 * 메소드명: channelDown */
	void channelDown() {
		if(power) {
			if(channel>minChannel) {
				channel--;
			}
			System.out.println("채널: "+"channel");
		}
	}
	
	/* 기능: 입력한 채널로 이동하는 메소드
	 * 매개변수: 이동할 채널 - int ch
	 * 리턴타입: none - void
	 * 메소드명: channel */
	void channel(int ch) {
		if(power) {
			if(ch<minChannel) {
				channel = minChannel;
			}else if(ch>maxChannel) {
				channel = maxChannel;
			}else {
				channel = ch;
			}
			System.out.println("채널: "+channel);
		}
	}
	public RemoteController() {
		channel=minChannel;
		volume=minVolume;
	}
		

	public RemoteController(int ch, int vol) {
		if(ch>=minChannel && ch<=maxChannel) {
			channel=ch;
		}else {
			channel=minChannel;
		}
		if(vol>=minVolume && vol<=maxVolume) {
			volume=vol;
		}else {
			volume=minVolume;
		}
	}
	
}
