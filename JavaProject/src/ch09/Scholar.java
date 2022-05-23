package ch09;

public class Scholar extends Student { 
	// 장학생은 학생이다. 즉 상속관계에 있어 부모멤버들을 그대로 쓸 수 있다.
	private String category; // 장학금의 종류
	private int money; // 장학금액
	
	public void input(String name, String num, String major, int year, 
			String category, int money) {
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
		
		// super() = > 부모클래스의 생성자 호출
		// super. => 부모클래스의 메소드 또는 변수 호출
		// this() => 현재 클래스의 생성자 호출
		// this. => 현재 클래스의 변수,메소드 처리
	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t장학금종류\t장학금액");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+category+"\t"+money);
		
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}

}
