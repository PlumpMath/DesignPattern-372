package chap05.StrategyPattern;

/**
 * �κ������ (����)
 *    : ���� ������(p.167) - ���� �κ��� ���ݰ� �̵������ �����ϴ� ��� ������ �ڵ尡 ����� (OCP����)
 *    : �ذ�� - �ܺο��� ��ü���� �̵���İ� ���ݹ���� ���� ��ü���� Ŭ�������� �����Ѵ�.
 *              �̸� ���� ���ݰ� �̵��� ���� �������̽��� ���� ����� �̵��� ���� ������ Ŭ������ ����.
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
	 * �ܺο��� �̵���� �����ϱ� ���� �޼���
	 * (����� �ƴ� ������� ����ϱ⶧���� set�޼��� ���)
	 * 
	 * @param movingStrategy
	 */
	public void setMovingStrategy(P174_MovingStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}
	
	/**
	 * �ܺο��� ���ݹ�� �����ϱ� ���� �޼���
	 * (����� �ƴ� ������� ����ϱ⶧���� set�޼��� ���)
	 * 
	 * @param movingStrategy
	 */
	public void setAttackStrategy(P174_AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}
}
