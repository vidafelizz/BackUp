package ch04;

public class Multi {
	public static void main(String[] args) {
		long num = 10;
		long sum = 1; // 합계를 저장할 변수
		for(int i=1; i<=num; i++) {
			sum = sum * i;
			
		}
		System.out.println("1~부터" + num + "까지의 곱 : " +sum);
	}

}
