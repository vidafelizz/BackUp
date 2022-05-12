package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("2022001", "김만수", "국사", 1,"박교수"));
		list.add(new Student("2022002", "박찬호", "영문", 1,"최교수"));
		list.add(new Student("2022003", "송영길", "전산", 1,"김교수"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수\t");
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}

}
