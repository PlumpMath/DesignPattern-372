package chap02.objectOrientedPrinciple;

/**
 * ���� �ڵ��� ��� ��Ģ (üũ����Ʈ p.97)
 *
 * @author assu
 * @date 2016. 9. 17.
 */
public class P97_Main {
	public static void main(String[] args) {
		P97_Person psn = new P97_Person();
		
		// �����ڷ� ���� ����
		psn.setRole(new P97_Driver());
		psn.doIt();
		
		// ���������� ���� ����
		psn.setRole(new P97_Worker());
		psn.doIt();
	}
}
