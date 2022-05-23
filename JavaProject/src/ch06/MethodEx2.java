package ch06;

// 메소드를 사용하면 얻을 수 있는 장점 :
// 1) 중복 코드를 줄이고 재사용할 수 있다.
// 2) 모듈화해 가독성을 높이기 때문에 프로그램의 품질을 향상시킨다.

public class MethodEx2 {
	public static void main(String[] args) {
		System.out.println("합(1~10) : " + sum(1, 10));
		System.out.println("합(10~100) : " + sum(10, 100));
		System.out.println("합(100~1000) : " + sum(100, 1000));
		
	}
	
	// 메소드의 위치는 main 아래나 위나 상관없음
	public static int sum(int a, int b) {
		int sum = 0;
		for(int i=a; i<=b; i++) {
			sum += i;
		}
		return sum;		
	} // end sum
}
