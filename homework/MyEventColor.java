package homework;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import ch17.MyColorAction;

public class MyEventColor extends JFrame {
	private JButton button1 ,button2, button3, button4;
	
	public MyEventColor() {
		setTitle("MyEventColor");
		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		button1 = new JButton("north");
		button2 = new JButton("east");
		button3 = new JButton("south");
		button4 = new JButton("west");
		
		
		add(button1, "North");
		add(button2, "East");
		add(button3, "South");
		add(button4, "West");
		
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.yellow));		
	}
	
	public static void main(String[] args) {
		new MyEventColor();		
	}
}
