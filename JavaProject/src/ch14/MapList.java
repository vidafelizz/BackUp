package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map map) {
		ArrayList<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()
			+"\t"+s.getProfessor());
		}		
	}
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>(); // 맵 인스턴스
		List<Student> list = new ArrayList<>(); // 리스트 인스턴스
		list.add(new Student("2022001", "kim", "영어", 1, "park"));
		list.add(new Student("2022002", "choi", "전산", 1, "hong"));
		list.add(new Student("2022003", "lee", "경영", 1, "kim"));
		// list에 3개의 레코드가 저장
		map.put("list", list); // 맵에 리스트 추가
		
		print(map);
	}
}
