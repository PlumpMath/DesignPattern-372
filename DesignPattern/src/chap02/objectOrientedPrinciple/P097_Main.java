package chap02.objectOrientedPrinciple;

/**
 * ���� �ڵ��� ��� ��Ģ (üũ����Ʈ p.97)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P097_Main {
	public static void main(String[] args) {
		P097_Person psn = new P097_Person();
		
		// �����ڷ� ���� ����
		psn.setRole(new P097_Driver());
		psn.doIt();
		
		// ���������� ���� ����
		psn.setRole(new P097_Worker());
		psn.doIt();
	}
}
