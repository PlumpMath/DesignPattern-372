package chap05.StrategyPattern;

/**
 * 가격 정책에 대한 인터페이스. (Strategy)
 * Book이나 Member 클래스에 따라 가격 정책이 변함. 
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public interface P180_PricePolicy {
	public int calcPrice(int price, int n);
}
