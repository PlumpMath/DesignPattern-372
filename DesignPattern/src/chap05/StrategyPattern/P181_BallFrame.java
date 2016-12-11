package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * JFrame을 상속받아 프로그램 전체의 프레임을 구성하는 클래스
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_BallFrame extends JFrame {
	private static final long serialVersionUID = 8285989344675891790L;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 400;
	private P181_Field field;
	
	public P181_BallFrame(P181_Ball[] balls) {
		super("Balls~");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		field = new P181_Field(balls);
		Thread th = new Thread(field);
		th.start();
		
		add(field, BorderLayout.CENTER);
		
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	
}
