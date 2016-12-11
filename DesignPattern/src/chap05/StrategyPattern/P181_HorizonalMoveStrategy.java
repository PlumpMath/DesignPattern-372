package chap05.StrategyPattern;

/**
 * DirectionStrategy 추상클래스를 상속받아 
 * 각각 수직, 수평, 대각선 방향으로 공의 움직임을 경정하는 실제 클래스
 *
 * 수평
 * 
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_HorizonalMoveStrategy extends P181_DirectionStrategy {

	@Override
	public void move(P181_Ball ball) {
		ball.setIntervals(P181_Ball.INTERVAL, 0);
		while(true) {
			ball.setX(ball.getX() + ball.getxInterval());
			if ((ball.getX() < 0 && ball.getxInterval() < 0) || 
					ball.getX() + P181_Ball.SIZE > P181_BallFrame.WIDTH - 15 &
					ball.getxInterval() > 0) {
				ball.setIntervals(-ball.getxInterval(), 0);
			}
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
