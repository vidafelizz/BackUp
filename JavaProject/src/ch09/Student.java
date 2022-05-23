package ch09;

public class Student {
	// 멤버변수
	// protected 자식클래스에서 접근 가능, private만 상속이 안됨
	protected String name;
	protected String num; // 학번
	protected String major; // 전공
	protected int year; // 학년
	
	public Student() { } // 기본생성자
	
	// 생성자로 매개변수 처리
	public Student(String name, String num, String major, int year) {

		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	// 일반메소드로 매개변수 처리
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
		
	}
}
