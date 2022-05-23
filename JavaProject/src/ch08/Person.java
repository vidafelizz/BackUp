package ch08;

public class Person {
	private String name;
	private int height;
	private int weight;
	
	public Person() { // 기본생성자
		this("김철호", 170,60); // this() 생성자 호출, 첫줄에 써야함
	}
	
	public Person(String name) {
		this(name,190,100);
	}
	
	public Person(String name, int height) {
		this(name, height, 70);	// 생성자호출
	}
	
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		
	}
	public void showInfo() {
		System.out.println("=== 신상 정보 ===");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
	}
}
