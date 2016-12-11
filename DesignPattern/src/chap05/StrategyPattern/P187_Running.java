package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * �̹��� �����ؼ� �����ֱ� (��Ʈ��Ƽ�� ���� ����)
 * 
 * ��Ʈ��Ƽ�� ������ ������ Field ������ ��ü�� ���ڷ� �޾� �̸� �����Ŵ.
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
