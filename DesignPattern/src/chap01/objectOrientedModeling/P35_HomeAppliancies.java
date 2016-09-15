package chap01.objectOrientedModeling;

/**
 * 일반화관계(=상속관계) (체크포인트 p.35)
 *
 * @author assu
 * @date 2016. 9. 15.
 */
public abstract class P35_HomeAppliancies {
	private Integer serialNo;
	private String manufacturer;
	private Integer Year;
	
	public abstract void turnOff();
	public abstract void turnOn();
}
