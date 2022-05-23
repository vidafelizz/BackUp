package homework;

public class GuguDan3 {

	public static void main(String[] args) {
		for(int dan=1; dan<=9; dan++) {
			System.out.println();
			
			for(int n=1; n<=9; n++) {
				System.out.print(dan + " * " + n + " = " + dan*n + "\t");
			}
		}
	}
}
