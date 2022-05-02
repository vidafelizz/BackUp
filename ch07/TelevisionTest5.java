package ch07;

public class TelevisionTest5 {
	public static void main(String[] args) {
		Television myTv = new Television(); // 객체생성
		myTv.setChannel(11); // setter를 통해 값을 초기화(저장)
		int ch = myTv.getChannel(); // getter를 통해 값을 불러옴 ch = 11
		System.out.println("현재 채널은 " + ch + "입니다.");
	}

}
