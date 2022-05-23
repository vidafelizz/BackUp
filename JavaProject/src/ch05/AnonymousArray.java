package ch05;

public class AnonymousArray {
	public static void main(String[] args) {
		System.out.println("숫자들의 합 : " + sum(new int[] {1,2,3,4}));
		// 무명배열 : 참조변수의 이름이 없는 배열 => 단순히 초기값만으로 배열을 생성
		// 무명배열은 즉시 배열을 만들어 함수의 인수(=매개변수)로 전달할 때 쓰며 배열이 딱 한번만 필요하고
		// 다시는 참조할 일이 없을 때 사용할 수 있음 (1회용이란 말임)
	}

	public static int sum(int[] numbers) {
		int total = 0;
		for(int i=0; i<numbers.length; i++) {
			total = total+numbers[i];
		}
		return total;
	}
}
