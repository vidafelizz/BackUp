package homework;

import java.util.Scanner;

public class JumSoo {

	public static void main(String[] args) {
		String name;
		int Java, HTML, JSP, DB, tot;
		double avg;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 : ");
		name = scan.next();
		System.out.println("Java 점수 : ");
		Java = scan.nextInt();
		System.out.println("HTML 점수 : ");
		HTML = scan.nextInt();
		System.out.println("JSP 점수 : ");
		JSP = scan.nextInt();
		System.out.println("DB 점수 : ");
		DB = scan.nextInt();
		scan.close();
		
		tot = Java + HTML + JSP + DB;
		avg = tot / 4.0;
		
		System.out.println("이름\tJava\tHTML\tJSP\tDB\t총점\t평균");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%4.1f" , name, Java, HTML, JSP, DB, tot, avg);
		
		scan.close();
	}

}
