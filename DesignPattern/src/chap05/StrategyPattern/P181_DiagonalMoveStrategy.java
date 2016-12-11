package chap05.StrategyPattern;

/**
 * DirectionStrategy �߻�Ŭ������ ��ӹ޾� 
 * ���� ����, ����, �밢�� �������� ���� �������� �����ϴ� ���� Ŭ����
 *
 * �밢��
 * 
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_DiagonalMoveStrategy extends P181_DirectionStrategy {

	@Override
	public void move(P181_Ball ball) {
		// ���� �������� ������.
		ball.setIntervals(P181_Ball.INTERVAL, P181_Ball.INTERVAL);
		
		while(true) {
			// �밢�� �������� ���� ũ�⸸ŭ ���� �̵���.
			ball.setX(ball.getX() + ball.getxInterval());
			ball.setY(ball.getY() + ball.getyInterval());
			
			// �������� ��迡 �������� �� ���� ��������� �ٲ�
			if ((ball.getX() < 0 && ball.getxInterval() < 0
					|| ball.getX() + P181_Ball.SIZE > P181_BallFrame.WIDTH - 15 && ball.getxInterval() > 0)) {
				ball.setIntervals(-ball.getxInterval(), ball.getyInterval());
			}
			
			if ((ball.getY() < 0 && ball.getyInterval() < 0
					|| ball.getY() + P181_Ball.SIZE > P181_BallFrame.HEIGHT - 40 && ball.getyInterval() > 0)) {
				ball.setIntervals(ball.getxInterval(), -ball.getyInterval());
			}
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
		}
	}
}
