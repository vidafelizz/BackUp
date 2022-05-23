package ch09;

public class Ball extends Circle {
	// Ball 클래스의 멤버변수
	private String color;
	
	// Ball 클래스의 멤버 생성자
	public Ball(String color) { // 매개변수가 있는 생성자
		this.color = color;
	}
	
	// 기본생성자도 코딩해주는 습관을 가지자.
	// Ball 클래스의 멤버 생성자
	public Ball() {
		
	}
	public void findcolor() {
		System.out.println(color + "공이다.");
	}
	// Ball 클래스의 멤버 생성자
	public void findVolume() {
		System.out.println("부피 구하기");
	}
}
