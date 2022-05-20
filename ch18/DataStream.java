package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStream {
	public static void main(String[] args) {
		try {
			DataOutputStream dataout = new DataOutputStream(
					new FileOutputStream("c:\\test\\test.dat"));
			dataout.writeInt(123);	 // 숫자 형식의 자료를 파일에 저장
			dataout.writeChar('A');  // 문자 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);// 실수 형식의 자료를 파일에 저장
			dataout.close(); 		 // 스트림 닫기(파일이 완성됨)
			System.out.println("저장되었습니다.");
			
			// 이진 파일을 읽기 위한 객체
			DataInputStream datain = new DataInputStream(
					new FileInputStream("c:\\test\\test.dat"));
			// 이진파일로 저장된 데이터를 콘솔
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
