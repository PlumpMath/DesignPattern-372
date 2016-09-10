package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 양방향 연관관계
 * 
 * 체크포인트 (p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Student2 {
	private ArrayList<Course2> courses;
	String name;
	
	public Student2() {
		this.courses = new ArrayList<Course2>();
	}
	
	public void regsterCourse(Course2 course) {
		this.courses.add(course);
		course.addStudent(this);
	}
	
	public void dropCourse(Course2 course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);
			course.removeStudent(this);
		}
	}
	
	public ArrayList<Course2> getCourse() {
		return this.courses;
	}
}
