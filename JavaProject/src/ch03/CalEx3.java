package ch03;

import java.util.Scanner;

public class CalEx3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int a = in.nextInt();
		System.out.println("정수를 입력하세요 : ");
		int b = in.nextInt();
		
		System.out.printf("a+b=%d\n", a+b);
		System.out.printf("a-b=%d\n", a-b);
		System.out.printf("a*b=%d\n", a*b);
		System.out.printf("a/b=%d\n", a/b);
		System.out.printf("a/b=%.2f\n", (double)a/b);
		// int 값이 들어왔으나 연산상 실수값이 나오는 경우는 형변환(double)을 써야함
		System.out.printf("a%%b=%d\n", a%b);
		in.close();
	}

}