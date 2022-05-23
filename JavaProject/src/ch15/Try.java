package ch15;

public class Try {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		
		try {
			for(int i=0; i<=num.length; i++) {
				System.out.println(num[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			 e.printStackTrace();
		}
	}
}
