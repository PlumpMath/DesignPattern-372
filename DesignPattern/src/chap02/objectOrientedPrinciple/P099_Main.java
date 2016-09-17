package chap02.objectOrientedPrinciple;

/**
 * 일반화관계를 통한 캡슐화(정보은닉), 다형성과 동적바인딩 (연습문제4 p.99)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P099_Main {
	public static void main(String[] args) {
		P099_Songs s1 = new P099_Songs();
		P099_Songs s2 = new P099_Songs();
		P099_Songs s3 = new P099_Songs();
		
		s1.setMode(new P099_NonDiscounted());
		s2.setMode(new P099_OnSale());
		s3.setMode(new P099_TodayEvent());
		
		P099_CartForSongs cart = new P099_CartForSongs();
		cart.add(s1);
		cart.add(s2);
		cart.add(s3);
		
		System.out.println(cart.calculateTotalPrice());
	}
}
