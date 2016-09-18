package chap03.SOLIDPrinciple;

import java.util.Calendar;

/**
 * OCP (üũ����Ʈ p.115)
 *    : �׽�Ʈ ��� ����� Ư�� ���¿� �����ؼ� �����ϴ� ��� ��� (�� - �� 10�ÿ� �����ϴ� �˶� �׽�Ʈ)
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
