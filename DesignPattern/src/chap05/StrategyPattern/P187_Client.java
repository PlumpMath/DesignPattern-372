package chap05.StrategyPattern;

/**
 * ��Ʈ��Ƽ�� ���� (�������� 5��, ��Ʈ��Ƽ�� ���� ����)
 * 
 * �̹��� �����ؼ� �����ֱ�
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
