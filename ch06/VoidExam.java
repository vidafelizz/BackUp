package ch06;

public class VoidExam {
	public static void hello() { // void는 리턴값이 없음을 의미
		System.out.println("안녕하세요?");
		return; // 메소드 종료를 의미, 생략 가능
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		hello();
		System.out.println("프로그램 끝");
	}

}
