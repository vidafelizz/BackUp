package ch09;

public class SportsCarTest {
	public static void main(String[] args) {
		
		SportsCar obj = new SportsCar(); // 객체생성
		obj.speed = 10; // Car의 멤버변수
		obj.setSpeed(60); // Car의 멤버메소드
		obj.setTurbo(true); // SportsCar의 멤버메소드
		
		// (정리) 상속받는 객체는 "부모님꺼는 내꺼"
	}
}
