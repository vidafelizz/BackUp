package ch10;

public class StaticVar2 {
	static int total;	// static member 클래스 영역에 메모리에 올라감(공유)
	String model;		// 객체타입 heap 영역에 생성(new, non-static)
	
	public StaticVar2(String model) { // 매개변수가 있는 생성자
		this.model = model;
		total++;
	}
	
	public StaticVar2() { // 기본생성자도 사용하지 않더라도 만들면 좋음
		
	}
}
