package ch07;


class Phone {
	
	// 멤버 변수
	String model;
	int value;
	
	// 멤버 메소드
	void print() {
		System.out.println(value + "만원 짜리 " + model + " 스마트폰");
	}
}
public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.model = "갤럭시 S21";
		myPhone.value = 100;
		myPhone.print();
		
		Phone yourPhone = new Phone();
		yourPhone.model = "아이폰";
		yourPhone.value = 150;
		yourPhone.print();
	}
}
