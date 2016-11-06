package chap05.StrategyPattern;

/**
 * 로봇만들기 (본문)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public abstract class P167_Robot {
	private String name;
	
	public P167_Robot(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void attack();
	public abstract void move();
}
