package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 이미지 셋팅 (스트래티지 패턴 적용) - Context 클래스 역할
 *
 * 새로운 이미지를 추가하려면 이번 코드를 수정해야함.
 * 이는 코드가 OCP를 따르지않고 설계되었기 때문.
 * 이를 해결하려면 새로운 이미지 처리 기능을 스트래티지 패턴을 사용해 추가해야함.
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
