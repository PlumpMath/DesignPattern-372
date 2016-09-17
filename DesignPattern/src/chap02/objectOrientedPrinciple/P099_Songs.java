package chap02.objectOrientedPrinciple;

/**
 * �Ϲ�ȭ���踦 ���� ĸ��ȭ(��������), �������� �������ε� (��������4 p.99)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P099_Songs {
	private P099_DiscountMode mode;
	
	public void setMode(P099_DiscountMode mode) {
		this.mode = mode;
	}
	
	public double getPrice() {
		return 10.0-(10.0 * this.mode.getDiscountRate());
	}
}
