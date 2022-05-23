package ch05;

public class ArrayTest2 {
	public static void main(String[] args) {
		int sum=0;
		float average = 0f;
		int[] score = {100, 88, 100, 100, 90}; // 항상 배열은 같은 타입을 적어야함(나중엔 다른 타입 배열처리하는 법 있음)
		for(int i=0; i<score.length; i++) {
			sum += score[i]; //sum = sum+score[i]
		}
		average = (float)sum/score.length; //score.length = 5개
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average); 
	}

}
