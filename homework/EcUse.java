package homework;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch14.ProdEx;

public class EcUse {
	public static void main(String[] args) {
		
		Map<String, Object> map = new HashMap<>();
		List<Ec> list = new ArrayList<>();
	
	
		list.add(new Ec(1234, "2022-05-13", "티셔츠", "삼성", "37918123468 ", 55900));
		list.add(new Ec(2345, "2022-05-13", "컴퓨터", "롯데", "15918123468 ", 2555000));
		list.add(new Ec(3456, "2022-05-13", "커 피", "현대", "27918123468 ", 1200));
		
		map.put("list", list);
		print(map);
	}
	
	
	static void print(Map map) {
		
		ArrayList<Ec> list2 = (ArrayList<Ec>)map.get("list");
		DecimalFormat df = new DecimalFormat("###,###,###");	
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("------------------------------------------------------------------");
		for(Ec s : list2) {
			System.out.println(s.getNo()+"\t"+s.getOrderDate()+"\t"+s.getProduct()
			+"\t"+s.getCardName()+"\t"+s.getCardNo()+"\t"+df.format(s.getPay()));
		}		
		System.out.println("------------------------------------------------------------------");
	}
}
