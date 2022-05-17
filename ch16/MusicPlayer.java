package ch16;

public class MusicPlayer extends Thread {
	// 멤버변수
	int type;
	MusicBox musicBox; // 객체도 객체형 데이터 타입이 될 수 있음
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	
	@Override
	public void run() { // 오버라이딩의 의미: 재정의
		switch (type) {
		case 1: musicBox.playMusicA();
			break;
		case 2: musicBox.PlayMusicB();
			break;
		case 3: musicBox.PlayMusicC();
			break;
		}
	}
}
