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
public class Course2 {
	private ArrayList<Student2> students;
	private String name;
	
	public Course2(String name) {
		this.students = new ArrayList<Student2>();
		this.name = name;
	}
	
	public void addStudent(Student2 student) {
		this.students.add(student);
	}
	
	public void removeStudent(Student2 student) {
		this.students.remove(student);
	}
	
	public ArrayList<Student2> getStudents() {
		return this.students;
	}
	
	public String getName() {
		return this.name;
	}
}
