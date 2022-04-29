package ch06;

public class AbsEx {
	public static int abs(int num) { // num = -15
		return num > 0 ? num : -num; //-(-15) +15
	}
	
	public static void main(String[] args) {
		int a=-15;
		System.out.println(a);
		System.out.println(abs(a));
		System.out.println(Math.abs(a));
		
	}

}
