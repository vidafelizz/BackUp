package ch12;

public class TestOuter {
	private int data = 30;
	class Inner { // 내부 클래스는 외부클래스의 멤버를 자유롭게 사용 가능
		void msg() {
			System.out.println("data is " + data);
		}
	}
	public static void main(String[] args) {
		TestOuter obj = new TestOuter(); // 외부클래스 객체 생성
		TestOuter.Inner in = obj.new Inner(); // 내부클래스 객체 생성
		in.msg();
	}
}
