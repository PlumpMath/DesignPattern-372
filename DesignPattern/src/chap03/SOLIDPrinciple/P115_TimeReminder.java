package chap03.SOLIDPrinciple;

/**
 * OCP (üũ����Ʈ p.115)
 *    : �׽�Ʈ ��� ����� Ư�� ���¿� �����ؼ� �����ϴ� ��� ��� (�� - �� 10�ÿ� �����ϴ� �˶� �׽�Ʈ)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public class P115_TimeReminder {

	P115_TimeProvider tProv;
	P115_MP3 mp3 = new P115_MP3();
	
	/**
	 * �׽�Ʈ �����̳� ���� �ð��� �����ϴ� �ν��Ͻ� ����
	 * @param tProv
	 */
	public void setTimeProvider(P115_TimeProvider tProv) {
		this.tProv = tProv;
	}
	
	public void reminder() {
		int hours = tProv.getTime();
		if (hours >= 22) {
			mp3.playSong();
		}
	}
}
