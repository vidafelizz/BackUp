package ch06;

public class CallEx {
	
	public static void test(int b) { // b=10
		System.out.println("test method 호출");
		System.out.println(b);
	}
	
	public static void main(String[] args) { // 항상 메인메소드가 먼저 실행됨
		System.out.println("시작");
		int a = 10;
		test(a); //a는 call by value형식으로 호출
		
		test2(a);
		System.out.println("끝");
	}
	public static void test2(int a) { // a=10
		System.out.println(a);
	}

}
