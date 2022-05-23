package ch19;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketExam {
	public static void main(String[] args) {
		// 서버소켓: 서버에서 서비스를 위한 목적으로 만드는 소켓
		ServerSocket socket = null; // 서버용 소켓
//		Socket cSocket = null;		// 클라이언트용 소켓
		
		// 포트(port)번호 : 0~65535 내에 배정이 가능하고 중복되지 않아야함
		// 1 port당 1 service 원칙
		// well Konown port number(자주 사용하는 포트 번호)
		// 80 : 웹서비스, 21: ftp서비스, 445: 파일공유, 3389: 원격접속...
		
		for(int i=0; i<=65535; i++) {
			try {
				socket = new ServerSocket(i); // 서버 소켓 생성
				socket.close();
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
				// 사용중인 포트는 피해서 사용한다.
			}
		}
	}
}
