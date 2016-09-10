package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * �ܹ��� ��������
 * 
 * üũ����Ʈ (p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Student {
	private ArrayList<Course> courses;
	
	public Student() {
		this.courses = new ArrayList<Course>();
	}
	
	public void registerCourse(Course course) {
		this.courses.add(course);
	}
	
	public void dropCourse(Course course) {
		if (this.courses.contains(course)) {
			this.courses.remove(course);	
		}
	}
	
	public ArrayList<Course> getCourses() {
		return this.courses;
	}
}
