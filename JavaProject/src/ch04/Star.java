package ch04;

public class Star {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"); //줄바꿈 안함
				
			} //inner for
			System.out.println(); // 줄바꿈만
		} //outer for
		
		//역삼각형
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	} //main

}
