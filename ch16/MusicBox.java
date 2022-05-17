package ch16;

public class MusicBox {
	// 메서드 앞에 synchronized를 붙이면 해당메서드는 객체의 사용권(Monitoring Lock)을 얻는다.
	// 해당 메서드가 완전히 끝나고 나서 다른 메서드가 실행될 수 있다.
	public synchronized void playMusicA() {
		for(int i=0; i<10; i++) {
			System.out.println("신나는 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void PlayMusicB() {
		for(int i=0; i<10; i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void PlayMusicC() {
		for(int i=0; i<10; i++) {
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
