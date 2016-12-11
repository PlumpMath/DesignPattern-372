package chap05.StrategyPattern;

import java.awt.Color;

/**
 * DrawStrategy �߻� Ŭ������ ��ӹ޾�
 * ���� ������, �Ķ������� ���� ������ �����ϴ� ���� Ŭ����
 *
 * @author assu
 * @date 2016. 11. 19.
 */
public class P181_RedDrawStrategy extends P181_DrawStrategy {

	@Override
	public void draw(P181_Ball ball) {
		ball.setColor(Color.red);
	}

}
