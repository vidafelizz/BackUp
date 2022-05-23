package ch12;

public class InnerExam3 {
	public void exec() { // 메서드
		class Cal { 	 // 메서드 안에서 class 선언
			int value = 0;
			public void plus() {
				value++;
			}
		}
		Cal cal = new Cal();
		cal.plus();
		System.out.println(cal.value);
	}
	public static void main(String[] args) {
		InnerExam3 t = new InnerExam3();
		t.exec();
	}
}
