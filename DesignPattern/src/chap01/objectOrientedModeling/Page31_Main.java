package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 연관클래스 추가 (체크포인트 p.31)

 * @author assu
 * @date 2016. 9. 15.
 */
public class Page31_Main {
	public static void main(String[] args) {
		Page31_Student stu1 = new Page31_Student("이주현1");
		Page31_Student stu2 = new Page31_Student("이주현2");
		Page31_Course  co1  = new Page31_Course("영어");
		Page31_Course  co2  = new Page31_Course("수학");
		
		// 주현1은 영어, 수학
		Page31_Transcript trc1 = new Page31_Transcript(stu1, co1);
		Page31_Transcript trc2 = new Page31_Transcript(stu1, co2);
		
		// 주현2는 수학 수강 
		Page31_Transcript trc3 = new Page31_Transcript(stu2, co2);
		
		// 주현1은 2016년에 영어 A+, 수학 A 취득
		trc1.setDate("2016");
		trc1.setGrade("A+");
		trc2.setDate("2016");
		trc2.setGrade("A");
		
		// 주현1은 2015년에 영어 B, 수학 A 취득
		trc1.setDate("2015");
		trc1.setGrade("B");
		trc2.setDate("2015");
		trc2.setGrade("A");
		
		// 주현2는 2016년에 수학 B+ 취득
		trc3.setDate("2016");
		trc3.setGrade("B+");
		
		// 한 한생이 수강한 모든 과목 출력
		ArrayList<Page31_Course> courses;
		courses = stu1.getCourses();
		
		for (Page31_Course co : courses) {
			System.out.println(stu1.getStuName() + ", 과목 : " + co.getCoName());
		}
		
		// 한 과목을 수강한 모든 학생 출력
		ArrayList<Page31_Student> students;
		students = co1.getStudents();
		
		for (Page31_Student stu : students) {
			System.out.println(co1.getCoName() + ", 학생 : " + stu.getStuName());
		}
	}
}
