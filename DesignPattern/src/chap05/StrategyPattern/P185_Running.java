package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * 이미지 연속해서 보여주기
 * 
 * @author assu
 * @date 2016. 12. 11.
 */
public class P185_Running extends JFrame {
	/**	 */
	private static final long serialVersionUID = 269392471352787015L;
	private P185_Field field;
	
	public P185_Running() {
		super("Running~");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		field = new P185_Field();
		
		add(field, BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
		
		Thread th = new Thread(field);
		th.start();
	}
}
