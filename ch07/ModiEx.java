package ch07;

// 접근 제어 지정자(Aceess Modifier)
// public : 모든 위치에서 참조 가능
// protected : 같은 패키지 또는 다른 패키지에서 접근시 상속관계가 있을 경우에 사용 가능
// default: 같은 패키지내에서만 사용 가능(실제 default라고 쓰면 안됨)
// private : 해당 클래스 내부에서만 사용 가능

public class ModiEx {
	// 멤버 변수
	public String name = "kim";
}
