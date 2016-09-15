package chap01.objectOrientedModeling;

/**
 * 단방향 연관관계 (체크포인트 p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P28_Main {
	public static void main(String[] args) {
		P28_Student stu = new P28_Student();
		P28_Course course1 = new P28_Course("수학");
		P28_Course course2 = new P28_Course("영어");
		P28_Course course3 = new P28_Course("국어");
		
		stu.registerCourse(course1);
		stu.registerCourse(course2);
		stu.registerCourse(course2);
		stu.registerCourse(course3);
		
		for (P28_Course aa : stu.getCourses()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (P28_Course aa : stu.getCourses()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
