package ch12;

// 지역내부클래스(메서드 안에 생성되는 클래스)
public class LocalOuter {
	private int data = 30;
	
	void display() {
		class LocalInner {
			void msg() {
				System.out.println(data);
			}
		}
		LocalInner li = new LocalInner(); // 내부객체 생성
		// 지역내부클래스는 반드시 해당 메서드 안에서 객체 생성을 해야한다.
		li.msg();
	} // end method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}
}
