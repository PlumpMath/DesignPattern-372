package chap05.StrategyPattern;

/**
 * ������ �������̽��� ������ ������ Ŭ���� (Concrete Strategy)
 *
 * @author assu
 * @date 2011. 1. 1.
 */
public class P187_6_FakePrinter implements P187_6_ReceiptPrinter {

	private String s;
	
	@Override
	public void print(String s) {
		this.s = s;
	}
	
	public String getReceiptContents() {
		return s;
	}
}
