package ch06;

import java.util.Scanner;

public class Method_Gugu {
	
	static void gugu(int dan) { // void인걸보니 return이 없겠구나 추측
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
	}
	public static void main(String[] args) {
		int dan;
		System.out.print("단을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		dan = scan.nextInt();
		gugu(dan);
		scan.close();
	}
}
