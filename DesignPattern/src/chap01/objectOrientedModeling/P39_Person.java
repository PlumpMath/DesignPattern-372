package chap01.objectOrientedModeling;

/**
 * 연관관계 (체크포인트 p.39)
 *
 * @author assu
 * @date 2016. 9. 15.
 */
public class P39_Person {
	private P39_Car car;
	
	public void setCar(P39_Car car) {
		this.car = car;
	}
	
	public P39_Car getCar() {
		return this.car;
	}
}
