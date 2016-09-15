package chap01.objectOrientedModeling;

/**
 * 양방향 연관관계 (체크포인트 p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class P29_Main {
	public static void main(String[] args) {
		P29_Student stu = new P29_Student();
		P29_Course course1 = new P29_Course("수학");
		P29_Course course2 = new P29_Course("영어");
		P29_Course course3 = new P29_Course("국어");
		
		stu.regsterCourse(course1);
		stu.regsterCourse(course2);
		stu.regsterCourse(course2);
		stu.regsterCourse(course3);
		
		for (P29_Course aa : stu.getCourse()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (P29_Course aa : stu.getCourse()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
