package homework;

public class BreakEx4_1 {
	public static void main(String[] args) {
	
		int n=1;
		while(true) {
			System.out.println(n++ +" Hello World");
			if(n==8) break;
				
		}
		System.out.println("n값이 8이면 while문 빠져나옴");
	}

}
