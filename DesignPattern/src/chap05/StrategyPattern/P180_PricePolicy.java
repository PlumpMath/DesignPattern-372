package chap05.StrategyPattern;

/**
 * ���� ��å�� ���� �������̽�. (Strategy)
 * Book�̳� Member Ŭ������ ���� ���� ��å�� ����. 
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public interface P180_PricePolicy {
	public int calcPrice(int price, int n);
}
