package chap05.StrategyPattern;

import java.awt.Color;

/**
 * DrawStrategy 추상 클래스를 상속받아
 * 각각 빨간색, 파란색으로 공의 색깔을 결정하는 실제 클래스
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_RedDrawStrategy extends P181_DrawStrategy {

	@Override
	public void draw(P181_Ball ball) {
		ball.setColor(Color.red);
	}

}
