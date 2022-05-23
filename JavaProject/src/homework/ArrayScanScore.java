package homework;

import java.util.Scanner;

//학생들의 성적을 입력받아서 합계와 평균을 구하는 프로그램을 작성
// 배열, 스캐너, for-each문 활용
public class ArrayScanScore {
	public static void main(String[] args) {
		int total = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적처리할 학생 수를 입력하세요. : ");
		int num = scan.nextInt();
		
		int scores[] = new int [num];
		for(int val : scores) {
			System.out.print("성적을 입력하시오 : ");
			total = scan.nextInt();
			sum += total;
		}
		
		System.out.println("총점은 " + sum + "점 입니다.");
		System.out.println("평균 성적은 " + String.format("%.1f", (double) sum/num) + "점 입니다.");
		scan.close();
		
		
	}
}
