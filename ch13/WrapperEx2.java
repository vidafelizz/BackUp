package ch13;

public class WrapperEx2 {
	public static void main(String[] args) {
		// Character 사용
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "는 영문자");
		}
		
		// Integer 사용
		System.out.println(Integer.parseInt("200"));
		System.out.println(Integer.toString(200));
		System.out.println(Integer.toBinaryString(200));
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue()); // 정수를 double값으로 변환(언박싱)
		
		Double d = new Double(3.14);
		System.out.println(d.toString()); // Double을 문자열 "3.14"로 변환
		System.out.println(Double.parseDouble("3.14")); // 문자열을 실수 3.14로변환
		
		boolean b = (4>3); // b= true
		System.out.println(Boolean.toString(b)); // boolean형 true를 문자열 "true"로 변환
		System.out.println(Boolean.parseBoolean("false")); // 문자열을 실제 boolean형 false
	}

}
