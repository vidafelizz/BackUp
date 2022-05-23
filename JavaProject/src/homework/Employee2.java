package homework;

public class Employee2 {
	public String num; // 사원번호
	public String name; // 이름
	String address; // 주소 (default)
	public String mail; // 메일
	protected int salary; // 연봉
	private String rrn; // 주민등록번호
	
	public String getRrn() {
		return rrn;
	}
	
	public Employee2() {
		
	}
	
	public Employee2(String num, String name, String address, String mail, int salary, String rrn) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.mail = mail;
		this.salary = salary;
		this.rrn = rrn;
		
	}

//	@Override
//	public String toString() {
//		return "Employee [num=" + num + ", name=" + name + ", address=" + address + ", mail=" + mail + 
//				", salary=" + salary + ", rrn=" + rrn + "]";
//	}

}
