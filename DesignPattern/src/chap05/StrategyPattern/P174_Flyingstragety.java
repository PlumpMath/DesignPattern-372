package chap05.StrategyPattern;

/**
 * ����(�̵�)�� ������ Ŭ����
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
