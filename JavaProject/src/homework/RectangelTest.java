package homework;

import java.util.Scanner;

public class RectangelTest {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("직사각형의 가로 길이를 입력하세요.");
	double width = input.nextDouble();
	
	System.out.println("직사각형의 가로 길이를 입력하세요.");
	double hight = input.nextDouble();
	
	System.out.printf("직사각형의 넓이는 " + width * hight + "입니다.");

	input.close();
		
	}

}
