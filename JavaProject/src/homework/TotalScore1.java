package homework;

import java.util.Scanner;

public class TotalScore1 {

	public static void main(String[] args) {
		int kor,eng,mat,tot;
		double avg;
		String grade;
		String score = "";
		
		for(int i=1; i<=3;i++) {
			Scanner in = new Scanner(System.in);
			System.out.print("국어 점수 : ");
			kor = in.nextInt();
			System.out.print("영어 점수 : ");
			eng = in.nextInt();
			System.out.print("수학 점수 : ");
			mat = in.nextInt();
			System.out.println();
			
			tot = kor+eng+mat;
			avg = tot/3.0;
			
			switch((int)(avg/10)) { // double을 int로 변환
			case 10:
			case 9:
				grade = "수";
				break;
			case 8:
				grade = "우";
				break;
			case 7:
				grade = "미";
				break;
			case 6:
				grade = "양";
				break;
			default:
				grade = "가";
				
			}
			score += String.format("%d\t%d\t%d\t%d\t%.1f\t%s\n", kor,eng,mat,tot,avg,grade);
			
	}
		System.out.println();
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------");
		System.out.print(score);

}
}