package chap05.StrategyPattern;

/**
 * 날기(이동)을 실현한 클래스
 *              
 * @author assu
 * @date 2016. 11. 6.
 */
public class P174_Flyingstragety implements P174_MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can fly.");
	}
}
