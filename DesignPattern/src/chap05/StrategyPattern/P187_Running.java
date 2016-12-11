package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * 이미지 연속해서 보여주기 (스트래티지 패턴 적용)
 * 
 * 스트래티지 패턴이 설정된 Field 스레드 객체를 인자로 받아 이를 실행시킴.
 * 
 * @author assu
 * @date 2016. 12. 11.
 */
public class P187_Running extends JFrame {
	/**	 */
	private static final long serialVersionUID = -478251418061910005L;
	
	public P187_Running(P187_Field field) {
		super("Running~");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		add(field, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		
		Thread th = new Thread(field);
		th.start();
	}
}
