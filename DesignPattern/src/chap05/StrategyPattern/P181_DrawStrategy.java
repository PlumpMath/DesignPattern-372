package chap05.StrategyPattern;

/**
 * 공을 그리는 방법(색깔)을 결정하는 전략 추상 클래스
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public abstract class P181_DrawStrategy {
	public abstract void draw(P181_Ball ball);
}
