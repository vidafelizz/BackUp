package homework;

public class MyThreadEx1 extends Thread {

	public MyThreadEx1(String str) {
		super(str);
	}
	public MyThreadEx1() {}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());	
		}
	}
}
