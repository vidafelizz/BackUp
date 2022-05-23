package ch05;
// 대학생 성적 
public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {
				{3.3, 3.6}, // 1학년 1,2학기 평점
				{3.5, 3.2}, // 2학년
				{3.7, 4.0}, // 3학년
				{4.1, 4.2} // 4학년
				}; 
		double sum = 0.0;
		for(int year = 0; year <score.length; year++) {
			for(int term = 0; term<score[year].length; term++) {
				// 각 학년의 학기별로 반복
				sum += score[year][term]; // 전체 평점 합
			} 
		}
		int n = score.length; // 배열의 행 개수 4
		int m = score[0].length; // 배열의 열 개수
		System.out.println("4학년 전체 평점 평균은 " + sum/(n*m));
		
	}

}
