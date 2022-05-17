package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameExam {
	public static void main(String[] args) {
		Frame f = new Frame("프레임 제목"); // 윈도우창과 같은 화면을 띄우는 클래스
		f.setSize(200, 300);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
	}
}
