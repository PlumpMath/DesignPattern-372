package chap05.StrategyPattern;

/**
 * 주먹(공격)을 실현한 클래스
 *              
 * @author assu
 * @date 2016. 11. 6.
 */
public class P174_PunchStrategy implements P174_AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have strong punch and can attack with it.");
	}
}
