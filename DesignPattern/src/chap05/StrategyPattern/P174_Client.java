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
public class P174_Client {
	public static void main(String[] args) {
		P174_Robot taekwonV = new P174_TaekwonV("TaekwonV");
		P174_Atom atom = new P174_Atom("Atom");
		
		taekwonV.setMovingStrategy(new P174_WalkingStrategy());
		taekwonV.setAttackStrategy(new P174_MissileStrategy());
		
		atom.setMovingStrategy(new P174_Flyingstragety());
		atom.setAttackStrategy(new P174_PunchStrategy());
		
		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
