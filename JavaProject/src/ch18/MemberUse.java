package ch18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MemberUse {
	public static void main(String[] args) {
		FileOutputStream fos=null;//파일저장을 위한 출력 스트림
		ObjectOutputStream oos=null;//메모리에 있는 객체를 파일로 저장하기 위한 스트림
		MemberDTO m1=new MemberDTO("kim", "김길동", "1234", 30, "kim@gmail.com");
		MemberDTO m2=new MemberDTO("lee", "이길동", "1234", 20, "lee@gmail.com");
		MemberDTO m3=new MemberDTO("park", "박길동", "1234", 40, "park@gmail.com");
		
		try {
			fos=new FileOutputStream("c:\\test\\object.dat");
			//직렬화(Serialization) : 메모리=>프로그램=>파일
			oos=new ObjectOutputStream(fos);
			oos.writeObject(m1);//m1객체를 파일에 저장
			oos.writeObject(m2);//m1객체를 파일에 저장
			oos.writeObject(m3);//m1객체를 파일에 저장
			System.out.println("객체를 파일로 저장했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}		

		//역직렬화(deSerialization) : 파일=>프로그램=>메모리
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {				
			fis=new FileInputStream("c:\\test\\object.dat");
			ois=new ObjectInputStream(fis);
			MemberDTO dto1=(MemberDTO)ois.readObject();
			MemberDTO dto2=(MemberDTO)ois.readObject();									
			MemberDTO dto3=(MemberDTO)ois.readObject();
					
			System.out.println(dto1);
			System.out.println(dto2);
			System.out.println(dto3);			
		} catch (Exception e) {					
			e.printStackTrace();
		}		
	}
}