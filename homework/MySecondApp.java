package homework;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MySecondApp extends JApplet implements ActionListener{
	// 메뉴 생성
	private JMenuItem mie = new JMenuItem("Exit");
	// 센터에 글씨 생성
	private Font font;
	private FontMetrics fm;
	private int x,y;
	private String message;
	private Dimension dim;
	// 오디오 버튼
	private AudioClip audio;
	private JButton play, stop, loop;
	
	public MySecondApp() {
		createMenu();
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu jm = new JMenu("File"); 
		jm.add(new JMenuItem("Open")); 
		jm.add(new JMenuItem("Save"));
		jm.add(new JMenuItem("Print"));
		jm.addSeparator(); 
		jm.add(mie);
		mb.add(jm); 
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Project")); 
		mb.add(new JMenu("Run")); 
			
		setJMenuBar(mb);
		mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
	}

	@Override
	public void init() {
		
		setLayout(new FlowLayout());
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		
		play = new JButton("play");
		play.setBackground(Color.orange);
		loop = new JButton("loop");
		loop.setBackground(Color.lightGray);
		stop = new JButton("stop");
		stop.setBackground(Color.red);
		add(play);
		add(loop);
		add(stop);
		
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
		
		message = "Music Player";
		font = new Font("고딕", Font.ITALIC, 40);
		fm = getFontMetrics(font); 
		setSize(300, 300);
		dim = getSize(); 
		System.out.println(dim.width); 
		System.out.println(dim.height);
		
		x = (dim.width/2)-(fm.stringWidth(message)/2); 
		y = (dim.height/2)-(fm.getDescent()/2); 
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);
		g.setColor(Color.DARK_GRAY);
		g.drawString(message, x, y);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		} else if(btn == stop) {
			audio.stop();
		} else if(btn == loop) {
			audio.loop();
		}
		if(e.getActionCommand().equals("stop")) {
			JOptionPane.showMessageDialog(null, "노래를 멈추시겠습니까?", "멈춤",
													JOptionPane.OK_CANCEL_OPTION);
			System.exit(0);
		}
	}
}