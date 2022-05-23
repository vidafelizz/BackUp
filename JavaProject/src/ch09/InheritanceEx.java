package ch09;

public class InheritanceEx {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();

		System.out.println();
		
		Ball c2 = new Ball("빨간색"); // 객체생성과 동시에 매개변수가 있는 생성자 호출
		System.out.println("공 : ");
		c2.findRadius(); // Ball클래스가 아닌 Circle클래스 멤버 호출
		c2.findcolor();
		c2.findArea();
		c2.findVolume();
		// c2.secret(); private 처리된 멤버는 아무리 상속관계여도 쓸 수 없다.
		
	}
}
