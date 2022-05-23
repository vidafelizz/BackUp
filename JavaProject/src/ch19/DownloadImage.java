package ch19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) throws Exception {
		String website = "https://cafe.naver.com/MyCafeIntro.nhn?clubid=30704603";
		
		System.out.println("다운로드를 시작합니다.");
		URL url = new URL(website); // url생성
		byte[] buffer = new byte[2048]; // 버퍼용 바이트 배열 [2mb]
		// 파일로 저장 <== 프로그램 <== 서버의 이미지 파일
		
		// try~with문
		// try(리소스 선언부){ } catch(Exception e){ }
		// finally가 없어도 리소스를 자동으로 종료시킴
		try(InputStream in = url.openStream(); OutputStream out = new FileOutputStream("c:\\test\\test.jpg")) {
			int length = 0; // 읽은 바이트 수 리턴
			while((length = in.read(buffer)) != -1) {
				System.out.println(length + "바이트 읽음");
				// 출력스트림.write(버퍼, 시작인덱스, 길이)
				out.write(buffer, 0, length );
			}
			System.out.println("다운로드가 완료되었습니다.");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
