package chap03.SOLIDPrinciple;

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
public class P114_Main2 {
	public static void main(String[] args) {
		P114_FuelTankMonitoring2 fuel = new P114_FuelTankMonitoringWith2();
		
		// new P114_FuelTankMonitoring checkFuelTank()
		// new P114_FuelTankMonitoring giveWarningSignal()
		fuel.checkAndWarn();
	}
}
