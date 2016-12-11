package chap05.StrategyPattern;

import javax.swing.JLabel;

/**
 * 이미지 셋팅
 *    : 이미지셋팅을 위한 인터페이스
 *              
 * @author assu
 * @date 2016. 12. 11.
 */
public abstract class P187_MovingStrategy {
	public abstract void drawImages(JLabel lbl);
}
