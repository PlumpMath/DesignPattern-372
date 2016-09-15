package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 양방향 연관관계 (체크포인트 p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Page29_Course {
	private ArrayList<Page29_Student> students;
	private String name;
	
	public Page29_Course(String name) {
		this.students = new ArrayList<Page29_Student>();
		this.name = name;
	}
	
	public void addStudent(Page29_Student student) {
		this.students.add(student);
	}
	
	public void removeStudent(Page29_Student student) {
		this.students.remove(student);
	}
	
	public ArrayList<Page29_Student> getStudents() {
		return this.students;
	}
	
	public String getName() {
		return this.name;
	}
}
