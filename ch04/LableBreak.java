package ch04;

public class LableBreak {
	public static void main(String[] args) {
		exit_for : //라벨
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				// if(j==3) break;
				if(j==3) break exit_for; // 바깣쪽 for문까지 빠져나감
				System.out.println(i + "," + j);
			
			}
		}

	}

}
