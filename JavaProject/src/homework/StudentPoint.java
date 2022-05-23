package homework;

public class StudentPoint {
	
	static String[] name = {"홍길동", "이몽룡", "이순신"};
	static int[] kor = {80,90,100};
	static int[] eng = {90,70,80};
	static int[] mat = {83,66,87};
	static int[] tot = {0,0,0};
	static double[] avg = {0.0,0.0,0.0};
	
	static void getTot() { // 총점 계산
		for(int i=0; i<3; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
		}
	}
	static void getAvg() { // 평균 계산
		for(int i=0; i<3; i++) {
			avg[i] = tot[i]/3.0;
		}
	}
	static void print() { // 결과 출력
		System.out.println("전체학생 수 : " + name.length);
		System.out.println("------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("------------------------------------------------------");
		for(int i=0; i<3; i++) {
			System.out.println(1001+i+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
			
		}
		System.out.println("------------------------------------------------------");
	}
	public static void main(String[] args) {
		getTot(); // 총점계산
		getAvg(); // 평균계산
		print(); // 출력
	}

}
