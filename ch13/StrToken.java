package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		// 콤마, tab, /를 주어서 데이터를 구분
		String str = "kim,20,180,55,서울,학생";
		String[] items = str.split(",");
		for(String s : items) {
			System.out.println(s);
		}
		
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens(); // 토큰의 개수
		System.out.println("토큰의 개수: " + cnt);
		
		while(st.hasMoreElements()) { //다음 요소의 내용이 있으면 무한반복
			System.out.println(st.nextToken());
			
		}
	}

}
