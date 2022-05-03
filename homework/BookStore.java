package homework;

public class BookStore {
	private String book; // 도서명
	private String name; // 저자
	private String brand;// 출판사
	private int year;	 // 출판연도
	private int price;   // 가격
	private int sell;    // 판매수량
	private int saleprice;     // 판매금액
	
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public int getSaleprice() {
		return price*sell;
	}
	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(book+"\t"+name+"\t"+brand+"\t"+year+"\t"
		+price+"\t"+sell+"\t"+getSaleprice());
	}

}
