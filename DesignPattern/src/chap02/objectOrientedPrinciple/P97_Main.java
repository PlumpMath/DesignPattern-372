package chap02.objectOrientedPrinciple;

/**
 * 피터 코드의 상속 규칙 (체크포인트 p.97)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P97_Main {
	public static void main(String[] args) {
		P97_Person psn = new P97_Person();
		
		// 운전자로 역할 변경
		psn.setRole(new P97_Driver());
		psn.doIt();
		
		// 종업원으로 역할 변경
		psn.setRole(new P97_Worker());
		psn.doIt();
	}
}
