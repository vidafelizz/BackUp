package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventEx2 extends JFrame {
	private JButton button1, button2, button3, button4, button5, button6;
	
	public EventEx2() {
		// 플로우 레이아웃으로 변경
		setLayout(new FlowLayout());
		button1 = new JButton("Red"); // 버튼 생성
		button2 = new JButton("Green");
		button3 = new JButton("Blue");
		button4 = new JButton("White");
		button5 = new JButton("Yellow");
		button6 = new JButton("Cyan");
		
		// 프레임에 버튼 추가
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		// 버튼에 이벤트 기능 추가
		// 이벤트 핸들러를 외부클래스 생성 및 호출
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
	
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	}
	public static void main(String[] args) {
		new EventEx2();
	}
}
