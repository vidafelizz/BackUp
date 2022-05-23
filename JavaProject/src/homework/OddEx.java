package homework;

public class OddEx {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		
		}
		System.out.println("1~10사이의 홀수의 합은 ? " + sum );
	}

}
