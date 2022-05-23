package ch12;

public class InnerExam2 {
	static class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		// 내부 static class에 접근할때는
		// 외부클래스이름.내부클래스이름 참조변수 = new 외부클래스이름.내부생성자이름
		
		InnerExam2.Cal cal = new InnerExam2.Cal();
		cal.plus();
		System.out.println(cal.value);
	}
}
