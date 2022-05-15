package homework;

import java.util.Scanner;

public class Product2 {
	private String num; // 제품번호
	private String name; // 제품명
	private String company; // 제조사
	private String date; // 제조일자
	private int price; // 단가
	private int amount; // 수량
	private int money; // 판매금액(단가x수량)
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("제품번호: ");
		num = sc.next();
		System.out.println("제품명: ");
		name = sc.next();
		System.out.println("제조사: ");
		company = sc.next();
		System.out.println("제조일자: ");
		date = sc.next();
		System.out.println("단가: ");
		price = sc.nextInt();
		System.out.println("수량: ");
		amount = sc.nextInt();
		
		money = price*amount;
	}

	public Product2(String num, String name, String company, String date, int price, int amount, int money) {
		super();
		this.num = num;
		this.name = name;
		this.company = company;
		this.date = date;
		this.price = price;
		this.amount = amount;
		this.money = money;
	}

	public Product2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Product2 [num=" + num + ", name=" + name + ", company=" + company + ", date=" + date + ", price="
				+ price + ", amount=" + amount + ", money=" + money + "]";
	}

}
