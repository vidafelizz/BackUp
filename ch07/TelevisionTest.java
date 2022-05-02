package ch07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television(); // Television.java의 객체생성(메모리에 생성)
		tv.channel = 7; // tv. => 인스턴스화된 Television 메모리의 주소값으로 접근
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("TV의 채널은 " + tv.channel +"이고 볼륨은 " + tv.volume + "입니다.");
		
		
	}

}
