package ch13;

public class AppendEx {
	public static void main(String[] args) {
		String a = "hello"; // 불변성
		a = a+"java";
		System.out.println(a);	
		
		// 가변성(mutable)
		// 실제 쓰임새는 긴문자열을 처리하고자 할 때
//		StringBuilder b = new StringBuilder("hello");
//		b.append("java");
		System.out.println(b);
	}
}
