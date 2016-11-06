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
