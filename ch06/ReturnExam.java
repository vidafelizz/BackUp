package ch06;

public class ReturnExam {
	public static int sum(int a) { // a=50, a=100
		int result = 0;
		for(int i=1; i<=a; i++) {
			result += i;
		}
		return result; // 메소드를 호출한 곳으로 값을 반환함
	}
	
	public static void main(String[] args) {
		int n=sum(50); // sum메소드 호출한 후 리턴받은 값을 저장
		System.out.println(n);
		n = sum(100); // 메소드를 재사용
		System.out.println(n);
	}

}
