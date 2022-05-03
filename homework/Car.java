package homework;

public class Car {
	// 멤버 변수
	String color;
	int speed;
	int gear;
	
	public String toString() {
		return "차량 색상: " + color + "\n" + "차량 속도: " + speed +"km/h"
				+ "\n" + "기어단수: " + gear;
	}	
	void Color() {
		color = "흰색";
	}
	void Speed() {
		speed = 100;
	}
	void Gear() {
		gear = 5;
	}
}
