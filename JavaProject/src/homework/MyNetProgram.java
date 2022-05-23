package homework;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.util.Enumeration;

public class MyNetProgram {
	public static void main(String[] args) {
		System.out.println("1) 나의 랜카드 정보: ");
		try {
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			while (enu.hasMoreElements()) {
				NetworkInterface net = enu.nextElement();
				System.out.println(net);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("2) naver.com의 서버들");
		try {
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(int i=0; i<address.length; i++) {
				System.out.println(address[i]);
			}
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("3) naver.com의 호스트이름과 IP번호");
		try {
			InetAddress address = InetAddress.getByName("naver.com");
			System.out.println("naver.com의 호스트이름 : " + address.getHostName());
			System.out.println("메인 IP번호 : " + address.getHostAddress());
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("4) 나의 사용 port번호들");
		ServerSocket socket = null; //서버용 소켓
		for(int i=0; i<=65535; i++) {
			try {
					socket = new ServerSocket(i);
					socket.close();
			} catch (Exception e) {
				System.out.println(i + "번 포트는 사용중입니다.");
			}
		}	
	}
}
