package chap05.StrategyPattern;

/**
 * �ȱ�(�̵�)�� ������ Ŭ����
 *              
 * @author assu
 * @date 2016. 11. 6.
 */
public class P174_WalkingStrategy implements P174_MovingStrategy {

	@Override
	public void move() {
		System.out.println("I can only walk.");
	}
}
