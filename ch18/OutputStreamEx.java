package ch18;

import java.io.OutputStream;
import java.io.PrintStream;

public class OutputStreamEx {
	public static void main(String[] args) {
		// 콘솔창에 별도의 스트림값을 출력하기 위해 System클래스의 out이라는 static멤버
		// PrintStream 객체 참조값이 들어있는 점을 활용
		PrintStream ps = System.out;
		OutputStream os = ps; // PrintStream객체를 부모타입인 OutputStream으로 받아 처리한다.
		
		// OutputStream도 1byte처리 스트림이다. 따라서 한글 지원 안됨
		try {
			os.write(97); // a
			os.write(98);
			os.write(99);
			os.flush(); // flush()메서드를 써야 출력까지 된다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
