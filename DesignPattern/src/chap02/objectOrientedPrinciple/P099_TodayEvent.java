package chap02.objectOrientedPrinciple;

/**
 * 일반화관계를 통한 캡슐화(정보은닉), 다형성과 동적바인딩 (연습문제4 p.99)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P099_TodayEvent extends P099_DiscountMode {
	@Override
	public double getDiscountRate() {
		return 0.3;
	}
}
