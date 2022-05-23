package ch18;

import java.io.Serializable;
//객체 직렬화를 하려면 Serializable 인터페이스를 구현해야 함.
//객체 직렬화는 메모리에 저장된 객체를 파일로 저장하거나 네트워크로 전송할 때 사용
//MVC패턴 (Model View Controller)에서 쓰이는 용어
//1)DTO : Data Transfer Object(데이터를 전달하는 객체, 결과물을 저장)
//2)VO : Value Object, DTO의 개념이지만 생성자없이 getter,setter로만 구성됨
//3)DAO : Data Access Object(데이터 조작 객체, DB와 연결하여 데이터를 구하는 비즈니스로직단)

public class MemberDTO implements Serializable {
	private String userid;
	private String name;
	private String passw;
	private int age;
	private String email;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String userid, String name, String passw, int age, String email) {
		super();
		this.userid = userid;
		this.name = name;
		this.passw = passw;
		this.age = age;
		this.email = email;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassw() {
		return passw;
	}

	public void setPassw(String passw) {
		this.passw = passw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "MemberDTO [userid=" + userid + ", name=" + name + ", passw=" + passw + ", age=" + age + ", email="
				+ email + "]";
	}
	
}
