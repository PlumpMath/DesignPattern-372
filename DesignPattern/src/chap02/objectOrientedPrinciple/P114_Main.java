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
public class P114_Main {
	public static void main(String[] args) {
		P114_FuelTankMonitoring fuel = new P114_FuelTankMonitoring();
		
		// default P114_FuelTankMonitoring checkFuelTank()
		// default P114_FuelTankMonitoring giveWarningSignal()
		fuel.checkAndWarn();
	}
}
