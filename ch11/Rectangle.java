package ch11;

public class Rectangle extends Shape {

	// 추상클래스를 상속받으면 반드시 추상메소드를 구현(완성)해야한다.
	@Override
	public void draw() {
		System.out.println("사각형 그리기 중심 x 좌표값 : " + x);
		System.out.println("사각형 그리기 중심 y 좌표값 : " + y);
	}
}
