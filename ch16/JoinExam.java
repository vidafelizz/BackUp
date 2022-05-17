package ch16;

public class JoinExam {
	public static void main(String[] args) {
		MyThread3 thread = new MyThread3();
		thread.start();
		System.out.println("Thread가 종료될때까지 기다립니다.");
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread가 종료되었습니다.");
	}
}
