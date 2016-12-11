package chap05.StrategyPattern;

/**
 * ��Ʈ��Ƽ�� ���� (�������� 4��)
 * 
 * �ʵ� �ȿ� 2�� �̻��� ���� �����Ѵ�.
 * �� ���� ù°, �¿�� �����̰ų� ��°, ���Ϸ� �����̰ų�, ��°, �밢������ ������ �� �ִ�.
 * �� ���� �������̳� �Ķ������� ĥ������.
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_Client {
	/** ���� ó�� ���� ��ġ */
	private static final int INIT_LOCATION[] = {50,100,150};
	
	public static void main(String[] args) {
		P181_Ball[] balls = new P181_Ball[3];
		for (int i = 0; i < balls.length; i++) {
			balls[i] = new P181_Ball(INIT_LOCATION[i], INIT_LOCATION[i]);
			//balls[i].setDirectionStrategy(new P181_HorizonalMoveStrategy());
			//balls[i].setDirectionStrategy(new P181_VerticalMoveStrategy());
			balls[i].setDirectionStrategy(new P181_DiagonalMoveStrategy());
			balls[i].setDrawStrategy(new P181_RedDrawStrategy());
			
			balls[i].start();
		}
		new P181_BallFrame(balls);
	}
}
