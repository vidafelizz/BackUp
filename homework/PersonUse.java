package homework;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person(); {
			p1.setName("홍길동");
			p1.setAge(30);
			p1.setEmail("hong@naver.com");
			p1.setAddress("서울 강남구 역삼동");
			
			System.out.println("이름: " + p1.getName());
			System.out.println("나이: " + p1.getAge());
			System.out.println("이메일: " + p1.getEmail());
			System.out.println("주소: " + p1.getAddress());
		}
		System.out.println();
		
		Person p2 = new Person(); {
			p2.setName("사임당");
			p2.setAge(23);
			p2.setEmail("saimdang@daum.net");
			p2.setAddress("서울 강남구 개포동");
			
			System.out.println("이름: " + p2.getName());
			System.out.println("나이: " + p2.getAge());
			System.out.println("이메일: " + p2.getEmail());
			System.out.println("주소: " + p2.getAddress());
		}
		
		
	}

}
