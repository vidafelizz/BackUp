package ch04;

public class SumEx {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i; // sum = sum + i 와 같음
		
		}
		System.out.printf("1부터 10까지의 정수의 합 = %d\n", sum);
	}
}
