package ch14;

public class Box {
	private Object data;
	
	public void set(Object data) {
		this.data= data;	
	}
	public Object get() { // 리턴타입이 object
		return data;
	}
	
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello~"); // 문자열 처리가능 ~ 모든 타입 가능
		String s = (String)b.get(); // String = Objext
		
		Box c = new Box();
		c.set(30);
		Integer i = (Integer)b.get(); // Class객체 = Object조상객체
		
		System.out.println(s);
		System.out.println(i);
	}

}
