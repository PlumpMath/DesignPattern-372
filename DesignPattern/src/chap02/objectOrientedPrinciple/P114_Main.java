package chap02.objectOrientedPrinciple;

/**
 * OCP(Open-Closed Principle) (체크포인트 p.114)
 *   : checkFuelTank()와 giveWarningSignal()이 변경될 가능성이 크다면?
 *      --> 구체적 행위 방식이 변경되는 것이다. 
 *          해로운 행위 방식을 기존의 코드에 영향을 주기 않고 추가학려면 두 메서드를 개별클래스로 정의.
 *          이를 위해 두 메서드를 protected 접근제어자를 사용해 변경하고 상속 관계를 이용해서
 *          자식 클래스에 새로운 방식의 메서드 정의
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
