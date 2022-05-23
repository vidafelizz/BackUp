package ch05;

public class ArraySum {
	public static void main(String[] args) {
		int[] num= {10,20,30,40,50};
		int sum = 0;
//		for(int i=0; i<5; i++) {
//			sum = sum + num[i];
//		}
		
		//위 for문 대신에 length속성을 쓰면 배열데이터의 변화가 있떠라도 바로 대응 가능
		
		for(int i=0; i<num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("합계 : " + sum);
	}

}
