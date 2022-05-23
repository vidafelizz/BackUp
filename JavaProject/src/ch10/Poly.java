package ch10;

class K { // 부모클래스
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class V extends K { // 자식클래스
	int a = 20;
	@Override
	public void print() { // 오버라이딩 메소드
		System.out.println(a);
	}
}

public class Poly {
	public static void main(String[] args) {
		V a = new V();
		a.print();
		K b = new K();
		b.print();
		
		K c = new V(); // 좌:부, 우:자 => 다형성
		c.print();
		
		// 다형성을 쓸 때 실제 참조변수가 가리키느 객체가 내가 사용하고자 하는 객체가 맞는지를 검사할 때
		// instanceof 연산자를 사용하여 확인해볼 수 있다.
		System.out.println("c instanceof V? : " + (c instanceof V) );
		
	}

}
