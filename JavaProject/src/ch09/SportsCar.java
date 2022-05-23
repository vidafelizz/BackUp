package ch09;

public class SportsCar extends Car { // 부모객체인 Car를 상속받음
	// SportsCar의 멤버변수
	boolean turbo;
	
	// SportsCar의 멤버 메소드
	public void setTurbo(boolean flag) { // 터보 모드 설정 메소드
		turbo = flag;
		System.out.println(turbo);
	}

}
