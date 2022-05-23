package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		// 큐 구조: FIFO(First in First out)
		// 입력: offer, 출력 poll
		String[] fruits = {"사과", "배", "포도", "딸기", "수박"};
		LinkedList list = new LinkedList();
		for(String str : fruits) {
			list.offer(str); // 큐 구조에 자료 입력
		}
		String str = "";
		while((str=(String)list.poll()) != null) {
			System.out.println(str+" 삭제되었습니다.");
		}
	}
}
