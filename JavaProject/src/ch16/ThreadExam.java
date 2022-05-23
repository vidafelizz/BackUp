package ch16;

// 멀티스레드: 작업단위가 2개 이상
// 구현방법 1: Thread 상속
// 구현방법 2: Runnable을 구현
public class ThreadExam extends Thread {
	public ThreadExam(String name) {
		super(name); // 부모클래스의 생성자 호출
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초 멈춤
		}
	}
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
		// e1.run(); // run()메서드를 직접 쓰면 안됨. start()메서드를 반드시 써야 함
		e1.start(); // 스레드객체.start() ==> run()이 자동 호출됨
		e2.start(); // 위와 동시에 호출
		e3.start(); // 위와 동시에 호출
	}
}
