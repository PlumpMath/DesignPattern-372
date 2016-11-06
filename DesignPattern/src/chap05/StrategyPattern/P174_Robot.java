package chap05.StrategyPattern;

/**
 * 로봇만들기 (본문)
 *    : 기존 문제점(p.167) - 기존 로봇의 공격과 이동방법을 수정하는 경우 기존의 코드가 변경됨 (OCP위반)
 *    : 해결법 - 외부에서 구체적인 이동방식과 공격방식을 담은 구체적인 클래스들을 은닉한다.
 *              이를 위해 공격과 이동을 위한 인터페이스를 각각 만들고 이들을 실제 실현한 클래스를 생성.
 *              
 * @author assu
 * @date 2016. 11. 6.
 */
public abstract class P174_Robot {
	private String name;
	private P174_MovingStrategy movingStrategy;
	private P174_AttackStrategy attackStrategy;
	
	public P174_Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void move() {
		movingStrategy.move();
	}
	
	public void attack() {
		attackStrategy.attack();
	}
	
	/**
	 * 외부에서 이동방식 제어하기 위한 메서드
	 * (상속이 아닌 집약관계 사용하기때문에 set메서드 사용)
	 * 
	 * @param movingStrategy
	 */
	public void setMovingStrategy(P174_MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	
	/**
	 * 외부에서 공격방식 제어하기 위한 메서드
	 * (상속이 아닌 집약관계 사용하기때문에 set메서드 사용)
	 * 
	 * @param movingStrategy
	 */
	public void setAttackStrategy(P174_AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
}
