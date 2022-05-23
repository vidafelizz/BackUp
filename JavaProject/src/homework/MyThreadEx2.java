package homework;

public class MyThreadEx2 implements Runnable {
	String str;
	public MyThreadEx2(String str) {
		this.str=str;
	}
	public MyThreadEx2() {}
	
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(str);
		}
	}
}
