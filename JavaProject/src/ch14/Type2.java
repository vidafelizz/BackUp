package ch14;

public class Type2 {
	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		System.out.println(t.getValue());
		
		t.setValue(10);
		System.out.println(t.getValue());
		
		t.setValue(10.5);
		System.out.println(t.getValue());
		// 오브젝트로 모든걸 처리한다
	}

}
