package homework;

public class BankPlayer extends Thread {
	int type;
	MyBank myBank;
	
	public BankPlayer(int type, MyBank myBank ) {
		this.type = type;
		this.myBank = myBank;
	}
	@Override
	public void run() {
		switch (type) {
		case 1: myBank.playBank1();
			break;
		case 2: myBank.playBank2();
			break;
		case 3: myBank.playBank3();
			break;
		}		
	}
}
