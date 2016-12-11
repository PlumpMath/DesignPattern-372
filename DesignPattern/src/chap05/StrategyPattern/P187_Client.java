package chap05.StrategyPattern;

/**
 * 스트레티지 패턴 (연습문제 5번, 스트래티지 패턴 적용)
 * 
 * 이미지 연속해서 보여주기
 * 
 * @author assu
 * @date 2016. 12. 11.
 */
public class P187_Client {
	public static void main(String[] args) {
		P187_Field field = new P187_Field();
		//field.setMovingStrategy(new P187_WalkingStrategy());
		field.setMovingStrategy(new P187_RunningStrategy());
		new P187_Running(field);
	}
}
