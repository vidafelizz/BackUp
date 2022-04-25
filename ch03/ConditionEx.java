package ch03;

public class ConditionEx {

	public static void main(String[] args) {
		int num = -5;
//		System.out.println(num>0 ? num : -num);
		
		if (num > 0) { // if 제어문 true
			System.out.println(num);
		} else {
			System.out.println(-num);
		}

	}

}
