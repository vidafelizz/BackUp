package ch16;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		// 각각의 객체 생성
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer kang = new MusicPlayer(3, box);
		
		// 실행
		kim.start(); // start()가 run()메서드를 자동 호출
		lee.start();
		kang.start();
	}
}
