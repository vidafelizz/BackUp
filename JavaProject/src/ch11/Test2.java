package ch11;

public class Test2 extends Test {

	@Override
	public void print() { // 완성메소드로 간주
		// 구현부, body
		System.out.println("추상클래스를 상속받아 구현함");
	}
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
	}
}

//추상메소드가 하나라도 있으면 해당 클래스는 반드시 abstract class로 만들어야한다.
abstract class Test {	
	public void input() {
		System.out.println("input메소드");
	}
	public abstract void print();	// 추상메소드
}
