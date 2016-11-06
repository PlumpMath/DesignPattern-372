package chap05.StrategyPattern;

/**
 * Strategy Pattern (연습문제 3번, p.180)
 *
 * @author assu
 * @date 2016. 11. 6.
 */
public class P180_Client {
	public static void main(String[] args) {
		P180_Member member1 = new P180_Member("멤버1");
		P180_Member member2 = new P180_Member("멤버2");
		
		P180_Book book1 = new P180_Book("책1", 2016, 1000);
		P180_Book book2 = new P180_Book("책2", 2015, 1200);
		P180_Book book3 = new P180_Book("책3", 2014, 4300);
		
		P180_Rental rental1 = new P180_Rental(member1, book2, new P180_OrdinaryPricePolicy(), 2);
		P180_Rental rental2 = new P180_Rental(member2, book1, new P180_OrdinaryPricePolicy(), 3);
		P180_Rental rental3 = new P180_Rental(member2, book3, new P180_BookDiscountPricePolicy(), 4);
		P180_Rental rental4 = new P180_Rental(member1, book2, new P180_MemberDiscountPricePolicy(), 3);
		
		System.out.println(rental1.getPrice());
		System.out.println(rental2.getPrice());
		System.out.println(rental3.getPrice());
		System.out.println(rental4.getPrice());
	}
}
