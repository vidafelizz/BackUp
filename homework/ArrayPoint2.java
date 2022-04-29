package homework;

import java.util.Scanner;

public class ArrayPoint2 {
	public static void main(String[] args) {
		String[] name= new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] mat = new int[2];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2명의 학생의 국,영,수 점수를 각각 입력하세요.");
		for(int i=0; i<2; i++) {
			System.out.println("이름을 입력하세요 : ");
			name[i] = scan.next();
			System.out.println("국어점수를 입력하세요 : ");
			kor[i] = scan.nextInt();
			System.out.println("영어점수를 입력하세요 : ");
			eng[i] = scan.nextInt();
			System.out.println("수학점수를 입력하세요 : ");
			mat[i] = scan.nextInt();
			
		}
	
		double tot_avg=0;
		for(int i=0; i<2; i++) {
			int tot=kor[i]+eng[i]+mat[i];
			double avg = tot/3.0;
			tot_avg += avg;
			
			
			System.out.println("이름 : "+name[i]);
			System.out.println("국어 : "+kor[i]);
			System.out.println("영어 : "+eng[i]);
			System.out.println("수학 : "+mat[i]);
			System.out.println("총점 : "+tot);
			System.out.println(String.format("평균 : %.1f", avg));
			System.out.println();
		}
		System.out.println("================================");
		System.out.println("학급평균 : "+String.format("%.1f", tot_avg/2));
	}
}
