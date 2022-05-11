package ch13;

// 인스턴스(객체)를 복제하려면 Cloneable 인터페이스를 implements해야 한다.
public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		try { // 예외가 발생할 가능성의 코드
			t2 = (Clone)t1.clone(); // 인스턴스를 복제함
			// clone()은 Object의 메서드이기 때문에 좌, 우변을 맞추기 위해 (Clone)형변환해야 한다.
			// 좌변(Clone):자식 = 우변(Object):부모
			
			
		} catch (CloneNotSupportedException e) { // 예외 발생
			e.printStackTrace(); // 개발자를 위한 디버깅 정보 제공
		
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}
}
