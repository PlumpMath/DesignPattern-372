package chap05.StrategyPattern;

/**
 * å�� �뿩�ϴ� ����� ���� (Context)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Member {
	private String name;
	private int accPrice;	// �����뿩�ݾ�
	
	public P180_Member(String name) {
		this.name = name;
		this.accPrice = 0;
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * �����ݾ� ���ϱ�
	 * @param price
	 */
	public void addAccPrice(int price) {
		accPrice += price;
	}
	
	public int getAccPrice() {
		return accPrice;
	}
}
