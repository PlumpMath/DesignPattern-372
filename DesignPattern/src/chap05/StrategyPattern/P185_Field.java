package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 이미지 셋팅
 *
 * 새로운 이미지를 추가하려면 이번 코드를 수정해야함.
 * 이는 코드가 OCP를 따르지않고 설계되었기 때문.
 * 이를 해결하려면 새로운 이미지 처리 기능을 스트래티지 패턴을 사용해 추가해야함.
 * 
 * @author assu
 * @date 2016. 12. 11.
 */
public class P185_Field extends JPanel implements Runnable {
	/**	 */
	private static final long serialVersionUID = 1356364834071750941L;

	private JLabel lbl;
	private String[] walkingImage= {"BandPhoto_2016_12_07_12_17_52.jpg", "BandPhoto_2016_12_07_12_20_55.jpg"};
	
	public P185_Field() {
		setLayout(new BorderLayout());
		lbl = new JLabel();
		lbl.setIcon(new ImageIcon("./src/BandPhoto_2016_12_07_12_17_52.jpg"));
		add(lbl, BorderLayout.CENTER);
	}
	
	@Override
	public void run() {
		while(true) {
			String[] path = walkingImage;
			for (int i=0; i<path.length; i++) {
				lbl.setIcon(new ImageIcon("./src/" + path[i]));
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) { }
			}
		}
	}
}
