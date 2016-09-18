package chap03.SOLIDPrinciple;

/**
 * OCP (체크포인트 p.115)
 *    : 테스트 대상 기능이 특정 상태에 의존해서 동작하는 경우 고려 (예 - 밤 10시에 동작하는 알람 테스트)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public class P115_TimeReminder {

	P115_TimeProvider tProv;
	P115_MP3 mp3 = new P115_MP3();
	
	/**
	 * 테스트 스텁이나 실제 시간을 제공하는 인스턴스 주입
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
