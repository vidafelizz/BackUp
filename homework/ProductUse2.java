package homework;

import java.util.ArrayList;
import java.util.List;

public class ProductUse2 {
	public static void main(String[] args) {
		List<Product2> list = new ArrayList<>();
		System.out.println("2건의 제품정보를 입력하세요.");
		Product2 p1 = new Product2();
		p1.input();
		Product2 p2 = new Product2();
		p2.input();
		
		list.add(p1);
		list.add(p2);
		
		System.out.println("제품번호\t제품명\t제조사\t제조일자\t\t단가(천원)\t수량\t금액");
		for(int i=0; i<list.size(); i++) {
			Product2 p = list.get(i);
			System.out.println(p.getNum()+"\t"+p.getName()+"\t"+p.getCompany()+"\t"+p.getDate()
			+"\t"+p.getPrice()+"\t"+p.getAmount()+"\t"+p.getMoney());
		}		
	}
}
