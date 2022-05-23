package ch04;

public class ContineEx1 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			if(i%5==0) continue; //이하 코드 무시, 다음 단계로
			System.out.println(i);
		}

	}

}
