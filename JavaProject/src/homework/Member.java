package homework;

//(등급은 10만원 이상 구매 gold, 5만원 이상 silver, 그외 bronze)

public class Member {
	private String name;
	private String id;
	private int price;
	private String grade;
		
	public Member() {
		this("홍길동", "hong", 120000);
	}
	
	public Member(String name, String id, int price) {
		this.name = name;
		this.id = id;
		this.price = price;
		if(price >= 100000) {
			grade = "gold";
		} else if(price >= 50000) {
			grade = "silver";
		} else {
			grade = "bronze";
		}
	}

	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name+"\t"+id+"\t"+price+"\t"+grade);
	}
	
}
