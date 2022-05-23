package homework;

public class Product {
	private String name; // 제품명
	private String company; // 제조회사
	private String date; // 제조일자
	private int price; // 단가
	private int amount; // 수량
	private int money; // 금액
	
	public Product(String name, String company, String date, int price, int amount, int money) {
		super();
		this.name = name;
		this.company = company;
		this.date = date;
		this.price = price;
		this.amount = amount;
		this.money = price*amount;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
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

	public void setTot(int money) {
		this.money = price*amount;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", company=" + company + ", date=" + date + ", price=" + price + ", amount=" + amount
				+ ", money=" + money + "]";
	}

}
