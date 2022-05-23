package homework;

public class RadioTest {
	public static void main(String[] args) {
		Radio myRd = new Radio();
		
		myRd.model = "[브리츠 라디오]";
		myRd.channel = 89.1;
		myRd.volume = 12;
		myRd.onOff = true;
		
		System.out.println(myRd.model);
		System.out.println(myRd.onOffSign());
		System.out.println("현재 채널은 " + myRd.channel + "입니다.");
		System.out.println("현재 볼륨은 " + myRd.volume + "입니다.");
		
		System.out.println();
		
		
		Radio yourRd = new Radio();
		yourRd.model = "[아이리버 라디오]";
		yourRd.channel = 95.1;
		yourRd.volume = 9;
		yourRd.onOff = false;
		
		System.out.println(yourRd.model);
		System.out.println(yourRd.onOffSign());
		System.out.println("현재 채널은 " + yourRd.channel + "입니다.");
		System.out.println("현재 볼륨은 " + yourRd.volume + "입니다.");
		
	}

}
