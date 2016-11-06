package chap05.StrategyPattern;

/**
 * Book과 Member의 연관 클래스 (Context)
 * 회원이 책을 사는 행위에 대한 데이터 취급
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Rental {
	private P180_Member member;
	private P180_Book book;
	private P180_PricePolicy pricePolicy;	// 가격 정책 참조
	int n;	// 책 갯수
	
	public P180_Rental(P180_Member member, P180_Book book, P180_PricePolicy pricePolicy, int n) {
		this.member = member;
		this.book = book;
		this.pricePolicy = pricePolicy;		// 가격정책 주입
		this.n = n;
		
		this.member.addAccPrice(pricePolicy.calcPrice(book.getPrice(), n));
	}
	
	/**
	 * 가격 정책에 따른 책 가격 계산
	 * @return
	 */
	public int getPrice() {
		return pricePolicy.calcPrice(book.getPrice(), n);
	}
}
