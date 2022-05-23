package ch04;

public class If_Else_Ex1 {
	public static void main(String[] args) {
		
		int score = 90;
		String result = ""; //널문자로 초기화
		
		if(score >= 60 ) { // true
			result = "합격";
		} else { // false
			result = "불합격";
		}
		System.out.println(result);
	}
}
