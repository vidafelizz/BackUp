package homework;

public class BankUse {
	public static void main(String[] args) {
		MyBank mb = new MyBank();
		
		BankPlayer hong = new BankPlayer(1, mb);
		BankPlayer sa = new BankPlayer(2, mb);
		BankPlayer lee = new BankPlayer(3, mb);
		
		hong.start();
		sa.start();
		lee.start();
	}
}
