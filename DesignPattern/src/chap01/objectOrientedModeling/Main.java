package chap01.objectOrientedModeling;

/**
 * 단방향 연관관계
 * 
 * 체크포인트 (p.28)
 * 
 * @author assu
 * @date 2016.09.10 
 */
public class Main {
	public static void main(String[] args) {
		Student stu = new Student();
		Course course1 = new Course("수학");
		Course course2 = new Course("영어");
		Course course3 = new Course("국어");
		
		stu.registerCourse(course1);
		stu.registerCourse(course2);
		stu.registerCourse(course2);
		stu.registerCourse(course3);
		
		for (Course aa : stu.getCourses()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (Course aa : stu.getCourses()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
