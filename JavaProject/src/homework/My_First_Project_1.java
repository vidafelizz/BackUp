package homework;

import java.util.Scanner;

public class My_First_Project_1 {
	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		outer:
		while(true) {
		System.out.println("--[메 뉴]--");
		System.out.print("(1)한식\n(2)양식\n(3)중식\n");
		System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0) >");
		String tmp = scan.next();
		menu = Integer.parseInt(tmp);
		
		if(menu==0) {
			System.out.println("프로그램을 종료합니다.");
			break;
		} else if(menu < 1 || menu > 3) {
			System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0) >");
			continue;
		} 
		
		switch(menu) {
		case 1: 
			System.out.println("[한식메뉴]");
			System.out.print("(1)김치찌개\n(2)된장찌개\n(3)삼겹살\n(4)비빔밥\n");
			System.out.println("한식 메뉴를 선택하세요.(한식메뉴선택종료:0, 전체종료:99)");
			tmp = scan.next();
			num = Integer.parseInt(tmp);
			
			if(num==1) {
				System.out.println(">>고객님은 김치찌개를 선택하셨습니다.");
			} else if(num==2) {
				System.out.println(">>고객님은 된장찌개를 선택하셨습니다.");
			} else if(num==3) {
				System.out.println(">>고객님은 삼겹살을 선택하셨습니다.");
			} else if(num==4) {
				System.out.println(">>고객님은 비빔밥을 선택하셨습니다.");
			} break;
		
		case 2:
			System.out.println("[양식메뉴]");
			System.out.print("(1)돈까스\n(2)비프스테이크\n(3)카레라이스\n");
			System.out.println("양식 메뉴를 선택하세요.(양식메뉴선택종료:0, 전체종료:99)");
			tmp = scan.next();
			num = Integer.parseInt(tmp);
			
			if(num==1) {
				System.out.println(">>고객님은 돈까스를 선택하셨습니다.");
			} else if(num==2) {
				System.out.println(">>고객님은 비프스테이크를 선택하셨습니다.");
			} else if(num==3) {
				System.out.println(">>고객님은 카레라이스를 선택하셨습니다.");
			} break;
			
		case 3:
				System.out.println("[중식메뉴]");
				System.out.print("(1)짜장면\n(2)짬뽕\n(3)탕수육\n");
				System.out.println("중식 메뉴를 선택하세요.(중식메뉴선택종료:0, 전체종료:99)");
				tmp = scan.next();
				num = Integer.parseInt(tmp);
				
				if(num==1) {
					System.out.println(">>고객님은 짜장면을 선택하셨습니다.");
				} else if(num==2) {
					System.out.println(">>고객님은 짬뽕을 선택하셨습니다.");
				} else if(num==3) {
					System.out.println(">>고객님은 탕수육을 선택하셨습니다.");
				} break;
		}
		
		if(num == 0) {
			System.out.println("메뉴선택으로 돌아갑니다.");
			continue;
		} else if(num == 99) {
			System.out.println("프로그램을 모두 종료합니다.");
			break outer;
		} else if(num<1 || num>3) {
			System.out.println("메뉴를 잘못 선택하셨습니다.(종료:0)");
			continue;
		}

		}		
		System.out.println("프로그램을 종료합니다.");
	}
}
