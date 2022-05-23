package ch05;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] list = {10, 20, 30, 40, 50} ;
		//배열복사 방법1
		int[] numbers = list;
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		// 배열복사 방법2
		int[] list_copy = Arrays.copyOf(list, list.length);
		for(int value : list_copy) {
			System.out.println(value);
		}
	}
}
