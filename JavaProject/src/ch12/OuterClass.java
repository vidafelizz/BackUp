package ch12;

public class OuterClass {
	// OuterClass의 static멤버변수
	private static int x=10;
	
	class Inner {
		int getX() {
			return x; // outer 클래스의 private변수도 쓸 수 있다.
		}
	}
	public static void main(String[] args) {
		System.out.println(x);
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getX());
	}
}
