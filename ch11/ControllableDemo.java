package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();	
		Controllable.reset();	// static메소드인 reset()은 클래스이름.메소드로 접근 가능
		
		Computer com = new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}
}
