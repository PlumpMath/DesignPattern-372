package chap05.StrategyPattern;

/**
 * 프린터 인터페이스를 실제로 구현한 클래스 (Concrete Strategy)
 *
 * @author assu
 * @date 2011. 1. 1.
 */
public class P187_6_HDPrinter implements P187_6_ReceiptPrinter {

	@Override
	public void print(String s) {
		// 실제 영수증 출력하는 코드
		System.out.println(s);
	}
}
