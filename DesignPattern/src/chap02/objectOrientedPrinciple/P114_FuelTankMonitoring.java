package chap02.objectOrientedPrinciple;

/**
 * OCP(Open-Closed Principle) (üũ����Ʈ p.114)
 *   : checkFuelTank()�� giveWarningSignal()�� ����� ���ɼ��� ũ�ٸ�?
 *      --> ��ü�� ���� ����� ����Ǵ� ���̴�. 
 *          �طο� ���� ����� ������ �ڵ忡 ������ �ֱ� �ʰ� �߰��з��� �� �޼��带 ����Ŭ������ ����.
 *          �̸� ���� �� �޼��带 protected ���������ڸ� ����� �����ϰ� ��� ���踦 �̿��ؼ�
 *          �ڽ� Ŭ������ ���ο� ����� �޼��� ����
 *          
 *          ó���� P14_FuelTankMonitoring2.java
 *          
 * @author assu
 * @date 2016. 9. 18.
 */
public class P114_FuelTankMonitoring {
	// ...
	
	public void checkAndWarn() {
		// ...
		
		if (checkFuelTank()) {
			giveWarningSignal();
		}
	} 
	
	private boolean checkFuelTank () {
		// ...
		System.out.println("default P114_FuelTankMonitoring checkFuelTank()");
		return true;
	}
	
	private void giveWarningSignal() {
		// ...
		System.out.println("default P114_FuelTankMonitoring giveWarningSignal()");
	}
}
