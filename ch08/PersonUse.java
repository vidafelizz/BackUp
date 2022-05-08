package ch08;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person(); // 객체생성과 동시에 기본생성자 호출
		p1.showInfo();
		
		Person p2 = new Person("김상범"); // 객체생성과 동시에 매개변수가 하나짜리인 생성자 호출
		p2.showInfo();
		
		Person p3 = new Person("박찬호", 185); // 객체생성과 동시에 매개변수가 두개짜리인 생성자 호출
		p3.showInfo();
		
		Person p4 = new Person("박지성", 175, 72);
		p4.showInfo();
		
	}

}
