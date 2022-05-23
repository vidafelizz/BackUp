package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://google.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn != null) {
				conn.setConnectTimeout(3000); // 타임아웃 시간 설정
				StringBuilder sb = new StringBuilder();
				
				// 정상적으로 처리된 경우
				// http status code(상태코드)
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
					// 스트림을 사용해서 html source코드를 읽어옴
					// 입력 버퍼를 생성
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
					while(true) {
						String line = br.readLine();
						if(line == null) break; // 더 이상 내용이 없으면 탈출
						sb.append(line + "\r\n");
					}
					br.close();
				}
				conn.disconnect(); // http 연결 종료
				System.out.println(sb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
