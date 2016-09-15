package chap01.objectOrientedModeling;

/**
 * ����� �������� (üũ����Ʈ p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Page29_Main {
	public static void main(String[] args) {
		Page29_Student stu = new Page29_Student();
		Page29_Course course1 = new Page29_Course("����");
		Page29_Course course2 = new Page29_Course("����");
		Page29_Course course3 = new Page29_Course("����");
		
		stu.regsterCourse(course1);
		stu.regsterCourse(course2);
		stu.regsterCourse(course2);
		stu.regsterCourse(course3);
		
		for (Page29_Course aa : stu.getCourse()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (Page29_Course aa : stu.getCourse()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
