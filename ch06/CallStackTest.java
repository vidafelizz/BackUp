package ch06;

public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // 호출한 쪽으로 다시 되돌아옴
	}

	public static void firstMethod() {
		secondMethod();
		
	}

	public static void secondMethod() {
		System.out.println("secondMethod()");
		
	}
	

}
