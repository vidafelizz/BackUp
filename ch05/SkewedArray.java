package ch05;

// 비정방형 배열(가변형, 래그드배열)
// 각행의 열의 개수가 다른 배열

public class SkewedArray {
	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		intArray[0] = new int[3]; //첫째 행의 3개의 열 생성
		intArray[1] = new int[2]; //둘째 행의 2개의 열 생성
		intArray[2] = new int[3]; //셋째 행의 3개의 열 생성
		intArray[3] = new int[2]; //넷째 행의 2개의 열 생성
		
		for(int i=0; i<intArray.length; i++) { // 행에 대한 반복
			for(int j=0; j<intArray[i].length; j++) { // 열에 대한 반복
				intArray[i][j] = (i+1)*10 + j; // 비정방형 배열에 데이터로 활용
			}
		}
		
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+" "); // 활용된 데이터를 출력 용도
			} // inner for
			System.out.println();
		} //outer for
	}

}
