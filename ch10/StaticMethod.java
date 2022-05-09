package ch10;

public class StaticMethod {
	static int a = 10;	 // static 멤버
	int b = 20;	 // non-static 멤버
	
	public static void printA() { // static멤버메소드
		System.out.println(a);
//		System.out.println(b);	// static멤버베소드 안에서는 non-static 멤버변수를 쓸 수 없다.
		StaticMethod s = new StaticMethod();
		System.out.println(s.b);
	}
	
	public void printB() {	// non-static 멤버메소드는 static도 사용가능
		System.out.println(a); // static
		System.out.println(b); // non-static
	}
	
	public static void main(String[] args) {
		printA();
//		printB(); // static멤버 안에는 non-static멤버를 그냥 쓸 수 없다.
		StaticMethod a = new StaticMethod();
		a.printB(); // non-static멤버는 반드시 new를 통해 객체화한 후 사용가능
		
	}

}
