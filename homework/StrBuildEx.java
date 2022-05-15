package homework;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a");
		str1.append(" Java Programmer");
		System.out.println("append()메소드를 활용 : " + str1);
		
		str1.replace(7, 11, "JSP");
		System.out.println("replace()메소드를 활용: " +str1);
		
		String str2 = str1.substring(7);
		System.out.println("subString()메소드를 활용: "+str2);
		
	}
}
