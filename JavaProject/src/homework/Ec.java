package homework;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ec {
	private int no;//주문번호
	String orderDate; //주문일자
	String product; //주문상품
	String cardName; //신용카드명
	String cardNo; //카드번호
	int pay; //결제금액

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNo() {
		String st = cardNo;
		String cn = st.substring(0,5) + "****" + st.subSequence(9, 11);
		return cn;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public Ec() {
		
	}
	
	public Ec(int no, String orderDate, String product, String cardName, String cardNo, int pay) {
		super();
		this.no = no;
		this.orderDate = orderDate;
		this.product = product;
		this.cardName = cardName;
		this.cardNo = cardNo;
		this.pay = pay;
	}
}
