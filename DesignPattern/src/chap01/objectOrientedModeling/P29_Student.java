package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 양방향 연관관계 (체크포인트 p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P29_Student {
	private ArrayList<P29_Course> courses;
	String name; 
	 
	public P29_Student() {
		this.courses = new ArrayList<P29_Course>();
	}
	
	public void regsterCourse(P29_Course course) {
		this.courses.add(course);
		course.addStudent(this);
	}
	
	public void dropCourse(P29_Course course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public ArrayList<P29_Course> getCourse() {
		return this.courses;
	}
}
