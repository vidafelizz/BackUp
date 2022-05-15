package homework;

public class Manager2 extends Employee2 {
	private int bonus;
	
	public Manager2(String num, String name, String address, String mail, int salary, String rrn, int bonus) {
		super(num, name, address, mail, salary, rrn); 
		this.bonus=bonus;
	}
	
	public Manager2() {
		
	}
	public int getBonus() {
		   return bonus;
	}
	
	
	void test() {
		System.out.println("-------------------------------");
		System.out.println("사원번호: " + num);
		System.out.println("이름: " + name);
		System.out.println("주소: " + address);
		System.out.println("이메일: " + mail);
		System.out.println("연봉: " + salary);
		System.out.println("주민번호: " + getRrn()); // private String rrn했기에 상속이 안되어 getter로 가져옴
		System.out.println("bonus: " + bonus);
		System.out.println("-------------------------------");
	}
}
