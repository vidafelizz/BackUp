package ch05;

import java.util.Scanner;

public class QuizEx {
	public static void main(String[] args) {
		String[][] words = {
				{"chair","의자"}, // words[0][0], words[0][1]
				{"computer","컴퓨터"}, // words[1][0], words[1][1]
				{"Integer","정수"} // words[2][0], words[2][1]
		};
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<words.length; i++) {
			System.out.printf("(문제%d) %s의 뜻은?", i+1, words[i][0]);
			String tmp = scan.next(); // 문자처리

			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n", words[i][1]);
			}
			System.out.println();
		}
		scan.close();
	}
}
