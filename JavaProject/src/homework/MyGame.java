package homework;

import java.util.Random;
import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		Random r = new Random();
		String[] arr = {"가위", "바위", "보"};
		String com = arr[r.nextInt(3)];
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			System.out.println("가위,바위,보 중 하나를 입력하세요 : ");
			String s = sc.next();
			
			if(s.equals("exit")) {
				System.out.println("Game Exit...");
			} 
		
			switch(com) {
			case "가위":
				if(s.equals("바위")) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("지셨습니다. 컴퓨터는 " + com + "입니다.");
				}
				break;
				
			case "바위":
				if(s.equals("보")) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("지셨습니다. 컴퓨터는 " + com + "입니다.");
				}
				break;
			case "보":
				if(s.equals("가위")) {
					System.out.println("이겼습니다.");
				} else {
					System.out.println("지셨습니다. 컴퓨터는 " + com + "입니다.");
				}
				break;
			}
		}
	}
}

