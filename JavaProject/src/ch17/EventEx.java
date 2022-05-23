package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 이벤트 처리 3대요소: 이벤트 소스, 이벤트 클래스, 이벤트 리스너
public class EventEx extends Frame implements WindowListener{
	public EventEx() {
		addWindowListener(this); // 프레임에 이벤트리스너를 추가
		// (new ...)해서 하지않고 implements WindowListener를 상속받아 쓰면 (this)로도 사용가능
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EventEx();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	
		
	}
	

}
