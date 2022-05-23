package ch08;

class Circle {
	private double radius;
	private String color;
	
	public Circle(double r, String C) {
		radius = r;
		color = "c";
	}
	public Circle(double r) {
		radius = r;
		color = "파랑";
	}
	public Circle(String c) {
		radius = 10.0;
		color = c;
	}
	
	public Circle() {
		radius = 10.0;
		color = "빨강";
	}
	
	public void printf() {
		System.out.println("반지름 : " + radius);
		System.out.println("색 깔 : " + color);
		System.out.println();
	}
	
}


public class CircleDemo {
	public static void main(String[] args) {
		Circle c1 = new Circle(10.0, "빨강"); // 객체생성과 동시에 생성자 호출
		c1.printf();
		
		Circle c2 = new Circle(5.0);
		c2.printf();
		
		Circle c3 = new Circle("노랑");
		c3.printf();
		
	}

}
