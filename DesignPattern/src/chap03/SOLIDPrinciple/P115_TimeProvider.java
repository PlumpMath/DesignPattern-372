package chap03.SOLIDPrinciple;

/**
 * OCP (üũ����Ʈ p.115)
 *    : �׽�Ʈ ��� ����� Ư�� ���¿� �����ؼ� �����ϴ� ��� ��� (�� - �� 10�ÿ� �����ϴ� �˶� �׽�Ʈ)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public interface P115_TimeProvider {
	
	/** �־��� �ð����� ���� */
	public void setHours(int hours);
	
	public int getTime();
}
