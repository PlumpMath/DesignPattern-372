package chap05.StrategyPattern;

import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * JPanel�� ��ӹ޾� ���� ���� �����̴� Ŭ������, paint �Լ��� ����� �ʴ� 30���� ���� �ѷ���
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_Field extends JPanel implements Runnable {
	private static final long serialVersionUID = 2275203180075024866L;
	private P181_Ball[] balls;
	
	public P181_Field(P181_Ball[] balls) {
		this.balls = balls;
		setLayout(new FlowLayout());
	}
	
	public void paint(Graphics g){
		g.clearRect(0, 0, P181_BallFrame.WIDTH, P181_BallFrame.HEIGHT);
		
		for (int i = 0; i < balls.length; i++) {
			g.setColor(balls[i].getColor());
			g.fillOval(balls[i].getX(), balls[i].getY(), P181_Ball.SIZE, P181_Ball.SIZE);
		}		
	}
	
	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
