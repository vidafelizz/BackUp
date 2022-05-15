package homework;

public class AutoBox2 {
public static void main(String[] args) {
		
	int num1 = 30;
	double num2;
	int num3;
	
	Integer i1;
	Double i2 = new Double(40.3);
	Integer i3 = 50;
	
	i1 = num1;
	num2 = i2; 
	num3 = i3;
	
	System.out.println("기본자료형 : " + num1 + ", 객체자료형 : " + i1);
	System.out.println("기본자료형 : " + num2 + ", 객체자료형 : " + i2);
	System.out.println("기본자료형 : " + num3 + ", 객체자료형 : " + i3);

	}
}
