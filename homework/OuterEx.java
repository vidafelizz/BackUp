package homework;

public class OuterEx {
	static int num = 2;
	
	static class InnerEx {	
		static String name = "사임당";
		String email = "saim@gmail.com";
		String addr = "서울시 강남구 역삼동";
	
	}

	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("고객번호	: " + OuterEx.num);
		System.out.println("이름	: " + InnerEx.name);

		OuterEx.InnerEx ie = new OuterEx.InnerEx();
		System.out.println("이메일	: " + ie.email);
		System.out.println("주소	: " + ie.addr);
		System.out.println("-----------------------");
	}
}
