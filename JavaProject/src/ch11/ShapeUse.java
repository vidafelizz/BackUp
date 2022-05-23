package ch11;

public class ShapeUse {
	public static void main(String[] args) {
//		Shape s = new Shape(); // 추상클래스는 new를 할 수 없다.
		
		Rectangle r = new Rectangle();
		r.x = 100;
		r.y = 200;
		r.draw();
		
		Circle c = new Circle();
		c.x = 300;
		c.y = 300;
		c.draw();
	}
}
