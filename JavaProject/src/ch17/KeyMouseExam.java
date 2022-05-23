package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
// MouseListener : 마우스 이벤트 처리를 위한 인터페이스
// MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
// KeyListener : 키보드이벤트 처리

public class KeyMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
	
	private int x, y; // 이미지를 출력할 x,y 좌표값
	private int width, height; // 가로, 세로 사이즈
	private Image img; // 이미지car.gif사용할 변수
	private boolean flag = false; // 이미지가 처음 실행할 땐 안보이게
	
	@Override
	public void init() {
		
		setSize(300, 300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true); // 키를 입력받을 수 있도록 설정
		requestFocus(); // 현재화면에 키 입력을 요청
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 이미지의 가로, 세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width + "," + height);
		
		if(flag) { // 마우스 클릭시 true로 설정
			g.drawImage(img, x, y, this);
			// drawImage(이미지, x, y, 이미지관찰자);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// 키가 눌러져있을 때에 호출
		System.out.println(e.getKeyCode()); // 키 코드값
		System.out.println(e.getKeyChar());
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y = Math.max(0, y-5);
			break;
		case KeyEvent.VK_DOWN:
			y = Math.min(300-height, y+5);
			break;
		case KeyEvent.VK_LEFT:
			x = Math.max(0, x-5);
			break;
//		case KeyEvent.VK_RIGHT: // 오른쪽 키
//			x = Math.min((300-width, x+5);
//			break;
		}
		repaint(); // 그래픽 갱신 요청
	}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x:" + x + ", y:" + y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스 커서가 컴퍼넌트 상에 이동했는데 버튼이 작동하지 않은 경우에 호출
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move : x:" + x + ", y:" + y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 컴포넌트 상에서 마우스 버튼을 클릭(눌렀다 뗄때)했을 때에 호출
		flag = true; // 클릭할 때 그림을 true로 설정해서 보여지게 함
		// 마우스 클릭한 좌표
		x = e.getX();
		y = e.getY();
		repaint(); // 그래픽 갱신 요청 => paint()가 자동 호출 됨
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스 버튼을 누를 때 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 컴퍼넌트 상에서 마우스 버튼을 떼어 놓아질 때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 컴퍼넌트 안에 들어갔을 때 호출
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴퍼넌트에서 빠져나올 때 호출
	}	
}
