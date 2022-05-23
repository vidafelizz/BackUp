package ch15;

public class Test {
	public static void main(String[] args) {
		// try~catch로 문제를 바로잡아보기
		
		try {
			int num = Integer.parseInt("ABC"); //영문자를 숫자화할 수 없음
			System.out.println(num);
	
		} catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외발생");
		}
	}
}
