package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * �̹��� ���� (��Ʈ��Ƽ�� ���� ����) - Context Ŭ���� ����
 *
 * ���ο� �̹����� �߰��Ϸ��� �̹� �ڵ带 �����ؾ���.
 * �̴� �ڵ尡 OCP�� �������ʰ� ����Ǿ��� ����.
 * �̸� �ذ��Ϸ��� ���ο� �̹��� ó�� ����� ��Ʈ��Ƽ�� ������ ����� �߰��ؾ���.
 * 
 * @author assu
 * @date 2016. 12. 11.
 */
public class P187_Field extends JPanel implements Runnable {
	/**	 */
	private static final long serialVersionUID = -8740665436406110602L;
	private JLabel lbl;
	private P187_MovingStrategy strategy = new P187_WalkingStrategy();
	
	public void setMovingStrategy(P187_MovingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public P187_Field() {
		setLayout(new BorderLayout());
		lbl = new JLabel();
		add(lbl, BorderLayout.CENTER);		
	}
	
	@Override
	public void run() {
		strategy.drawImages(lbl);
	}

}
