package ch03;

public class CastEx {

	public static void main(String[] args) {
		// 자료형 변환
		float f = 1.6f; // 4바이트로 저장
		System.out.println(f);
		
		f = 100; // int형인 100이라는 정수값을 float형인 f가 자동으로 100.0으로 만든다.
		// 이러한 변환을 자동형(확장형) 변환
		System.out.println(f);
		
		f = 100.5f;
		int i = (int)f; // 큰값에서 작은값으로 변환할때는 강제형 변환을 개발자가 명시적으로 함
		System.out.println(i);
	}

}
