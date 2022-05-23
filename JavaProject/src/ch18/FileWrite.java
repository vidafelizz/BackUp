package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWrite {
	public static void main(String[] args) {
		// 프로그램 ==> 파일(output출력스트림을 씀)
		OutputStream os = null;
		try {
			os = new FileOutputStream("c:\\test\\aa.txt"); // "" 안에 \를 표현할땐 \\두개써야함
			System.out.println("입력하세요 : ");
			while(true) {
				int ch = System.in.read(); // 1byte
				if(ch==13) break; // 엔터키(13)를 만나면 종료
				os.write(ch); // 파일에 입력된 값이 저장
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
