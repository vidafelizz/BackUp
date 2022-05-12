package ch13;

// Wrapper class: 기본자료형을 포장하는 클래스
// 기본자료형에 대한 다양한 메서드

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 = new Integer(20);
		int num1 = i1.intValue();
		int num2 = i2; // auto unboxing(객체로 포장된 value를 꺼내는 작업(intValue())
		int sum = num1+num2;
		System.out.println(sum);
		
		// 2진수로 문자열 변환
		System.out.println(Integer.toBinaryString(sum));
		// 8진수로 변환
		System.out.println(Integer.toOctalString(sum));
		// 16진수로 변환
		System.out.println(Integer.toHexString(sum));
		System.out.println(Integer.MAX_VALUE); // 정수의 최대값
		System.out.println(Integer.MIN_VALUE); // 정수의 최소값
		System.out.println(Integer.parseInt("100"));
		// 정수를 문자열
		System.out.println(Integer.toString(100)); // 100=> "100"
		
	}

}
