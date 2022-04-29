package homework;
//while문과 scanner를 활용해서 구구단 출력 프로그램 만들기
import java.util.Scanner;

public class While_Gugu {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		int dan = scan.nextInt();
		int i=1;
		
		while(i<=9) {
			System.out.println(dan + " x " + i +" = " + (dan*i));
			i++;
		}

	}

}
