package ch04;

import java.util.Scanner;

public class Nested_If_Score {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ';
		char level = '0'; //A0, B0 문자로 처리
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Java 점수 : ");
		score = sc.nextInt();
		sc.close();
		
		if(score > 90) {
			grade = 'A';
			if (score > 97) {
				level = '+';
			} else if (score < 94) {
				level = '-';
			}
		} else if (score > 80) {
			grade = 'B';
			if (score > 87) {
				level = '+';
			} else if (score < 84) {
				level = '-';
			}
		} else {
			grade = 'F';
			System.out.println("재수강 대상입니다.");
		}
		
		System.out.println("당신의 점수는 " + score + "이고 등급은 " + grade+level + "입니다.");
		
	} // main()
}
