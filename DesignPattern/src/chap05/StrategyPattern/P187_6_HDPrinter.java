package chap05.StrategyPattern;

/**
 * ������ �������̽��� ������ ������ Ŭ���� (Concrete Strategy)
 *
 * @author assu
 * @date 2011. 1. 1.
 */
public class P187_6_HDPrinter implements P187_6_ReceiptPrinter {

	@Override
	public void print(String s) {
		// ���� ������ ����ϴ� �ڵ�
		System.out.println(s);
	}
}
