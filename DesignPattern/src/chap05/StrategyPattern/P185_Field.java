package chap05.StrategyPattern;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * �̹��� ����
 *
 * ���ο� �̹����� �߰��Ϸ��� �̹� �ڵ带 �����ؾ���.
 * �̴� �ڵ尡 OCP�� �������ʰ� ����Ǿ��� ����.
 * �̸� �ذ��Ϸ��� ���ο� �̹��� ó�� ����� ��Ʈ��Ƽ�� ������ ����� �߰��ؾ���.
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
