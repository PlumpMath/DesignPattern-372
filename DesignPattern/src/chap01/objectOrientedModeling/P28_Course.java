package chap01.objectOrientedModeling;

/**
 * 단방향 연관관계 (체크포인트 p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P28_Course {
	private String name;
	
	public P28_Course(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
