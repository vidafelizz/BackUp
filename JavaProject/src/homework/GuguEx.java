package homework;

import java.util.Scanner;

public class GuguEx {
	public static void gugu(int dan) { 
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		System.out.println("===============");
	}
	
		public static void main(String[] args) {
			System.out.print("단을 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			int dan = scan.nextInt();
			gugu(dan);
			guguAll();
			scan.close();
		}
	
	public static void guguAll() {
		for(int i=2; i<=9; i++) {
			System.out.println();
		
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}	
		}
	}
}
