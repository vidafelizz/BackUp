package ch02;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();
		
		System.out.println(num % 2 == 0 ? "짝수" : "홀수");
		// 3항 연산자 1항 ?(조건식) 2항(true) : 3항(false)	
		
		in.close();
		
	}

}
