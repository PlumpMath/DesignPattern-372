package chap05.StrategyPattern;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 뛰는 모습을 실현한 클래스
 *              
 * @author assu
 * @date 2016. 12. 11.
 */
public class P187_RunningStrategy extends P187_MovingStrategy {
private String[] walkingImage= {"BandPhoto_2016_12_07_12_17_52.jpg", "BandPhoto_2016_12_07_12_20_55.jpg", "BandPhoto_2016_12_07_12_17_52.jpg"};
	
	@Override
	public void drawImages(JLabel lbl) {
		lbl.setIcon(new ImageIcon("./src/BandPhoto_2016_12_07_12_17_52.jpg"));
		
		while(true) {
			String[] path = walkingImage;
			for (int i=0; i<path.length; i++) {
				lbl.setIcon(new ImageIcon("./src/" + path[i]));
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) { }
			}
		}
	}
}
