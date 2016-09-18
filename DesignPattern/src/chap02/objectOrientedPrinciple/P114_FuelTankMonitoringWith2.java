package chap02.objectOrientedPrinciple;

/**
 * OCP(Open-Closed Principle) (üũ����Ʈ p.114)
 *   : checkFuelTank()�� giveWarningSignal()�� ����� ���ɼ��� ũ�ٸ�?
 *      --> ��ü�� ���� ����� ����Ǵ� ���̴�. 
 *          �طο� ���� ����� ������ �ڵ忡 ������ �ֱ� �ʰ� �߰��з��� �� �޼��带 ����Ŭ������ ����.
 *          �̸� ���� �� �޼��带 protected ���������ڸ� ����� �����ϰ� ��� ���踦 �̿��ؼ�
 *          �ڽ� Ŭ������ ���ο� ����� �޼��� ����
 *          
 * @author assu
 * @date 2016. 9. 18.
 */
public class P114_FuelTankMonitoringWith2 extends P114_FuelTankMonitoring2 {
	// ...
	
	protected boolean checkFuelTank () {	// new ���
		// ...
		System.out.println("new P114_FuelTankMonitoring checkFuelTank()");
		return true;
	}
	
	protected void giveWarningSignal() {	// new ���
		// ...
		System.out.println("new P114_FuelTankMonitoring giveWarningSignal()");
	}
}
