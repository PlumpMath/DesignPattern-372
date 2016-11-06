package chap05.StrategyPattern;

/**
 * 책 정보 (Context)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Book {
	private String name;		// 서명
	private int publishYear;	// 출판년도
	private int price;			// 가격
	
	public P180_Book(String name, int publishYear, int price) {
		this.name = name;
		this.publishYear = publishYear;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPublishYear() {
		return publishYear;
	}
	
	public int getPrice() {
		return price;
	}
}
