package ch11;

public abstract class Shape { // 1개라도 추상멤버가 있으면 abstract화 함
	// 멤버변수
	int x,y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();
}
