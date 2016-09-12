package chap01.objectOrientedModeling;

/**
 * �ܹ��� ��������
 * 
 * üũ����Ʈ (p.28)
 * 
 * @author assu
 * @date 2016.09.10 
 */
public class Main {
	public static void main(String[] args) {
		Student stu = new Student();
		Course course1 = new Course("����");
		Course course2 = new Course("����");
		Course course3 = new Course("����");
		
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
