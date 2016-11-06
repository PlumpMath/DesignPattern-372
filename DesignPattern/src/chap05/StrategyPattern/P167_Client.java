package chap05.StrategyPattern;

/**
 * 로봇만들기 (본문)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P167_Client {
	public static void main(String[] args) {
		P167_Robot taekwonV = new P167_TaekwonV("TaekwonV");
		P167_Robot atom = new P167_Atom("Atom");
		
		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println();
		
		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();
	}
}
