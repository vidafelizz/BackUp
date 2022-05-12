package ch12;

interface RemoteControl {
	// 추상메서드(구현부가 없는 메서드)
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		// 인터페이스는 new해서 객체생성을 못한다.
		// 무명클래스 처리하면 자동적으로 인터페이스를 무명페이스가 상속받아 오버라이딩 처리할 수 있다.
		RemoteControl ac = new RemoteControl() {
		
			@Override
			public void turnOn() {
				System.out.println("TV turnOn()");		
			}
			@Override
			public void turnOff() {
				System.out.println("TV turnOff()");				
			}
		}; // 무명내부클래스	
		ac.turnOn();
		ac.turnOff();
	}			
}
