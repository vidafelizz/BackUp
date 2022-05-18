package homework;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFirstApp extends JFrame{
	
	public MyFirstApp() {
		super("커피 메뉴");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		panel.setBackground(Color.darkGray);
		panel1.setBackground(Color.yellow);
		panel2.setBackground(Color.orange);
		
		JLabel label = new JLabel("주문하려는 커피를 선택하세요");
		panel1.add(label);
		
		JButton button1 = new JButton("아메리카노");
		JButton button2 = new JButton("카페라떼");
		JButton button3 = new JButton("에스프레소");
		JButton button4 = new JButton("바닐라라떼");
		JButton button5 = new JButton("종료");
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel, "Center");
		
		ActionListener handler = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("아메리카노")) {
					JOptionPane.showMessageDialog(null,"아메리카노 \n가격: 3500원", "",
														JOptionPane.INFORMATION_MESSAGE);
				} else if(e.getActionCommand().equals("카페라떼")) {
					JOptionPane.showMessageDialog(null, "카페라떼 \n가격: 4000원", "",
															JOptionPane.WARNING_MESSAGE);
				} else if(e.getActionCommand().equals("에스프레소")) {
							JOptionPane.showMessageDialog(null, "에스프레소 \n가격: 3000원", "",
															JOptionPane.DEFAULT_OPTION);
				} else if(e.getActionCommand().equals("바닐라라떼")) {
					JOptionPane.showMessageDialog(null, "바닐라라떼 \n가격: 4500원", "",
															JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("종료")) {
							JOptionPane.showMessageDialog(null, "프로그램을 정말 종료하시겠습니까?", "종료",
														JOptionPane.OK_CANCEL_OPTION);
							System.exit(0);
				}
			}
		};
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);			
		button5.addActionListener(handler);			
	}
	public static void main(String[] args) {
		new MyFirstApp();
	}
}
