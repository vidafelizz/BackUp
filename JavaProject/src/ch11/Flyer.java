package ch11;

// interface도 abstract 클래스처럼 new를 못함
public interface Flyer {
	// 인터페이스는 추상메소드만 있어야한다(특수한 경우를 빼고)
	public void takeOff(); 
	public void fly();
	public void land();
}
