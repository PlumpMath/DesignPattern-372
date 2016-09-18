package chap03.SOLIDPrinciple;

/**
 * OCP (체크포인트 p.115)
 *    : 테스트 대상 기능이 특정 상태에 의존해서 동작하는 경우 고려 (예 - 밤 10시에 동작하는 알람 테스트)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public interface P115_TimeProvider {
	
	/** 주어진 시간으로 설정 */
	public void setHours(int hours);
	
	public int getTime();
}
