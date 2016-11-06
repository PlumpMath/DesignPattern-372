package chap05.StrategyPattern;

/**
 * 로봇만들기 (본문)
 *   : 문제점 - 기존 로봇의 공격과 이동방법을 수정하는 경우 기존의 코드가 변경됨 (OCP위반)
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
