package ch04;

import java.util.Scanner;

public class While_Point {
	public static void main(String[] args) {
		int cnt = 0; // 증감식 변수
		int total = 0; //초기식 변수
		
		Scanner input = new Scanner(System.in);
		System.out.print("더할 값을 입력 하세요 : ");
		int num = input.nextInt();
		
		while(num != 0) { //num이 0이 아니면
			total += num;
//			cnt++;
			System.out.println("현재 누적된 값 : " + total);
			System.out.println("계속 입력하세요.(종료를 원하면 0을 입력)");
			num = input.nextInt();
			
		}
		
		System.out.println("총 누적합 : " + total);
		System.out.println("프로그램을 종료합니다.");
		input.close();
	}

}
