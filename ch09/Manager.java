package ch09;

public class Manager extends Employee { 
	private int bonus;
	
	// 매개변수가 있는 생성자
	public Manager(String name, String address, int salary, String rrn, int bonus) {
		super(name, address, salary, rrn); // 부모클래스의 생성자 호출(매개변수가 있는)
	}
	// 기본생성자를 명시적으로 코딩
	public Manager() {
		
	}
	void test() {
		System.out.println("name: " + name);
		System.out.println("address: " + address);
		System.out.println("주민번호: " + getRrn()); // private String rrn했기에 상속이 안되어 getter로 가져옴
		System.out.println("salary: " + salary);
		System.out.println("bonus: " + bonus);
	}
}
