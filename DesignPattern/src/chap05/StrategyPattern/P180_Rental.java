package chap05.StrategyPattern;

/**
 * Book�� Member�� ���� Ŭ���� (Context)
 * ȸ���� å�� ��� ������ ���� ������ ���
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Rental {
	private P180_Member member;
	private P180_Book book;
	private P180_PricePolicy pricePolicy;	// ���� ��å ����
	int n;	// å ����
	
	public P180_Rental(P180_Member member, P180_Book book, P180_PricePolicy pricePolicy, int n) {
		this.member = member;
		this.book = book;
		this.pricePolicy = pricePolicy;		// ������å ����
		this.n = n;
		
		this.member.addAccPrice(pricePolicy.calcPrice(book.getPrice(), n));
	}
	
	/**
	 * ���� ��å�� ���� å ���� ���
	 * @return
	 */
	public int getPrice() {
		return pricePolicy.calcPrice(book.getPrice(), n);
	}
}
