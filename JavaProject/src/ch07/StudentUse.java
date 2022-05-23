package ch07;

public class StudentUse {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setMajor("컴퓨터");
		s1.setYear(3);
		s1.setNum("a1234");
		s1.setPoint(4.1);
		s1.setMoney(400);
		s1.print();
		System.out.println(s1); // toString을 이용해서 값이 잘 입력 됐는지 확인
	}

}
