package ch09;

public class SaleUse {
	public static void main(String[] args) {
		Sale s1 = new Sale();
		// 데이터 입력
		s1.input(101, "냉장고", "LG", "202205", 200, 9);
		
		// 계산
		s1.calc();
		// 출력
		s1.print();
	}
}
