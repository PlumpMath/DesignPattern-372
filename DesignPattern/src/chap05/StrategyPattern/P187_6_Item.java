package chap05.StrategyPattern;

/**
 * ������ ����ϱ�
 * 
 * �׽�Ʈ�� �� ���� ������ ���(HD)�� �����ؾ��ϴ� ���ŷο� �ذ��ϵ���..
 * --> Fake������ Ŭ���� ���� �׽�Ʈ�Ҷ��� �ش� ��ü �����Ͽ� �׽�Ʈ
 *
 * @author assu
 * @date 2017. 1. 1.
 */
public class P187_6_Item {
	private String name;
	private int price;
	
	public P187_6_Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}
