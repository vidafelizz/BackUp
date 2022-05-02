package ch07;

public class Person {
	// 멤버변수
	private String name;
	private int age;
	private double height;

	//setter : set+변수명
	public void setName(String name) { // name은 지역변수(로컬변수)
		// this => 멤버변수를 가리킴
		this.name = name;
		
	}
	//getter : get+변수명	return값이 있어야함
	public String getName() {
		return name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		} else {
			this.age = age;
		}
	}
	public int getAge() {
		return age;
	}
	public void print() {
		System.out.println("이름:" + name + "키" + height + "나이" + age);
	}
}
