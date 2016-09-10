package chap01.objectOrientedModeling;

/**
 * ����� ��������
 * 
 * üũ����Ʈ (p.29)
 * 
 * @author assu
 * @date 2016.09.10
 */
public class Main2 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		Course2 course1 = new Course2("����");
		Course2 course2 = new Course2("����");
		Course2 course3 = new Course2("����");
		
		stu.regsterCourse(course1);
		stu.regsterCourse(course2);
		stu.regsterCourse(course2);
		stu.regsterCourse(course3);
		
		for (Course2 aa : stu.getCourse()) {
			System.out.println("1 - " + aa.getName());
		}
		
		stu.dropCourse(course2);
		
		for (Course2 aa : stu.getCourse()) {
			System.out.println("2 - " + aa.getName());
		}
	}
}
