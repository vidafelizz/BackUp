package ch02;

public class TypeMismatch {

	public static void main(String[] args) {
		byte n;
		
		n = 127;
//		byte타입의 값은 -128~127까지만 값처리 됨
		System.out.println(n);

	}

}
