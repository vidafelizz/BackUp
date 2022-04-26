package ch04;

public class For_For {
	public static void main(String[] args) {
		//중첩 for문
		for(int i =1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				System.out.print("*");
			} // inner for문
		System.out.println();	
		} // outer for문

	} //main

}
