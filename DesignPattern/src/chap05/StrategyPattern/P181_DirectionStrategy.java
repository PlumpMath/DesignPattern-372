package chap05.StrategyPattern;

/**
 * 공의 방향을 결정하는 전략 추상 클래스
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public abstract class P181_DirectionStrategy {
	public abstract void move(P181_Ball ball);
}
