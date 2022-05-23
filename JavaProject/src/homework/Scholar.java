package homework;

public class Scholar extends Student {
	private String category; 
	private int money;
	
	public void input(String name, String num, String major, int year, String category, int money) {
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}
	
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());
	}
}
