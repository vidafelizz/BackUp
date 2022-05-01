package ch05;

public class ArrayChar {
	public static void main(String[] args) {
			
//		char[] ch= {'J','a','V','a'};
		
		char[] ch;
		ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'V';
		ch[3] = 'a';
		
		
		for(int i =0; i<ch.length; i++) {
			System.out.println(i+"번째 문자 : "+ch[i]);
		}
	}

}
