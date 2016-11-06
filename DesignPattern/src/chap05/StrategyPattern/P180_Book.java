package chap05.StrategyPattern;

/**
 * å ���� (Context)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Book {
	private String name;		// ����
	private int publishYear;	// ���ǳ⵵
	private int price;			// ����
	
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
