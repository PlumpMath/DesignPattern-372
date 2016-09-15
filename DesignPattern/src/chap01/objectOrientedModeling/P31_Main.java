package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * 연관클래스 추가 (체크포인트 p.31)

 * @author assu
 * @date 2016. 9. 15.
 */
public class P31_Main {
	public static void main(String[] args) {
		P31_Student stu1 = new P31_Student("이주현1");
		P31_Student stu2 = new P31_Student("이주현2");
		P31_Course  co1  = new P31_Course("영어");
		P31_Course  co2  = new P31_Course("수학");
		
		// 주현1은 영어, 수학
		P31_Transcript trc1 = new P31_Transcript(stu1, co1);
		P31_Transcript trc2 = new P31_Transcript(stu1, co2);
		
		// 주현2는 수학 수강 
		P31_Transcript trc3 = new P31_Transcript(stu2, co2);
		
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
		ArrayList<P31_Course> courses;
		courses = stu1.getCourses();
		
		for (P31_Course co : courses) {
			System.out.println(stu1.getStuName() + ", 과목 : " + co.getCoName());
		}
		
		// 한 과목을 수강한 모든 학생 출력
		ArrayList<P31_Student> students;
		students = co1.getStudents();
		
		for (P31_Student stu : students) {
			System.out.println(co1.getCoName() + ", 학생 : " + stu.getStuName());
		}
	}
}
