package ch09;

class Bank {
	double getInterestRate() { // header
		return 0.0; // body
	}
}

class BadBank extends Bank {
	double getInterestRate() { // 메소드 오버라이딩(재정의)
		return 10.0;
	}
}

class NomalBank extends Bank {
	double getInterestRate() { // 메소드 오버라이딩(재정의)
		return 5.0;
	}
}
class GoodBank extends Bank {
	double getInterestRate() { // 메소드 오버라이딩(재정의)
		return 3.0;
	}
}


public class BankTest {
	public static void main(String[] args) {
		BadBank b1 = new BadBank();
		NomalBank b2 = new NomalBank();
		GoodBank b3 = new GoodBank();
		
		System.out.println("BadBank의 이자율 : " + b1.getInterestRate());
		System.out.println("NomalBank의 이자율 : " + b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : " + b3.getInterestRate());	
		
	}

}
