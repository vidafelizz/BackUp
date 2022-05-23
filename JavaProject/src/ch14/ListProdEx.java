package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<ProdEx> list = new ArrayList<>();
		
		list.add(new ProdEx("TV", "LG01tv", "LG", 300, 10));
		list.add(new ProdEx("냉장고", "sm02", "삼성", 200, 5));
		list.add(new ProdEx("에어컨", "win03", "위니아", 100, 8));
		list.add(new ProdEx("컴퓨터", "asus1", "아수스", 150, 3));
		
		map.put("list", list); // 맵에 리스트 추가	
		print(map);
	}
	
	static void print(Map map) { // map은 get("key")
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("----------------------------------------------");
		for(ProdEx s : list2) {
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		
		}
		System.out.println("----------------------------------------------");
	}
}
