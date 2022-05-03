package homework;

public class BookStore2 {
	private String book; // 도서명
	private String name; // 저자
	private String brand;// 출판사
	private int year;	 // 출판연도
	private int price;   // 가격
	private int sell;    // 판매수량
	private int saleprice;     // 판매금액

	public void input(String book, String name, String brand, int year, int price, int sell, int saleprice) {
		this.book = book;
		this.name = name;
		this.brand = brand;
		this.year = year;
		this.price = price;
		this.sell = sell;
		this.saleprice = saleprice;
	}
	
		public void print() {
			System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
			System.out.println(book+"\t"+name+"\t"+brand+"\t"+year+"\t"
			+price+"\t"+sell+"\t"+saleprice);
		}
	
}