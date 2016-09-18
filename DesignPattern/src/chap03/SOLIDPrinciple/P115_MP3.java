package chap03.SOLIDPrinciple;

/**
 * OCP (체크포인트 p.115)
 *    : 테스트 대상 기능이 특정 상태에 의존해서 동작하는 경우 고려 (예 - 밤 10시에 동작하는 알람 테스트)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public class P115_MP3 {
	
	public void playSong() {
		System.out.println("Play Song~");
	}
}
