package homework;

public class Student {
	
	protected String name;
	protected String num; 
	protected String major; 
	protected int year; 
	
	public Student() { }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}


	public Student(String name, String num, String major, int year) {

		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
		
	}
}
