package chap01.objectOrientedModeling;

/**
 * �ܹ��� �������� (üũ����Ʈ p.28)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Page28_Main {
	public static void main(String[] args) {
		Page28_Student stu = new Page28_Student();
		Page28_Course course1 = new Page28_Course("����");
		Page28_Course course2 = new Page28_Course("����");
		Page28_Course course3 = new Page28_Course("����");
		
		stu.registerCourse(course1);
		stu.registerCourse(course2);
		stu.registerCourse(course2);
		stu.registerCourse(course3);
		
		for (Page28_Course aa : stu.getCourses()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (Page28_Course aa : stu.getCourses()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
