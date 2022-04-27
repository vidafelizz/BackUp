package ch04;

public class Do_while_char {
	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c=(char)(c+1); //영문의 경우 1을 더하면 다음 문자의 코드값으로 자동 변환됨
			
		} while(c <= 'z');
	}
}
