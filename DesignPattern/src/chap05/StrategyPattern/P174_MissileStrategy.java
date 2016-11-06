package chap05.StrategyPattern;

/**
 * 미사일(공격)을 실현한 클래스
 *              
 * @author assu
 * @date 2016. 11. 6.
 */
public class P174_MissileStrategy implements P174_AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I hane Missile and can attack with it.");
	}
}
