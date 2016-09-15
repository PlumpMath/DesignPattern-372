package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 단방향 연관관계 (체크포인트 p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P28_Student {
	private ArrayList<P28_Course> courses;
	
	public P28_Student() {
		this.courses = new ArrayList<P28_Course>();
	}
	
	public void registerCourse(P28_Course course) {
		this.courses.add(course);
	}
	
	public void dropCourse(P28_Course course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);	
		}
	}
	
	public ArrayList<P28_Course> getCourses() {
		return this.courses;
	}
}
