package ch02;

public class ConstantTest {

	public static void main(String[] args) {
		// 상수는 변하지 않는 수를 말하고, final을 붙여서 상수처리한다.
		final double KM_PER_MILE = 1.609344; // KMPERMILE이라고 써도 가능
		double km;
		double mile = 60.0;
		
		km = KM_PER_MILE * mile;
		
		System.out.println("60마일은 " + km + "입니다.");

	}

}
