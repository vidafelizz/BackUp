package ch07;

public class BoxTest {
	public static void main(String[] args) {
		
		// 우리가 만든 클래스는 (객체형)데이터타입이 될 수 있다.
		Box b; // 선언
		b = new Box(); // 객체 생성(메모리에 생성)
		b.width = 20;
		b.length = 20;
		b.height = 30;
		
		System.out.println("상자의 가로, 세로, 높이는 " 
		+ b.width + ", "+ b.length + ", " + b.height + "입니다.");
		
	}

}
