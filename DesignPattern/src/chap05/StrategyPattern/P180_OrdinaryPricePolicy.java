package chap05.StrategyPattern;

/**
 * ���� ��å �������̽��� ������ ������ Ŭ���� (Concrete Strategy)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_OrdinaryPricePolicy implements P180_PricePolicy {

	@Override
	public int calcPrice(int price, int n) {
		return price * n;
	}

}
