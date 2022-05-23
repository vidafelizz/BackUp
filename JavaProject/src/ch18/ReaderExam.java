package ch18;

import java.io.InputStreamReader;
import java.io.Reader;

// InputStream : 1바이트 단위로 읽음, 대표적으로 System.in
// InputStreamReader : 문자 단위로 읽음
public class ReaderExam {
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in); // 리더가 inputstream 포함
		System.out.println("입력하세요 : ");
		try {
			while(true) {
				var = input.read(); // 1문자단위로 읽어들임
				if(var == 13) break;
				System.out.println(var + "==>" +(char)var);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
