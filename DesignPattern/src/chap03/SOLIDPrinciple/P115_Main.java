package chap03.SOLIDPrinciple;

/**
 * OCP (üũ����Ʈ p.115)
 *    : �׽�Ʈ ��� ����� Ư�� ���¿� �����ؼ� �����ϴ� ��� ��� (�� - �� 10�ÿ� �����ϴ� �˶� �׽�Ʈ)
 *
 * @author assu
 * @date 2016. 9. 18.
 */
public class P115_Main {
	public static void main(String[] args) {
		P115_TimeReminder 		sut 		= new P115_TimeReminder();
		P115_FakeTiemProvider 	tProvStub = new P115_FakeTiemProvider();
		
		tProvStub.setHours(23);
		sut.setTimeProvider(tProvStub);
		
		sut.reminder();
	}
}
