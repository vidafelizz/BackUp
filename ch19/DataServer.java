package ch19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

// 서버용 프로그램
public class DataServer {
	public static void main(String[] args) throws Exception {
		// 서버 소켓
		ServerSocket ss = new ServerSocket(9000);
		System.out.println("서비스가 시작되었습니다.");
		while(true) {
			// 클라이언트 소켓
			// accept() : 클라이언트가 접속할 때까지 대기 상태
			// 접속하면 소켓 연결
			Socket socket=ss.accept();
			PrintWriter out=new PrintWriter(socket.getOutputStream(), true);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			String str=sdf.format(new Date()); // Date() 시스템 날짜
			out.print(str); // 클라이언트에게 데이터를 전송
			socket.close(); // 소켓 종료(연결 종료)
		}
	}
}