package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 단방향 연관관계 (체크포인트 p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Page28_Student {
	private ArrayList<Page28_Course> courses;
	
	public Page28_Student() {
		this.courses = new ArrayList<Page28_Course>();
	}
	
	public void registerCourse(Page28_Course course) {
		this.courses.add(course);
	}
	
	public void dropCourse(Page28_Course course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);	
		}
	}
	
	public ArrayList<Page28_Course> getCourses() {
		return this.courses;
	}
}
