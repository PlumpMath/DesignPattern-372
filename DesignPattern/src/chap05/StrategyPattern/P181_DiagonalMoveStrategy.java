package chap05.StrategyPattern;

/**
 * DirectionStrategy 추상클래스를 상속받아 
 * 각각 수직, 수평, 대각선 방향으로 공의 움직임을 경정하는 실제 클래스
 *
 * 대각선
 * 
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_DiagonalMoveStrategy extends P181_DirectionStrategy {

	@Override
	public void move(P181_Ball ball) {
		// 볼의 시작점을 설정함.
		ball.setIntervals(P181_Ball.INTERVAL, P181_Ball.INTERVAL);
		
		while(true) {
			// 대각선 방향으로 볼의 크기만큼 볼을 이동함.
			ball.setX(ball.getX() + ball.getxInterval());
			ball.setY(ball.getY() + ball.getyInterval());
			
			// 프레임의 경계에 도달했을 때 볼의 진행방향을 바꿈
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
