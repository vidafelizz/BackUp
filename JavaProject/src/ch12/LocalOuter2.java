package ch12;

public class LocalOuter2 {
	private int data = 20;
	void display() {
//		int value = 50;		// 메서드 안에서 쓰인거라 지역변수. 지역변수를 inner class아래 위치하면 에러(과거버전)
		class LocalInner2 { // 메서드 안에 있는 지역내부클래스
			void msg() {
				int value = 50;
				System.out.println(value);
			}
		} // inner class
		LocalInner2 li = new LocalInner2();
		li.msg();
	} // end display()
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
	}
}
