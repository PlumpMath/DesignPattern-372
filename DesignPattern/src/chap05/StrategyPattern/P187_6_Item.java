package chap05.StrategyPattern;

/**
 * 영수증 출력하기
 * 
 * 테스트할 때 실제 영수증 기기(HD)에 연결해야하는 번거로움 해결하도록..
 * --> Fake프린터 클래스 만들어서 테스트할때는 해당 객체 주입하여 테스트
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
