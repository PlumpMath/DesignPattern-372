package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 양방향 연관관계 (체크포인트 p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Page29_Student {
	private ArrayList<Page29_Course> courses;
	String name; 
	 
	public Page29_Student() {
		this.courses = new ArrayList<Page29_Course>();
	}
	
	public void regsterCourse(Page29_Course course) {
		this.courses.add(course);
		course.addStudent(this);
	}
	
	public void dropCourse(Page29_Course course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public ArrayList<Page29_Course> getCourse() {
		return this.courses;
	}
}
