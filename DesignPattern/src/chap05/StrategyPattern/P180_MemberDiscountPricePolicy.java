package chap05.StrategyPattern;

/**
 * 가격 정책 인터페이스를 실제로 구현한 클래스 (Concrete Strategy)
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
