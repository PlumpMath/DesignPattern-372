package chap01.objectOrientedModeling;

import java.util.ArrayList;

/**
 * ����Ŭ���� �߰� (üũ����Ʈ p.31)

 * @author assu
 * @date 2016. 9. 15.
 */
public class P31_Main {
	public static void main(String[] args) {
		P31_Student stu1 = new P31_Student("������1");
		P31_Student stu2 = new P31_Student("������2");
		P31_Course  co1  = new P31_Course("����");
		P31_Course  co2  = new P31_Course("����");
		
		// ����1�� ����, ����
		P31_Transcript trc1 = new P31_Transcript(stu1, co1);
		P31_Transcript trc2 = new P31_Transcript(stu1, co2);
		
		// ����2�� ���� ���� 
		P31_Transcript trc3 = new P31_Transcript(stu2, co2);
		
		// ����1�� 2016�⿡ ���� A+, ���� A ���
		trc1.setDate("2016");
		trc1.setGrade("A+");
		trc2.setDate("2016");
		trc2.setGrade("A");
		
		// ����1�� 2015�⿡ ���� B, ���� A ���
		trc1.setDate("2015");
		trc1.setGrade("B");
		trc2.setDate("2015");
		trc2.setGrade("A");
		
		// ����2�� 2016�⿡ ���� B+ ���
		trc3.setDate("2016");
		trc3.setGrade("B+");
		
		// �� �ѻ��� ������ ��� ���� ���
		ArrayList<P31_Course> courses;
		courses = stu1.getCourses();
		
		for (P31_Course co : courses) {
			System.out.println(stu1.getStuName() + ", ���� : " + co.getCoName());
		}
		
		// �� ������ ������ ��� �л� ���
		ArrayList<P31_Student> students;
		students = co1.getStudents();
		
		for (P31_Student stu : students) {
			System.out.println(co1.getCoName() + ", �л� : " + stu.getStuName());
		}
	}
}
