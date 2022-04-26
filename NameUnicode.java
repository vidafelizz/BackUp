package homework;

public class NameUnicode {
	public static void main(String[] args) {
		// 자신의 이름을 유니코드와 함께 아래처럼 출력해보세요.
		// \uC724\uC18C\uB77C
		
		String name = "윤소라";
		
		char aValue = '\uC724';
		char bValue = '\uC18C';
		char cValue = '\uB77C';
		
		
		System.out.println(name);
		System.out.println("--------------------------------");
		System.out.println("char형(\'\\uC724\'):" + aValue);
		System.out.println("char형(\'\\uC18C\'):" + bValue);
		System.out.println("char형(\'\\uB77C\'):" + cValue);

	}

}
