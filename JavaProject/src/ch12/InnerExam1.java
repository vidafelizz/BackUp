package ch12;

public class InnerExam1 { // 외부 클래스
	class Cal{			  // 내부 클래스
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		// 1. 외부클래스를 인스턴스화한다.
		InnerExam1 t = new InnerExam1(); // 외부객체 생성
		// 2. 외부클래스이름.내부클래스 참조변수 = 외부클래스의참조변수.new 내부클래스생성자;
		InnerExam1.Cal cal = t.new Cal(); // 내부객체 생성
		cal.plus();
		System.out.println(cal.value);
	}
}
