package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame{

	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g); // JFrame의 paint()가 실행됨
		// drawString("문자열", x좌표, y좌표) : 문자열을 그래픽형태로 출력해주는 메서드
		g.drawString("hello java", 10, 60);
		g.drawOval(30, 100, 50, 50); // drawOval(x좌표, y좌표, w, h)
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
		g.drawRect(100, 200, 60, 60);
		g.setColor(Color.yellow);
		g.fillOval(200, 200, 60, 60);
		System.out.println("paint 호출...");
	}
	public static void main(String[] args) {
		new PaintExam();
	}
}
