package chap05.StrategyPattern;

/**
 * 책을 대여하는 사람의 정보 (Context)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Member {
	private String name;
	private int accPrice;	// 누적대여금액
	
	public P180_Member(String name) {
		this.name = name;
		this.accPrice = 0;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * 누적금액 더하기
	 * @param price
	 */
	public void addAccPrice(int price) {
		accPrice += price;
	}
	
	public int getAccPrice() {
		return accPrice;
	}
}
