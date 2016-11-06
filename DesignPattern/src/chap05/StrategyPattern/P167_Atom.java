package chap05.StrategyPattern;

/**
 * �κ������ (����)
 *   : ������ - ���� �κ��� ���ݰ� �̵������ �����ϴ� ��� ������ �ڵ尡 ����� (OCP����)
 *   
 * @author assu
 * @date 2016. 11. 6.
 */
public class P167_Atom extends P167_Robot {

	public P167_Atom(String name) {
		super(name);
	}
	@Override
	public void attack() {
		System.out.println("I have string punch and can attack with it.");
	}

	@Override
	public void move() {
		System.out.println("I can fly.");
	}
}
