package ch04;

public class BreakEx2 {

	public static void main(String[] args) {
		int i=1;
		while(i<10) { // 1~9까지 반복
			if(i==5) break;
			System.out.println("i=" +i);
			i++;		
		}
		System.out.println("**반복문 종료**");
	}

}
