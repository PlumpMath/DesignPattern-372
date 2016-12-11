package chap05.StrategyPattern;

/**
 * 스트레티지 패턴 (연습문제 4번)
 * 
 * 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나, 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_Client {
	/** 공의 처음 시작 위치 */
	private static final int INIT_LOCATION[] = {50,100,150};
	
	public static void main(String[] args) {
		P181_Ball[] balls = new P181_Ball[3];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new P181_Ball(INIT_LOCATION[i], INIT_LOCATION[i]);
			//balls[i].setDirectionStrategy(new P181_HorizonalMoveStrategy());
			//balls[i].setDirectionStrategy(new P181_VerticalMoveStrategy());
			balls[i].setDirectionStrategy(new P181_DiagonalMoveStrategy());
			balls[i].setDrawStrategy(new P181_RedDrawStrategy());
			
			balls[i].start();
		}
		new P181_BallFrame(balls);
	}
}
