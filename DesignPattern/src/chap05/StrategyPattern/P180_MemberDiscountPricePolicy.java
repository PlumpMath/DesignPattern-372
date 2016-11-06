package chap05.StrategyPattern;

/**
 * ���� ��å �������̽��� ������ ������ Ŭ���� (Concrete Strategy)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_MemberDiscountPricePolicy implements P180_PricePolicy {

	@Override
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.9);
	}

}
