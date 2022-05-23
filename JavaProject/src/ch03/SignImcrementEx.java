package ch03;

public class SignImcrementEx {

	public static void main(String[] args) {
		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne " + plusOne + "입니다.");
		System.out.println("minusOne " + minusOne + "입니다.");

		
		int x = 1, y = 1;
		System.out.println("x = " + x + ", ++x = " + ++x);
		System.out.println("y = " + x + ", y++ = " + y++);
		System.out.println("x = " + x + ", y = " + y);
	}

}
