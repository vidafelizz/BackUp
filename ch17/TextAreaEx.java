package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(6, 20); // 6행 20열의 입력창 생성
	
	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		c.add(tf);
		c.add(new JScrollPane(ta)); // 스크롤이 되는 패널에 textarea를 추가
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+"\n");
				// 텍스트필드의 문자열을 textarea영역으로 옮김
				t.setText(""); // 현재 텍스트필으데 입력된 내용을 지움
			}
		});
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
