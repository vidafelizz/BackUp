package homework;

public class OverloadEx4 {
	public static void main(String[] args) {
		print("홍길동", 30000);
		
	}
	static void print(String name, int money) {
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+money+"\t"+(int)(money*0.03)+"\t"+(int)(money-(money*0.03)));
		
	  // 세금계산 = 급여*0.03
	  // 실수령액 = 급여-세금
	
	}
}
