package ch07;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person(); // 객체생성(인스턴스화)
		// 객체참조변수.멤버
		p1.setName("김철호");
		p1.setAge(20);
		p1.setHeight(180);
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		System.out.println("키 : " + p1.getHeight());
		
	}

}
