package ch10;

// overload: method이름은 같고 매개변수 개수나 자료형이 다른 것
public class OverloadEx {
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putData("Hello");
		o.putData(21);
		o.putData(21.3);
	}
	
}



