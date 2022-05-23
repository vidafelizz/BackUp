package ch19;

import java.net.URL;

public class URLInfo {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://cafe.naver.com/jaspresso?iframe_url=/MyCafeIntro.nhn%3Fclubid=30704603"); 
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트 : " + url.getPort());
			System.out.println("호스트 : " + url.getHost());
			System.out.println("파일 : " + url.getFile());
			System.out.println("기타 : " + url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
