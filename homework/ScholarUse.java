package homework;

public class ScholarUse {
	public static void main(String[] args) {
		Scholar s1 = new Scholar();
		s1.input("사입당", "2203", "컴공", 1, "1종", 250);
		s1.print();
		s1.input("홍길동","2001", "전자", 3);
		s1.print2();
	}
}
