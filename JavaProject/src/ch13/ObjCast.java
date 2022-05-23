package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		// 부모 : 자식
		Object obj = 20;
		a = (Integer)obj; // 정상적인 형변환, 객체는 객체형끼리 형변환 해주는게 좋다.
//		a = obj;
		System.out.println(a);
		
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
		for(Object o : obj2) { // 향상된 for문. for each문
			System.out.println(o); // 오토언박싱 처리
		}
	}
}
