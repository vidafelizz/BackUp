package homework;

public class MyThreadUse2 {
	public static void main(String[] args) {
		MyThreadEx2 t1 = new MyThreadEx2("스레드1**");
		MyThreadEx2 t2 = new MyThreadEx2("스레드2++");
		MyThreadEx2 t3 = new MyThreadEx2("스레드3##");

		Thread e1=new Thread(t1);
		Thread e2=new Thread(t2);
		Thread e3=new Thread(t3);
		
		e1.setPriority(Thread.MAX_PRIORITY);
		e3.setPriority(Thread.MIN_PRIORITY);
		
		e1.start();
		e2.start();
		e3.start();
	}
}
