package chap05.StrategyPattern;

/**
 * DirectionStrategy 추상클래스를 상속받아 
 * 각각 수직, 수평, 대각선 방향으로 공의 움직임을 경정하는 실제 클래스
 *
 * 수직
 * 
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_VerticalMoveStrategy extends P181_DirectionStrategy {

	@Override
	public void move(P181_Ball ball) {
		// 볼의 시작점 위치
		ball.setIntervals(0, P181_Ball.INTERVAL);
		
		while(true) {
			ball.setY(ball.getY() + ball.getyInterval()); // 볼의 크기만큼 수직으로 이동
			if ((ball.getY() < 0 && ball.getyInterval() < 0
					|| ball.getY() + P181_Ball.SIZE > P181_BallFrame.HEIGHT - 40 && ball.getyInterval() > 0) ) {
				// 프레임의 경계에 도달했을 때 볼의 진행방향을 바꿈
				ball.setIntervals(0, -ball.getyInterval());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) { }
		}
	}
}
