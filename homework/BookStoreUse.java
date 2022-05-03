package homework;

public class BookStoreUse {
	public static void main(String[] args) {
		BookStore b = new BookStore();
		b.setBook("Java");
		b.setName("김선생");
		b.setBrand("영진");
		b.setYear(2022);
		b.setPrice(30000);
		b.setSell(10);
		b.print();
	}
}
