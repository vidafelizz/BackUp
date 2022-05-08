package ch10;

public class PolyEx {
	public static void main(String[] args) {
//		int a = 10;
//		double b = 20;
//		char c = 'A';
//		String d = "hello";
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		// 최상위클래스, 그대로 사용하면 무거워지며 속도저하
		// Object는 타입 하나로 모든 타입을 다 다룰 수 있다.
		// 즉, 한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성이라고 한다.
		Object a = 10;
		System.out.println(a);
		
	}
}
