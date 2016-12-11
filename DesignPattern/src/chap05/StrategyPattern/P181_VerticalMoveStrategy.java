package chap05.StrategyPattern;

/**
 * DirectionStrategy �߻�Ŭ������ ��ӹ޾� 
 * ���� ����, ����, �밢�� �������� ���� �������� �����ϴ� ���� Ŭ����
 *
 * ����
 * 
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_VerticalMoveStrategy extends P181_DirectionStrategy {

	@Override
	public void move(P181_Ball ball) {
		// ���� ������ ��ġ
		ball.setIntervals(0, P181_Ball.INTERVAL);
		
		while(true) {
			ball.setY(ball.getY() + ball.getyInterval()); // ���� ũ�⸸ŭ �������� �̵�
			if ((ball.getY() < 0 && ball.getyInterval() < 0
					|| ball.getY() + P181_Ball.SIZE > P181_BallFrame.HEIGHT - 40 && ball.getyInterval() > 0) ) {
				// �������� ��迡 �������� �� ���� ��������� �ٲ�
				ball.setIntervals(0, -ball.getyInterval());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
		}
	}
}
