package ch02;

public class CharEx {
	public static void main(String[] args) {
		// 유니코드
		// https://huskdoll.tistory.com/39
		char aValue = '\u0041';
		
		System.out.println("char형('\u0041'):" + aValue);
		
		char bValue = '\u0041';
		System.out.println("char형(\'\\u0041\'):" + aValue);

	}

	
	// 내이름 유니코드 
	// 윤소라 = \uC724\uC18C\uB77C
}
