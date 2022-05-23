package ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

// 클라이언트용 소켓
public class DataClient {
	public static void main(String[] args) throws Exception {
		// new Socket("IP주소", 포트번호);
		Socket s = new Socket("localhost", 9000);
		// 서버에서 accept()하면 통신 가능 상태로 들어감
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		// 서버에서 보낸 메시지를 받음
		String res = input.readLine();
		System.out.println(res);
		s.close();		// 소켓닫기(연결종료)
		System.exit(0); // 프로그램 종료
	}
}
