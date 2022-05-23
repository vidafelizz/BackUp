package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
// JApplet은 Applet의 확장판으로 1995년에 처음 소개됨
// 애플릿뷰어나 웹브라우저와 함께 쓰였으며 게임 및 다양한 그래픽을 구사할 수 있다.
// 현재는 HMNL5등 웹이 진화되면서 거의 활용되지 않는다.
// 라이프사이클을 가지고 있다. init()-start()-stop()-destroy()
// init()은 필수처리하고, 나머지는 필요에 따라 (페이지 이동, 강제 종료)

public class StringLine extends JApplet {
	@Override
	public void init() { // 애플릿을 초기화하는 코드. 필수
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(300, 300);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		// 선 그리기
		g.drawLine(250, 50, 30, 160);
		g.setColor(Color.red);
		g.drawString("Red", 10, 50);
		g.setColor(getBackground());
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}
}
