package ch05;

public class ArgsEx {
	public static void main(String[] args) { // args 배열참조변수
		for(int i=0; i<args.length; i++) { 
			System.out.println(i+"번째 매개변수:"+args[i]);
		}
	}

}
