package ch18;

import java.io.RandomAccessFile;

public class RandomFile {
	public static void main(String[] args) {
		String str=null;
		try { //r:읽기전용, w:쓰기전용, rw:읽기,쓰기
			RandomAccessFile file=new RandomAccessFile("c:\\test\\rand.txt", "rw");//읽기쓰기 모드
			//getFilePointer() : 파일포인터(파일을 어디까지 읽었는지 가리킴)
			System.out.println(file.getFilePointer());//0
			file.seek(8);//8번째 인덱스 부터
			System.out.println(file.getFilePointer());//8
			//스트링.getBytes() : 문자열을 바이트배열로 변환
			file.write("HTML".getBytes());//인덱스8번 위치에서 기존내용을 덮어쓰게된다.
			//(포인터의 위치를 옮기는 메소드)
			System.out.println(file.length());//문자길이(한글은 3바이트의 길이값을 가짐)
			System.out.println(file.getFilePointer());
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일포인터의 위치값이 적으면 반복
				str=file.readLine();
				//iso-8859-1, 8859_1 (2byte) : 서유럽언어 인코딩 방식
				//ms949(2바이트)
				//utf-8 (3바이트) : 초성(1byte), 중성(1byte), 종성(1byte)
				//new String(문자열, 캐릿터셋) : 인코딩방식 변환
				str=new String(str.getBytes("8859_1"), "utf-8");
			}
			System.out.println(file.length());
			System.out.println(file.getFilePointer());
			file.close();//파일 저장시점
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
