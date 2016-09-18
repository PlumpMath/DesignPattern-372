package chap03.SOLIDPrinciple;

import java.util.Calendar;

/**
 * OCP (체크포인트 p.115)
 *    : 테스트 대상 기능이 특정 상태에 의존해서 동작하는 경우 고려 (예 - 밤 10시에 동작하는 알람 테스트)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public class P115_FakeTiemProvider implements P115_TimeProvider {

	private Calendar cal;
	
	public P115_FakeTiemProvider() {
		cal = Calendar.getInstance();
	}
	
	public P115_FakeTiemProvider(int hours) {
		cal = Calendar.getInstance();
		setHours(hours);
	}
	
	@Override
	public void setHours(int hours) {
		cal.set(Calendar.HOUR_OF_DAY, hours);
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
