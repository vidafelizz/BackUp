package ch09;

public class BookSale extends Book {
	private int amount; // 판매수량
	private int rank; // 판매순위
	private int money; // 판매금액(단가x수량, 만약 금액 10만원 초과시 10% 할인)

	// getter, setter
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
//	public int getMoney() {
//		return money;
//	}
	public void setMoney() {
		money = getPrice()*amount;
		if(money>100000)
			money = (int)(money*0.9);
	}
	public void print() {
		System.out.println("도서명\t출판사\t저자\t출판연도\t단가\t판매수량\t판매금액\t\t판매순위");
		System.out.println(getBookName()+"\t"+getPress()+"\t"+getAuthor()+"\t"+getYear()+"\t"+
							getPrice()+"\t"+amount+"\t"+money+"\t"+rank);
	}	
}
