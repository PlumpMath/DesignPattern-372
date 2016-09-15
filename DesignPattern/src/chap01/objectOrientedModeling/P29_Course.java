package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 양방향 연관관계 (체크포인트 p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P29_Course {
	private ArrayList<P29_Student> students;
	private String name;
	
	public P29_Course(String name) {
		this.students = new ArrayList<P29_Student>();
		this.name = name;
	}
	
	public void addStudent(P29_Student student) {
		this.students.add(student);
	}
	
	public void removeStudent(P29_Student student) {
		this.students.remove(student);
	}
	
	public ArrayList<P29_Student> getStudents() {
		return this.students;
	}
	
	public String getName() {
		return this.name;
	}
}
